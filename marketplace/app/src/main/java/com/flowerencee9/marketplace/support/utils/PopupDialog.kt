package com.flowerencee9.marketplace.support.utils

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import androidx.appcompat.app.AlertDialog
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.LayoutChangeValueBinding
import com.flowerencee9.marketplace.support.customui.InputView

fun Activity.showAlertDialog(listener: AlertDialogListener? = null, title: String = "", desc: String = "", positive: String = getString(R.string.ok), negative: String = getString(R.string.cancel)) {
    val alertDialog: AlertDialog = this.let {
        val builder = AlertDialog.Builder(it)
        builder.apply {
            setTitle(title)
            setMessage(desc)
            setCancelable(listener != null)
            setPositiveButton(
                positive
            ) { _, _ ->
                listener?.onPositive()
                closeContextMenu()
            }
            setNegativeButton(
                negative
            ) { _, _ ->
                listener?.onNegative()
                closeContextMenu()

            }
        }
        builder.create()
    }
    alertDialog.show()
}

interface AlertDialogListener {
    fun onPositive()
    fun onNegative()
}

fun Activity.showPopUpDialogChangeValue(
    listener: OptionPopUpDialogChangeValueListener? = null,
    title: String,
    hint: String,
    textButtonPrim: String,
    textButtonSec: String,
) {
    val dialog = Dialog(this, R.style.DialogSlideAnimFullWidth)
    val binding = LayoutChangeValueBinding.bind(
        layoutInflater.inflate(
            R.layout.layout_change_value,
            null,
            false
        )
    )
    val textCounter = object : InputView.InputListener {
        override fun afterTextChanged(input: String) {
            binding.btnExecute.isEnabled = binding.inputName.isValid()
        }

    }
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.setContentView(binding.root)
    dialog.setCancelable(listener == null)
    binding.apply {
        textView8.text = title
        inputName.apply {
            setHint(hint)
            setListener(textCounter)
        }
        btnCancel.text = textButtonSec
        btnExecute.text = textButtonPrim
        btnCancel.setOnClickListener {
            listener?.onSecondOptionClick()
            dialog.dismiss()
        }
        btnExecute.setOnClickListener {
            listener?.onFirstOptionClick(inputName.getText().trim())
            dialog.dismiss()
        }
        if (!isFinishing) dialog.show()
    }
}

interface OptionPopUpDialogChangeValueListener {
    fun onFirstOptionClick(text: String)
    fun onSecondOptionClick()
}