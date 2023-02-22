package com.flowerencee9.marketplace.screens.main.account

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.FragmentAccountBinding
import com.flowerencee9.marketplace.support.utils.*

class AccountFragment : Fragment() {
    companion object {
        private val TAG = AccountFragment::class.java.simpleName
    }

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    private val rightClicked: () -> Unit = {
        requireActivity().showAlertDialog(
            object : AlertDialogListener {
                override fun onPositive() {
                    binding.root.snackbar("Logout")
                    requireContext().removeUserPref()
                    Handler(Looper.getMainLooper()).postDelayed({
                        requireActivity().finishAndRemoveTask()
                    }, 3000)
                }

                override fun onNegative() {
                    binding.root.snackbar("cancel")
                }

            },
            getString(R.string.alert_logout),
            getString(R.string.alert_logout_desc)
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() {
        with(binding) {
            if (requireContext().isUserSeller()) ivProfile.setImageResource(R.drawable.ic_launcher_foreground) else ivContainer.setImageResource(
                R.drawable.ic_launcher_foreground
            )
            rvProfileData.apply {
                layoutManager = LinearLayoutManager(requireContext())
            }
            tbToolbar.apply {
                setRightItem(R.drawable.ic_baseline_logout, rightClicked)
                setTitle(getString(R.string.tb_user_profile))
            }
            btnEditProfile.setOnClickListener {
                Toast.makeText(requireContext(), "Not Implemented", Toast.LENGTH_SHORT).show()
            }
            btnChangePassword.setOnClickListener {
                Toast.makeText(requireContext(), "Not Implemented", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        initRequestData()
    }

    private fun initRequestData() {

    }

}