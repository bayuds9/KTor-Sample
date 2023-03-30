package com.flowerencee9.marketplace.screens.main.explore

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.FragmentExploreBinding
import com.flowerencee9.marketplace.model.data.objects.Promo
import com.flowerencee9.marketplace.model.data.response.Product
import com.flowerencee9.marketplace.screens.chats.lists.ChatActivity
import com.flowerencee9.marketplace.screens.main.explore.adapter.PromoAdapter
import com.flowerencee9.marketplace.screens.main.explore.adapter.TopAdapter
import com.flowerencee9.marketplace.support.utils.isLogin
import com.flowerencee9.marketplace.support.utils.isUserSeller
import com.flowerencee9.marketplace.support.utils.toHide
import com.flowerencee9.marketplace.support.utils.toShow
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

    private val adapterPromo: PromoAdapter by lazy {
        PromoAdapter { item -> onPromoClicked(item) }
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
        viewModel.statusResponse.observe(viewLifecycleOwner) {
            Log.d(TAG, "status response $it")
        }
        viewModel.discoverListResponse.observe(viewLifecycleOwner) {
            Log.d(TAG, "discover value $it")
            adapterTop.setData(it)
        }
        viewModel.promoList.observe(viewLifecycleOwner) {
            Log.d(TAG, "promo list $it")
            adapterPromo.setData(it)
        }
    }

    private fun setupView() {
        val rightClicked: () -> Unit = {
            startActivity(ChatActivity.myIntent(requireContext()))
        }

        with(binding) {
            tbSearch.apply {
                if (requireContext().isLogin()) setRightItem(
                    R.drawable.ic_baseline_chat,
                    rightClicked
                )
            }
            when (requireContext().isUserSeller()) {
                true -> {
                    containerTop.toHide()
                    containerPromo.toHide()
                    titleLatest.text = getString(R.string.my_product)

                    fabToStore.apply {
                        toShow()
                        setOnClickListener {
                            Toast.makeText(requireContext(), "Not Implemented", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }
                }
                else -> {
                    rvTop.apply {
                        adapter = adapterTop
                        layoutManager = LinearLayoutManager(
                            requireContext(),
                            LinearLayoutManager.HORIZONTAL,
                            false
                        )
                    }
                    rvPromo.apply {
                        adapter = adapterPromo
                        layoutManager = LinearLayoutManager(
                            requireContext(),
                            LinearLayoutManager.HORIZONTAL,
                            false
                        )
                    }
                }
            }
        }
    }

    private fun setupLogic() {

    }

    private fun onItemClicked(item: Product) {
        Log.d(TAG, "product $item")
    }

    private fun onPromoClicked(promo: Promo) {
        Log.d(TAG, "promo $promo")
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}