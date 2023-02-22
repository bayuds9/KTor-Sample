package com.flowerencee9.marketplace.screens.main.cart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutCartItemChildBinding
import com.flowerencee9.marketplace.model.data.objects.CartChild
import com.flowerencee9.marketplace.support.utils.toCurrencyFormat
import com.flowerencee9.marketplace.support.utils.toNumberFormat

class CartChildAdapter(
    private val actionListener: (CartChild, ACTION_TYPE) -> Unit
) : RecyclerView.Adapter<CartChildAdapter.ViewHolder>() {

    enum class ACTION_TYPE {
        DELETE, BOOK_SINGLE, CHECKED, UNCHECKED
    }

    var modified = false
    private val listData = ArrayList<CartChild>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CartChild) = with(itemView) {
            val binding = LayoutCartItemChildBinding.bind(itemView)
            with(binding) {
                tvTotal.text = item.amount.toString().toNumberFormat()
                tvPrice.text = item.totalPrice.toString().toCurrencyFormat()
                checkChild.apply {
                    isChecked = item.isChecked
                    text = item.productName
                    setOnCheckedChangeListener { compoundButton, b ->
                        item.isChecked = compoundButton.isChecked
                        actionListener(
                            item, when (b) {
                                true -> ACTION_TYPE.CHECKED
                                false -> {
                                    modified = true
                                    ACTION_TYPE.UNCHECKED
                                }
                            }
                        )
                    }
                }
                btnBook.setOnClickListener { actionListener(item, ACTION_TYPE.BOOK_SINGLE) }
                btnDelete.setOnClickListener { actionListener(item, ACTION_TYPE.DELETE) }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_cart_item_child, parent, false)
        )
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    fun setData(list: ArrayList<CartChild>) {
        val callbackDiff = CallbackChild(listData, list)
        val resultDiff = DiffUtil.calculateDiff(callbackDiff)
        listData.clear()
        listData.addAll(list)
        resultDiff.dispatchUpdatesTo(this)
    }
}