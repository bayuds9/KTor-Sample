package com.flowerencee9.marketplace.screens.auth.createpassword

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.ActivityAuthBinding
import com.flowerencee9.marketplace.model.data.request.ChangePasswordRequest
import com.flowerencee9.marketplace.model.data.request.CreatePasswordRequest
import com.flowerencee9.marketplace.screens.main.MainActivity
import com.flowerencee9.marketplace.support.customui.InputView
import com.flowerencee9.marketplace.support.utils.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CreatePasswordActivity : AppCompatActivity() {
    companion object {
        fun myIntent(context: Context, token: String, type: Int) =
            Intent(context, CreatePasswordActivity::class.java).apply {
                putExtra(EXTRA_TOKEN, token)
                putExtra(EXTRA_TYPE, type)
            }

        private const val EXTRA_TOKEN = "EXTRA_TOKEN"
        private const val EXTRA_TYPE = "EXTRA_TYPE"

        enum class PWD { CREATE, CHANGE }

        private val TAG = CreatePasswordActivity::class.java.simpleName
    }

    private lateinit var binding: ActivityAuthBinding
    private val viewModel by viewModels<CreatePasswordViewModel>()

    private val token by lazy { intent.getStringExtra(EXTRA_TOKEN) ?: "" }
    private val type by lazy {
        when (intent.getIntExtra(EXTRA_TYPE, 0)) {
            1 -> PWD.CHANGE
            else -> PWD.CREATE
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
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
        with(binding) {
            tbToolbar.setTitle(
                if (type == PWD.CREATE) getString(R.string.new_password) else getString(
                    R.string.change_password
                )
            )
            containerProfile.toHide()
            inputName.toHide()
            inputEmail.toHide()
            inputPhone.toHide()
            inputDOB.toHide()
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
            btnAction.apply {
                text =
                    if (type == PWD.CREATE) getString(R.string.new_password) else getString(
                        R.string.change_password
                    )
                setOnClickListener {
                    if (type == PWD.CREATE) createNewPassword()
                    else showPasswordConfirmation()
                }
            }
        }
    }

    private fun showPasswordConfirmation() {
        val popupListener = object : OptionPopUpDialogChangeValueListener {
            override fun onFirstOptionClick(text: String) {
                changePassword(text)
                this@CreatePasswordActivity.closeOptionsMenu()
            }

            override fun onSecondOptionClick() {
                this@CreatePasswordActivity.closeOptionsMenu()
            }

        }
        showPopUpDialogChangeValue(
            popupListener,
            getString(R.string.hint_password_confirm),
            getString(R.string.hint_password),
            getString(R.string.confirm),
            getString(R.string.cancel)
        )
    }

    private fun changePassword(oldPassword: String) {
        val request =
            ChangePasswordRequest(getUserId(), oldPassword, binding.inputPassword.getText())
        viewModel.changePassword(request)
        viewModel.status.observe(this) {
            binding.root.snackBar(it.statusMessage)
            if (it.success) {
                CoroutineScope(Dispatchers.IO).launch {
                    delay(2000)
                    finish()
                }
            }
        }
    }

    private fun setupButtonStates() {
        with(binding) {
            btnAction.isEnabled =
                inputPassword.isValid() && (inputPassword.getText() == inputConfirm.getText())
        }
    }

    private fun createNewPassword() {
        val request = CreatePasswordRequest(binding.inputPassword.getText(), token)
        viewModel.createPassword(request)
        viewModel.status.observe(this@CreatePasswordActivity) {
            binding.root.snackBar(it.statusMessage)
            if (it.success) {
                CoroutineScope(Dispatchers.IO).launch {
                    delay(2000)
                    startActivity(
                        MainActivity.myIntent(
                            this@CreatePasswordActivity
                        )
                    )
                }
            }
        }
    }

    override fun onBackPressed() {
        val cancelListener = object : AlertDialogListener {
            override fun onPositive() {
                if (type == PWD.CREATE) startActivity(MainActivity.myIntent(this@CreatePasswordActivity))
                finish()
            }

            override fun onNegative() {}

        }
        showAlertDialog(
            cancelListener,
            getString(R.string.cancellation),
            getString(R.string.alert_cancellation)
        )
    }
}