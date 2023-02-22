package com.flowerencee9.marketplace.screens.main.explore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagingData
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutItemExploreBinding
import com.flowerencee9.marketplace.model.data.response.Product
import com.flowerencee9.marketplace.support.utils.isUserSeller
import com.flowerencee9.marketplace.support.utils.toCurrencyFormat
import com.flowerencee9.marketplace.support.utils.toNumberFormat

class ExploreAdapter(
    private val listener: (Product) -> Unit
) : PagingDataAdapter<Product, ExploreAdapter.ViewHolder>(DIFF_CALLBACK) {

    private val _snapshotData = MutableLiveData<ArrayList<Product>>()
    val snapshotData : LiveData<ArrayList<Product>> get() = _snapshotData

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Product>() {
            override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
                return oldItem.productId == newItem.productId
            }

        }
    }
    inner class ViewHolder(private val binding: LayoutItemExploreBinding, private val context: Context) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Product) {
            with(binding) {
                item.let {
                    val productStock = "${context.getString(R.string.current_stock)} ${it.productStock.toString().toNumberFormat()}"
                    tvProductName.text = it.productName
                    tvSellerName.text = productStock
                    tvPrice.text = it.productPrice.toString().toCurrencyFormat()

                    it.productImage?.firstOrNull()?.let {img ->
                        Glide.with(context).load(img).into(imgProduct)
                    }

                    root.setOnClickListener {
                        listener(item)
                    }
                }
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        val listData = snapshot().items.toCollection(ArrayList())
        if (listData.isNotEmpty()) _snapshotData.value = listData
        if (data != null) holder.bind(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = LayoutItemExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, parent.context)
    }
}