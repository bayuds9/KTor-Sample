package com.flowerencee9.marketplace.screens.main.explore

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.FragmentExploreBinding
import com.flowerencee9.marketplace.model.data.response.Product
import com.flowerencee9.marketplace.screens.chats.lists.ChatListActivity
import com.flowerencee9.marketplace.screens.main.explore.adapter.TopAdapter
import com.flowerencee9.marketplace.support.utils.isLogin
import com.flowerencee9.marketplace.support.utils.isUserSeller
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExploreFragment : Fragment() {
    companion object {
        private val TAG = ExploreFragment::class.java.simpleName
    }

    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<ExploreViewModel>()

    private val adapterTop: TopAdapter by lazy {
        TopAdapter { item -> onItemClicked(item) }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRequestData()
        setupView()
        setupLogic()
    }

    private fun initRequestData() {
        viewModel.discoverProduct()
        viewModel.loadingStates.observe(viewLifecycleOwner) {
            Log.d(TAG, "loading states $it")
        }
        viewModel.statusResponse.observe(viewLifecycleOwner){
            Log.d(TAG, "status response $it")
        }
        viewModel.discoverListResponse.observe(viewLifecycleOwner){
            Log.d(TAG, "discover value $it")
            adapterTop.setData(it)
        }
    }

    private fun setupView() {
        val rightClicked: () -> Unit = {
            startActivity(ChatListActivity.myIntent(requireContext()))
        }

        with(binding){
            tbSearch.apply {
                if (requireContext().isLogin()) setRightItem(R.drawable.ic_baseline_chat, rightClicked)
            }

            if (!requireContext().isUserSeller()){
                rvTop.apply {
                    adapter = adapterTop
                    layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                }
            }
        }
    }

    private fun setupLogic() {

    }

    private fun onItemClicked(item: Product) {
        Log.d(TAG, "product $item")
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}