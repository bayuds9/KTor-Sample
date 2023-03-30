package com.flowerencee9.marketplace.screens.auth.register

import android.Manifest
import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.ActivityAuthBinding
import com.flowerencee9.marketplace.model.data.request.MerchantRegisterRequest
import com.flowerencee9.marketplace.model.data.request.RegisterRequest
import com.flowerencee9.marketplace.support.customui.InputView
import com.flowerencee9.marketplace.support.utils.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class RegisterActivity : AppCompatActivity() {
    companion object {
        fun myIntent(context: Context) = Intent(context, RegisterActivity::class.java)
        private val TAG = RegisterActivity::class.java.simpleName

        private val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)
        private const val REQUEST_CODE_PERMISSIONS = 10
    }

    private lateinit var binding: ActivityAuthBinding

    private val viewModel by viewModels<RegisterViewModel>()

    private var accountType: Int? = null
    private lateinit var currentPhotoPath: String
    private var path = ""

    private lateinit var cal: Calendar
    private var selectedDate = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (!allPermissionsGranted()) {
            ActivityCompat.requestPermissions(
                this,
                REQUIRED_PERMISSIONS,
                REQUEST_CODE_PERMISSIONS
            )
        }
        setupView()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
            if (!allPermissionsGranted()) {
                Toast.makeText(
                    this,
                    "Permission not granted",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            }
        }
    }

    private fun allPermissionsGranted() = REQUIRED_PERMISSIONS.all {
        ContextCompat.checkSelfPermission(baseContext, it) == PackageManager.PERMISSION_GRANTED
    }

    private fun setupView() {
        cal = Calendar.getInstance()
        val dateSetListener =
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val myFormat = "yyyy-MM-dd"
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                selectedDate = sdf.format(cal.time)
                with(binding.inputDOB) {
                    setValue(selectedDate)
                }
                setupButtonStates()
            }

        val dateListener = View.OnClickListener {
            DatePickerDialog(
                this, dateSetListener,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
        val leftClick: () -> Unit = {
            onBackPressed()
        }
        val nameListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }
        val emailListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }
        val phoneListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }
        val addressListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }
        val passwordListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }
        val confirmListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }
        val imageListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

            override fun afterClickListener() {
                super.afterClickListener()
                openDialogSelector()
            }

        }

        val dobListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

            override fun afterClickListener() {
                super.afterClickListener()
                openDateSelector()
            }
        }

        val mNameListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }

        val mAddressListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }

        with(binding) {
            tbToolbar.apply {
                setTitle(getString(R.string.register_title))
                setLeftItem(R.drawable.ic_baseline_arrow_back, leftClick)
            }
            inputName.apply {
                setListener(nameListener)
                setHint(getString(R.string.hint_name))
                setInpuType(InputView.TYPE.TEXT)
            }
            inputEmail.apply {
                setListener(emailListener)
                setHint(getString(R.string.hint_email))
                setInpuType(InputView.TYPE.EMAIL)
            }
            inputPhone.apply {
                setListener(phoneListener)
                setHint(getString(R.string.hint_phone))
                setInpuType(InputView.TYPE.PHONE)
            }
            inputAddress.apply {
                setListener(addressListener)
                setHint(getString(R.string.hint_address))
                setInpuType(InputView.TYPE.TEXT)
            }
            inputPassword.apply {
                setListener(passwordListener)
                setHint(getString(R.string.hint_password))
                setVisiblePassword()
            }
            inputConfirm.apply {
                setListener(confirmListener)
                setHint(getString(R.string.hint_password_confirm))
                setVisiblePassword()
            }
            inputImage.apply {
                setListener(imageListener)
                setHint(getString(R.string.hint_image))
                setInpuType(InputView.TYPE.SELECTOR)
                setDisable()
            }
            inputDOB.apply {
                setListener(dobListener)
                setHint(getString(R.string.profile_dob))
                setInpuType(InputView.TYPE.SELECTOR)
                setDisable()
                performListener(dateListener)
            }
            merchantName.apply {
                setListener(mNameListener)
                setHint(getString(R.string.hint_merchant_name))
                setInpuType(InputView.TYPE.TEXT)
            }
            merchantAddress.apply {
                setListener(mAddressListener)
                setHint(getString(R.string.hint_merchant_address))
                setInpuType(InputView.TYPE.TEXT)
            }

            selectorType.addOnButtonCheckedListener { _, checkedId, isChecked ->
                setupButtonStates()
                if (isChecked) {
                    accountType = when (checkedId) {
                        R.id.btnCustomer -> {
                            containerMerchant.toHide()
                            0
                        }
                        R.id.btnSeller -> {
                            containerMerchant.toShow()
                            1
                        }
                        else -> {
                            containerMerchant.toHide()
                            null
                        }
                    }
                } else accountType = null
                Log.d(TAG, "type $accountType")
            }
            btnAction.setOnClickListener {
                registerUser()
            }
        }
    }

    private fun openDateSelector() {

    }

    private fun registerUser() {
        with(binding) {
            val merRegisterReq = if (accountType == 1) MerchantRegisterRequest(
                merchantName.getText(),
                merchantAddress.getText()
            ) else null

            val registerReq = RegisterRequest(
                inputName.getText(),
                inputEmail.getText(),
                inputPassword.getText(),
                accountType!!,
                inputPhone.getText(),
                inputAddress.getText(),
                inputImage.getText(),
                merRegisterReq
            )

            Log.d(TAG, "request account $registerReq")
            viewModel.registerUser(registerReq)
            viewModel.status.observe(this@RegisterActivity) {
                Log.d(TAG, "status value $it")
                root.snackBar(it.statusMessage)
                if (it.success) {
                    CoroutineScope(Dispatchers.IO).launch {
                        delay(2000)
                        finish()
                    }
                }
            }
        }
    }

    private fun setupButtonStates() {
        with(binding) {
            btnAction.isEnabled =
                when (accountType) {
                    0 -> inputName.isValid() && inputEmail.isValid() && inputPhone.isValid() && inputAddress.isValid() && (inputPassword.getText() == inputConfirm.getText())
                    1 -> inputName.isValid() && inputEmail.isValid() && inputPhone.isValid() && inputAddress.isValid() && merchantName.isValid() && path.isNotEmpty() && merchantAddress.isValid() && inputPassword.isValid() && (inputPassword.getText() == inputConfirm.getText())
                    else -> false
                }
        }
    }

    private fun openDialogSelector() {
        val option = arrayOf(
            getString(R.string.gallery),
            getString(R.string.camera),
            getString(R.string.cancel)
        )
        val window: AlertDialog.Builder = AlertDialog.Builder(this)
        window.setTitle(getString(R.string.select_image_source))
        window.setItems(option) { _, which ->
            when (which) {
                0 -> openGallery()
                1 -> openCamera()
                else -> binding.root.snackBar("Aksi dibatalkan")
            }
        }

        window.show()
    }

    private fun openCamera() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        intent.resolveActivity(packageManager)

        createTempFile(application).also {
            val photoURI: Uri = FileProvider.getUriForFile(
                this,
                "com.yashinya.eumkmpurworejo",
                it
            )
            currentPhotoPath = it.absolutePath
            intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
            launcherIntentCamera.launch(intent)
        }
    }

    private val launcherIntentCamera = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        if (it.resultCode == RESULT_OK) {
            val myFile = File(currentPhotoPath)
            val result = BitmapFactory.decodeFile(myFile.path)
            path = myFile.path
            Log.d(TAG, "camera ${myFile.path}")
            binding.inputImage.setValue(myFile.path)
            setupButtonStates()
        }
    }

    private fun openGallery() {
        val intent = Intent()
        intent.apply {
            action = Intent.ACTION_GET_CONTENT
            type = "image/*"
        }
        val chooser = Intent.createChooser(intent, "Choose a Picture")
        launcherIntentGallery.launch(chooser)
    }

    private val launcherIntentGallery = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            val selectedImg = result.data?.data as Uri
            val myFile = uriToFile(selectedImg, this)
            path = myFile.path
            Log.d(TAG, "gallery ${myFile.path}")
            binding.inputImage.setValue(myFile.path)
            setupButtonStates()
        }
    }

    override fun onBackPressed() {
        val cancelListener = object : AlertDialogListener {
            override fun onPositive() {
                finish()
            }

            override fun onNegative() {}

        }
        showAlertDialog(
            cancelListener,
            getString(R.string.cancellation),
            getString(R.string.register_cancellation_desc)
        )
    }
}