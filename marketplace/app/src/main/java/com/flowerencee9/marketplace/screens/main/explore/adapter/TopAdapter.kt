package com.flowerencee9.marketplace.screens.main.explore.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.flowerencee9.marketplace.BuildConfig
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutItemLatestProductBinding
import com.flowerencee9.marketplace.model.data.response.Product
import com.flowerencee9.marketplace.support.utils.decodeBase64ToImageBitmap
import com.flowerencee9.marketplace.support.utils.publicImageDirectory
import com.flowerencee9.marketplace.support.utils.toCurrencyFormat

class TopAdapter(
    private val listener: (Product) -> Unit
) : RecyclerView.Adapter<TopAdapter.ViewHolder>() {
    private val listData = ArrayList<Product>()
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Product) = with(itemView) {
            val binding = LayoutItemLatestProductBinding.bind(itemView)
            with(binding){
                item.let {
                    tvProductName.text = it.productName
                    tvSellerName.text = it.productPrice.toString().toCurrencyFormat()

                    when {
                        it.productImage?.firstOrNull()?.file64 != null -> {
                            val img = decodeBase64ToImageBitmap(it.productImage?.firstOrNull()?.file64.toString())
                            Glide.with(context).asBitmap().load(img).into(imgProduct)
                        }
                        it.productImage?.firstOrNull()?.fileName != null -> {
                            it.productImage?.firstOrNull()?.fileName.let { fileName ->
                                val imgUrl = BuildConfig.BASE_URL + publicImageDirectory() + fileName
                                Glide.with(context).load(imgUrl).into(imgProduct)
                            }
                        }
                        else -> {}
                    }
                    root.setOnClickListener {
                        listener(item)
                    }
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder((LayoutInflater.from(parent.context).inflate(R.layout.layout_item_latest_product, parent, false)))
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    fun setData(list: ArrayList<Product>) {
        val callbackDiff = CallbackProductSummary(listData, list)
        val resultDiff = DiffUtil.calculateDiff(callbackDiff)
        listData.clear()
        listData.addAll(list)
        resultDiff.dispatchUpdatesTo(this)
    }
}