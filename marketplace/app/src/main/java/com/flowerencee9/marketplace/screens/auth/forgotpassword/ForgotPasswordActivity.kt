package com.flowerencee9.marketplace.screens.auth.forgotpassword

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.ActivityAuthBinding
import com.flowerencee9.marketplace.model.data.request.ForgotPasswordRequest
import com.flowerencee9.marketplace.screens.auth.otp.OtpActivity
import com.flowerencee9.marketplace.support.customui.InputView
import com.flowerencee9.marketplace.support.utils.snackBar
import com.flowerencee9.marketplace.support.utils.toHide
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ForgotPasswordActivity : AppCompatActivity() {
    companion object {
        private val TAG = ForgotPasswordActivity::class.java.simpleName
        fun myIntent(context: Context) = Intent(context, ForgotPasswordActivity::class.java)
    }

    private lateinit var binding: ActivityAuthBinding
    private val viewModel by viewModels<ForgotPasswordViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
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
        val leftClick: () -> Unit = {
            finish()
        }
        with(binding) {
            tbToolbar.apply {
                setTitle(getString(R.string.forgot_password))
                setLeftItem(R.drawable.ic_baseline_arrow_back, leftClick)
            }
            inputName.toHide()
            containerProfile.toHide()
            containerPassword.toHide()
            inputDOB.toHide()
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
            btnAction.apply {
                text = getString(R.string.next)
                setOnClickListener {
                    sentForgotPassword()
                }
            }
        }
    }

    private fun setupButtonStates() {
        with(binding) {
            btnAction.isEnabled = inputEmail.isValid() && inputPhone.isValid()
        }
    }

    private fun sentForgotPassword() {
        with(binding) {
            val request = ForgotPasswordRequest(inputEmail.getText(), inputPhone.getText())
            Log.d(TAG, "request $request")
            viewModel.forgotPassword(request)
            viewModel.status.observe(this@ForgotPasswordActivity) {
                Log.d(TAG, "status value $it")
                root.snackBar(it.statusMessage)
                if (it.success) {
                    CoroutineScope(Dispatchers.IO).launch {
                        delay(2000)
                        startActivity(
                            OtpActivity.myIntent(
                                this@ForgotPasswordActivity
                            )
                        )
                    }
                }
            }
        }
    }
}