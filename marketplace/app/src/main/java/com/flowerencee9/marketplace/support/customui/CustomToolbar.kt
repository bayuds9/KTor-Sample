package com.flowerencee9.marketplace.support.customui

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutCustomToolbarBinding
import com.flowerencee9.marketplace.support.utils.toHide
import com.flowerencee9.marketplace.support.utils.toShow

class CustomToolbar: ConstraintLayout {
    private lateinit var mContext: Context
    private lateinit var binding: LayoutCustomToolbarBinding
    private var searchListener : ToolbarListener? = null

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        mContext = context
        binding = LayoutCustomToolbarBinding.bind(
            LayoutInflater.from(mContext).inflate(R.layout.layout_custom_toolbar, this, true)
        )
        val searchWatcher = object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                searchListener?.afterChanged(p0.toString())
            }

        }
        binding.etSearch.addTextChangedListener(searchWatcher)
    }

    fun setTitle(title: String) {
        binding.tvTitle.text = title
    }

    fun setLeftItem(drawable: Int? = null, leftClicked: () -> Unit) {
        if (drawable != null) {
            binding.imgLeft.apply {
                toShow()
                setImageDrawable(ContextCompat.getDrawable(mContext, drawable) as Drawable)
                setOnClickListener {
                    leftClicked()
                }
            }
        }
    }

    fun setRightItem(drawable: Int? = null, rightClicked: () -> Unit) {
        if (drawable != null) {
            binding.imgRight.apply {
                toShow()
                setImageDrawable(ContextCompat.getDrawable(mContext, drawable) as Drawable)
                setOnClickListener{
                    rightClicked()
                }
            }
        }
    }

    fun setRightItemTwo(drawable: Int? = null, rightClicked: () -> Unit) {
        if (drawable != null) {
            binding.imgRight.apply {
                toShow()
                setImageDrawable(ContextCompat.getDrawable(mContext, drawable) as Drawable)
                setOnClickListener{
                    rightClicked()
                }
            }
        }
    }

    fun showSearchText(listener: ToolbarListener) {
        searchListener = listener
        with(binding) {
            etSearch.toShow()
            tvTitle.toHide()
        }
    }

    fun clearSearchText() {
        binding.etSearch.text.clear()
    }

    interface ToolbarListener {
        fun afterChanged(input: String)
    }

}