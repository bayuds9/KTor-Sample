package com.flowerencee9.marketplace.screens.main.cart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutCartItemParentBinding
import com.flowerencee9.marketplace.model.data.objects.CartChild
import com.flowerencee9.marketplace.model.data.objects.CartParent
import com.flowerencee9.marketplace.support.utils.toCurrencyFormat

class CartParentAdapter(
    private val childActionListener: (CartParent, CartChild, CartChildAdapter.ACTION_TYPE) -> Unit,
    private val parentListener: (CartParent, Int) -> Unit
) : RecyclerView.Adapter<CartParentAdapter.ViewHolder>() {
    private val listData = ArrayList<CartParent>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CartParent) = with(itemView) {
            val binding = LayoutCartItemParentBinding.bind(itemView)
            with(binding) {
                val childAdapter =
                    CartChildAdapter { child: CartChild, action: CartChildAdapter.ACTION_TYPE ->
                        childActionListener(item, child, action)
                        if (action == CartChildAdapter.ACTION_TYPE.UNCHECKED) checkParent.isChecked =
                            false
                    }
                val dataListChild = item.products
                childAdapter.setData(dataListChild)
                rvCartParent.apply {
                    adapter = childAdapter
                    layoutManager = LinearLayoutManager(context)
                }
                tvParentTotalPrice.text = item.totalPrice.toString().toCurrencyFormat()
                tvMerchant.text = item.storeName
                checkParent.apply {
                    text = context.getString(R.string.pesan_semua)
                    setOnCheckedChangeListener { _, b ->
                        val type = if (b) 1 else 0
                        parentListener(item, type)
                    }
                }
                btnBookAll.apply {
                    setOnClickListener {
                        parentListener(item, 2)
                    }
                    isEnabled = item.totalPrice != 0
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_cart_item_parent, parent, false)
        )
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    fun setData(list: ArrayList<CartParent>) {
        val callbackDiff = CallbackParent(listData, list)
        val resultDiff = DiffUtil.calculateDiff(callbackDiff)
        listData.clear()
        listData.addAll(list)
        resultDiff.dispatchUpdatesTo(this)
    }
}