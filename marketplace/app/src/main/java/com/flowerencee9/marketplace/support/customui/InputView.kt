package com.flowerencee9.marketplace.support.customui

import android.content.Context
import android.content.res.ColorStateList
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutInputBinding
import com.flowerencee9.marketplace.support.utils.isEmailValid
import com.flowerencee9.marketplace.support.utils.isViewShown
import com.flowerencee9.marketplace.support.utils.toShow
import com.google.android.material.textfield.TextInputLayout

class InputView : ConstraintLayout {
    private lateinit var mContext: Context
    private lateinit var binding: LayoutInputBinding

    private var listener: InputListener? = null

    enum class TYPE { TEXT, PASSWORD, EMAIL, PHONE, NUMBER, SELECTOR }

    private var inputType = TYPE.TEXT
    private var inputLength: Int? = null

    interface InputListener {
        fun afterTextChanged(input: String)
        fun afterClickListener() {}
    }

    constructor(context: Context) : super(context, null) {
        init(context)
    }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        init(context)

    }

    constructor(context: Context, attributeSet: AttributeSet?, defstyleAttr: Int) : super(
        context,
        attributeSet,
        defstyleAttr
    ) {
        init(context)
    }

    private fun init(context: Context) {
        mContext = context
        binding = LayoutInputBinding.bind(
            LayoutInflater.from(mContext).inflate(R.layout.layout_input, this, true)
        )
        binding.inputTextEdit.addTextChangedListener(textWatcher)
    }

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun afterTextChanged(p0: Editable?) {
            listener?.afterTextChanged(p0.toString())
            if (inputLength != null) {
                if (p0.toString().length < inputLength!!) {
                    setHelperText(
                        String.format(
                            context.getString(R.string.info_password_length),
                            inputLength.toString()
                        )
                    )
                } else {
                    setHelperText("")
                }
            }
        }

    }

    fun setMinLength(length: Int) {
        inputLength = length
    }

    fun setHint(hint: String) {
        binding.inputController.hint = hint
    }

    fun setHelperText(text: String, color: Int? = null) {
        with(binding) {
            inputController.helperText = text
            inputController.setHelperTextColor(
                ColorStateList.valueOf(
                    color ?: ContextCompat.getColor(context, R.color.purple_200)
                )
            )
        }
    }

    fun setInpuType(type: TYPE) {
        inputType = type
        binding.inputTextEdit.inputType = when (type) {
            TYPE.PASSWORD -> InputType.TYPE_TEXT_VARIATION_PASSWORD or InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            TYPE.EMAIL -> InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            TYPE.PHONE, TYPE.NUMBER -> InputType.TYPE_CLASS_NUMBER
            TYPE.SELECTOR -> InputType.TYPE_NULL
            else -> InputType.TYPE_CLASS_TEXT
        }
    }

    fun setCleartext(states: Boolean) {
        binding.inputController.endIconMode =
            if (states) TextInputLayout.END_ICON_CLEAR_TEXT else TextInputLayout.END_ICON_NONE
    }

    fun setLines(lines: Int, max: Int = 5) {
        binding.inputTextEdit.gravity = Gravity.TOP
        binding.inputTextEdit.inputType = InputType.TYPE_TEXT_FLAG_MULTI_LINE
        binding.inputTextEdit.minLines = lines
        binding.inputTextEdit.maxLines = max

    }

    fun setVisiblePassword() {
        binding.inputController.endIconMode = TextInputLayout.END_ICON_PASSWORD_TOGGLE
    }

    fun setListener(inputListener: InputListener) {
        listener = inputListener
    }

    fun performListener(listener: OnClickListener) {
        if (binding.disabler.isViewShown()) {
            binding.disabler.setOnClickListener(listener)
        }
    }

    fun getText(): String {
        return binding.inputTextEdit.text.toString()
    }

    fun setValue(value: String) {
        binding.inputTextEdit.setText(value)
    }

    fun isValid(): Boolean {
        return when (inputType) {
            TYPE.EMAIL -> getText().isEmailValid()
            TYPE.PHONE -> getText().length > 10
            TYPE.NUMBER -> if (getText().isNotEmpty()) getText().toInt() > 0 else false
            else -> getText().isNotEmpty()
        }
    }

    fun setDisable() {
        if (inputType == TYPE.SELECTOR) {
            binding.inputTextEdit.isEnabled = false
            binding.inputTextEdit.isFocusable = false
            binding.disabler.toShow()
            binding.disabler.setOnClickListener {
                listener?.afterClickListener()
            }
        }
    }
}