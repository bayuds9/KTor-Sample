package com.flowerencee9.marketplace.screens.auth.login

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.FragmentLoginBinding
import com.flowerencee9.marketplace.model.data.request.LoginRequest
import com.flowerencee9.marketplace.screens.auth.register.RegisterActivity
import com.flowerencee9.marketplace.screens.main.MainActivity
import com.flowerencee9.marketplace.support.customui.InputView
import com.flowerencee9.marketplace.support.utils.SpannableListener
import com.flowerencee9.marketplace.support.utils.snackBar
import com.flowerencee9.marketplace.support.utils.spanText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginFragment : Fragment() {

    companion object {
        private val TAG = LoginFragment::class.java.simpleName
    }

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setupView() {
        val emailListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }
        val passwordListener = object : InputView.InputListener {
            override fun afterTextChanged(input: String) {
                setupButtonStates()
            }

        }
        val forgotPasswordListener = object : SpannableListener {
            override fun onClick() {
                forgotPassword()
            }

        }
        val registerListener = object : SpannableListener {
            override fun onClick() {
                registerNewAccount()
            }

        }

        with(binding) {
            etEmail.apply {
                setHint(getString(R.string.hint_email))
                setListener(emailListener)
                setInpuType(InputView.TYPE.EMAIL)
            }
            etPassword.apply {
                setHint(getString(R.string.hint_password))
                setVisiblePassword()
                setListener(passwordListener)
            }
            btnLogin.setOnClickListener {
                loginUser()
            }
            tvForgotPassword.apply {
                text = requireContext().spanText(
                    getString(R.string.forgot_password),
                    getString(R.string.forgot_password),
                    forgotPasswordListener
                )
                movementMethod = LinkMovementMethod.getInstance()
            }
            tvHaveNoAccount.apply {
                text = requireContext().spanText(
                    getString(R.string.have_no_account_register_here),
                    getString(R.string.register_here),
                    registerListener
                )
                movementMethod = LinkMovementMethod.getInstance()
            }
        }
    }

    private fun setupButtonStates() {
        with(binding) {
            btnLogin.isEnabled = etEmail.isValid() && etPassword.isValid()
        }
    }

    private fun registerNewAccount() {
        startActivity(RegisterActivity.myIntent(requireContext()))
    }

    private fun forgotPassword() {
        /*startActivity(ForgotPasswordActivity.myIntent(requireContext()))*/
        binding.root.snackBar("Not Implemented")
    }

    private fun loginUser() {
        with(binding) {
            val request = LoginRequest(etEmail.getText(), etPassword.getText())
            viewModel.loginUser(request)
            viewModel.status.observe(viewLifecycleOwner) {
                root.snackBar(it.statusMessage)
                if (it.success){
                    CoroutineScope(Dispatchers.IO).launch {
                        requireActivity().startActivity(MainActivity.myIntent(requireContext()))
                    }
                }
            }
        }
    }

}