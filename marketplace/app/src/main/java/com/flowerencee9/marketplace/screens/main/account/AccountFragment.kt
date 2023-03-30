package com.flowerencee9.marketplace.screens.main.account

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.FragmentAccountBinding
import com.flowerencee9.marketplace.model.data.objects.PlainItem
import com.flowerencee9.marketplace.support.classes.PlainTextAdapter
import com.flowerencee9.marketplace.support.utils.*

class AccountFragment : Fragment() {
    companion object {
        private val TAG = AccountFragment::class.java.simpleName
    }

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<AccountViewModel>()

    private val rightClicked: () -> Unit = {
        requireActivity().showAlertDialog(
            object : AlertDialogListener {
                override fun onPositive() {
                    binding.root.snackBar("Logout")
                    requireContext().removeUserPref()
                    Handler(Looper.getMainLooper()).postDelayed({
                        requireActivity().finishAndRemoveTask()
                    }, 3000)
                }

                override fun onNegative() {
                    binding.root.snackBar("cancel")
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
    override fun onResume() {
        super.onResume()
        initRequestData()
        initLogic()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initRequestData() {
        viewModel.getUser()
    }

    private fun initLogic() {
        with(viewModel){
            listProfile.observe(viewLifecycleOwner){
                binding.rvProfileData.adapter = PlainTextAdapter(requireContext(), it) {plain ->
                    plainClicked(plain)
                }
            }
            profileData.observe(viewLifecycleOwner){
                /*Glide.with(requireContext()).load(it.picture).into(
                    if (requireContext().isUserSeller()) binding.ivContainer
                    else binding.ivProfile
                )*/
            }
        }
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

    private fun plainClicked(item: PlainItem) {
        Log.d(TAG, "clicked $item")
    }

}