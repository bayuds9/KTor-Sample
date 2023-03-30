package com.flowerencee9.marketplace.support.classes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutTransactionParentBinding
import com.flowerencee9.marketplace.model.data.objects.TParent
import com.flowerencee9.marketplace.support.utils.isViewShown
import com.flowerencee9.marketplace.support.utils.toHide
import com.flowerencee9.marketplace.support.utils.toShow

class TParentAdapter(
    private val detailListener: (TParent) -> Unit
) : RecyclerView.Adapter<TParentAdapter.ViewHolder>() {

    private val dataList = ArrayList<TParent>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: TParent) = with(itemView) {
            val binding = LayoutTransactionParentBinding.bind(itemView)
            val rvAdapter = TChildAdapter()
            with(binding) {
                val dateLocation = item.date + "\t" + item.location
                tvDestName.text = item.destName
                tvDate.text = dateLocation
                rvChild.apply {
                    adapter = rvAdapter
                    layoutManager = LinearLayoutManager(context)
                }
                rvAdapter.setData(item.childItem)
                tvDetail.setOnClickListener {
                    detailListener(item)
                }

                if (item.childItem.isNotEmpty()) {
                    root.setOnClickListener {
                        if (rvChild.isViewShown()) {
                            ivIcon.setImageResource(R.drawable.ic_down_primary)
                            rvChild.toHide()
                            tvDetail.toHide()
                        } else {
                            ivIcon.setImageResource(R.drawable.ic_up_primary)
                            rvChild.toShow()
                            tvDetail.toShow()
                        }
                    }
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            (LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_transaction_parent, parent, false))
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    fun setData(data: ArrayList<TParent>) {
        val cbDiff = CallbackTransaction(dataList, data)
        val resultDiff = DiffUtil.calculateDiff(cbDiff)
        dataList.clear()
        dataList.addAll(data)
        resultDiff.dispatchUpdatesTo(this)
    }

    inner class CallbackTransaction(
        private val oldList: ArrayList<TParent>,
        private val newList: ArrayList<TParent>
    ) : DiffUtil.Callback() {
        override fun getOldListSize(): Int = oldList.size

        override fun getNewListSize(): Int = newList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] === newList[newItemPosition]
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            val (_, value0, nameOld) = oldList[oldItemPosition]
            val (_, value1, nameNew) = newList[newItemPosition]
            return nameOld == nameNew && value0 == value1
        }

        @Nullable
        override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
            return super.getChangePayload(oldItemPosition, newItemPosition)
        }
    }
}