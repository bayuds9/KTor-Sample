package com.flowerencee9.marketplace.support.classes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutTransactionChildBinding
import com.flowerencee9.marketplace.model.data.objects.TChild
import com.flowerencee9.marketplace.support.utils.toCurrencyFormat
import com.flowerencee9.marketplace.support.utils.toNumberFormat

class TChildAdapter() : RecyclerView.Adapter<TChildAdapter.ViewHolder>() {
    private val listData = ArrayList<TChild>()
    inner class ViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView) {
        fun bind(item: TChild) = with(itemView) {
            val binding = LayoutTransactionChildBinding.bind(itemView)
            with(binding){
                tvTotal.text = item.amount.toString().toNumberFormat()
                tvPrice.text = item.price.toString().toCurrencyFormat()
                tvChildName.apply {
                    text = item.productName
                    setOnClickListener {
                        /*context.startActivity(DetailActivity.myIntent(context, item.productId))*/
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_transaction_child, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

    fun setData(data: ArrayList<TChild>) {
        if (data.isEmpty()) return
        listData.clear()
        listData.addAll(data)
        notifyDataSetChanged()
    }
}