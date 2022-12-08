package com.flowerencee9.marketplace.support.utils.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutItemPlainListBinding
import com.flowerencee9.marketplace.model.data.objects.PlainItem
import com.flowerencee9.marketplace.support.base.BaseConstants.TEXT_VALUE_TYPE.Companion.VALUE_AMOUNT
import com.flowerencee9.marketplace.support.base.BaseConstants.TEXT_VALUE_TYPE.Companion.VALUE_CURRENCY
import com.flowerencee9.marketplace.support.base.BaseConstants.TEXT_VALUE_TYPE.Companion.VALUE_PHONE
import com.flowerencee9.marketplace.support.utils.toCurrencyFormat
import com.flowerencee9.marketplace.support.utils.toNumberFormat
import com.flowerencee9.marketplace.support.utils.toPhoneFormat

class PlainTextAdapter(
    private val context: Context,
    data: ArrayList<PlainItem>,
    private val listener: (PlainItem) -> Unit
) : RecyclerView.Adapter<PlainTextAdapter.ViewHolder>() {
    private var dataText = ArrayList<PlainItem>()

    init {
        this.dataText.addAll(data)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: PlainItem) = with(itemView) {
            val binding = LayoutItemPlainListBinding.bind(itemView)
            with(binding) {
                lbl1.text = item.label
                tv1.text = when (item.type) {
                    VALUE_PHONE -> item.textValue.toPhoneFormat()
                    VALUE_CURRENCY -> item.textValue.toCurrencyFormat()
                    VALUE_AMOUNT -> item.textValue.toNumberFormat()
                    else -> item.textValue
                }
                root.setOnClickListener {
                    listener(item)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        (
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.layout_item_plain_list, parent, false)
                )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataText[position])
    }

    override fun getItemCount(): Int = dataText.size
}