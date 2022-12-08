package com.flowerencee9.marketplace.support.customui

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.flowerencee9.marketplace.databinding.MonthYearPickerDialogBinding
import java.util.*

class MonthYearPickerDialog(val date: Date = Date()) : DialogFragment() {

    companion object {
        private const val MAX_YEAR = 2099
        private const val MIN_YEAR = 2000
    }

    private lateinit var binding: MonthYearPickerDialogBinding

    private var listener: DatePickerDialog.OnDateSetListener? = null

    fun setListener(listener: DatePickerDialog.OnDateSetListener?) {
        this.listener = listener
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = MonthYearPickerDialogBinding.inflate(layoutInflater)
        val cal: Calendar = Calendar.getInstance().apply { time = date }

        binding.pickerMonth.run {
            minValue = 0
            maxValue = 11
            value = cal.get(Calendar.MONTH)
            displayedValues = arrayOf("Jan","Feb","Mar","Apr","May","June","July",
                "Aug","Sep","Oct","Nov","Dec")
        }

        binding.pickerYear.run {
            val year = cal.get(Calendar.YEAR)
            minValue = MIN_YEAR
            maxValue = MAX_YEAR
            value = year
        }

        return AlertDialog.Builder(requireContext())
            .setTitle("Please Select View Month")
            .setView(binding.root)
            .setPositiveButton("Ok") { _, _ -> listener?.onDateSet(null, binding.pickerYear.value, binding.pickerMonth.value, 1) }
            .setNegativeButton("Cancel") { _, _ -> dialog?.cancel() }
            .create()
    }
}