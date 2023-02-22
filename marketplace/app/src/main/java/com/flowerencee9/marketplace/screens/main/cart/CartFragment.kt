package com.flowerencee9.marketplace.screens.main.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.ActivityMessagesBinding
import com.flowerencee9.marketplace.model.data.objects.CartChild
import com.flowerencee9.marketplace.model.data.objects.CartParent
import com.flowerencee9.marketplace.screens.main.cart.adapter.CartChildAdapter
import com.flowerencee9.marketplace.screens.main.cart.adapter.CartParentAdapter
import com.flowerencee9.marketplace.support.utils.isLogin
import com.flowerencee9.marketplace.support.utils.toHide
import com.flowerencee9.marketplace.support.utils.toShow
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CartFragment : Fragment() {
    companion object {
        private val TAG = CartFragment::class.java.simpleName
    }

    private var _binding: ActivityMessagesBinding? = null
    private val binding get() = _binding!!

    private val adapterCart : CartParentAdapter by lazy {
        CartParentAdapter(
            { cartParent: CartParent, cartChild: CartChild, actionType: CartChildAdapter.ACTION_TYPE ->
                performChildAction(cartParent, cartChild, actionType)
            },
            { cartParent: CartParent, action: Int ->
                performParentAction(cartParent, action)
            }
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ActivityMessagesBinding.inflate(inflater, container, false)
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
        val rightClick : () -> Unit = {
            Toast.makeText(requireContext(), "Not Implemented", Toast.LENGTH_SHORT).show()
        }

        with(binding){
            if (requireContext().isLogin()){
                emptyView.containerHaventLogin.toHide()
                containerMessage.toHide()
                tbToolbar.apply {
                    setTitle(getString(R.string.all_cart))
                    if (requireContext().isLogin()) setRightItem(R.drawable.ic_baseline_shopping_cart_checkout, rightClick)
                }
                rvMessage.apply {
                    layoutManager = LinearLayoutManager(requireContext())
                    adapter = adapterCart
                }
            }
            else emptyView.containerHaventLogin.toShow()

            swipeMessage.setOnRefreshListener { initRequestData() }
        }
    }

    override fun onResume() {
        super.onResume()
        if (requireContext().isLogin()) {
            initRequestData()
            setupLogic()
        }
    }

    private fun initRequestData() {

    }

    private fun setupLogic() {

    }

    private fun performChildAction(
        cartParent: CartParent,
        cartChild: CartChild,
        actionType: CartChildAdapter.ACTION_TYPE
    ) {

    }

    private fun performParentAction(cartParent: CartParent, action: Int) {

    }

}