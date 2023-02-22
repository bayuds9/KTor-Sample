package com.flowerencee9.marketplace.screens.main.explore.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutPromoBinding
import com.flowerencee9.marketplace.model.data.objects.Promo
import com.flowerencee9.marketplace.screens.main.explore.adapter.PromoAdapter.ViewHolder

class PromoAdapter(
    private val listener: (Promo) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {

    private val listData = ArrayList<Promo>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Promo) = with(itemView) {
            val binding = LayoutPromoBinding.bind(itemView)
            with(binding) {
                item.let {
                    if (it.promoImage.isNotEmpty()) Glide.with(context).load(it.promoImage).into(ivPromo)
                    root.setOnClickListener {
                        listener(item)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder((LayoutInflater.from(parent.context).inflate(R.layout.layout_promo, parent, false)))
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    fun setData(list: ArrayList<Promo>) {
        val callbackDiff = CallbackPromo(listData, list)
        val resultDiff = DiffUtil.calculateDiff(callbackDiff)
        listData.clear()
        listData.addAll(list)
        resultDiff.dispatchUpdatesTo(this)
    }
}