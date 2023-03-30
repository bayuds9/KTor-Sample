package com.flowerencee9.marketplace.screens.transaction.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.flowerencee9.marketplace.databinding.ActivityBillerBinding
import com.flowerencee9.marketplace.support.sealed.Trx

class TransactionDetailActivity: AppCompatActivity() {
    companion object {
        fun myIntent(context: Context, trxId: String, type: String) =
            Intent(context, TransactionDetailActivity::class.java).apply {
                putExtra(EXTRA_TRANSACTION, trxId)
                putExtra(EXTRA_STATUS, type)
            }

        private const val EXTRA_TRANSACTION = "EXTRA_TRANSACTION"
        private const val EXTRA_STATUS = "EXTRA_STATUS"
    }

    private val transactionId by lazy {
        intent.getStringExtra(EXTRA_TRANSACTION) ?: ""
    }

    private val status by lazy {
        intent.getStringExtra(EXTRA_STATUS) ?: Trx.FINISHED.value
    }

    private lateinit var binding : ActivityBillerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBillerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {

    }
}