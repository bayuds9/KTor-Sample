package com.flowerencee9.marketplace.screens.auth.otp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.window.OnBackInvokedDispatcher
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.ActivityOtpBinding
import com.flowerencee9.marketplace.screens.auth.createpassword.CreatePasswordActivity
import com.flowerencee9.marketplace.support.utils.AlertDialogListener
import com.flowerencee9.marketplace.support.utils.showAlertDialog
import com.flowerencee9.marketplace.support.utils.snackBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OtpActivity : AppCompatActivity() {
    companion object {
        fun myIntent(context: Context) = Intent(context, OtpActivity::class.java)
        private val TAG = OtpActivity::class.java.simpleName
    }

    private lateinit var binding: ActivityOtpBinding
    private val viewModel by viewModels<OtpViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        with(binding){
            val otpListener = object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun afterTextChanged(p0: Editable?) {
                    btnOtp.isEnabled = p0?.length == 6
                }

            }

            tbToolbar.setTitle(getString(R.string.verify_otp))
            inputOtp.addTextChangedListener(otpListener)
            btnOtp.apply {
                text = getString(R.string.verify)
                setOnClickListener { verifyOtp() }
            }
        }
    }

    private fun verifyOtp() {
        viewModel.verifyOtp(binding.inputOtp.text.toString())
        viewModel.status.observe(this){
            binding.root.snackBar(it.statusMessage)
            CoroutineScope(Dispatchers.IO).launch {
                startActivity(CreatePasswordActivity.myIntent(this@OtpActivity, "lalala", 0))
                finish()
            }
        }
    }

    override fun getOnBackInvokedDispatcher(): OnBackInvokedDispatcher {
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
        return super.getOnBackInvokedDispatcher()
    }
}