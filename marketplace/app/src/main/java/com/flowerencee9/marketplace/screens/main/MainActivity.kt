package com.flowerencee9.marketplace.screens.main

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.flowerencee9.marketplace.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        initData()
    }

    private fun initData() {
        viewModel.discoverProduct()
        viewModel.loadingStates.observe(this){
            Log.d(TAG, "loading states $it")
        }
        viewModel.statusResponse.observe(this){
            Log.d(TAG, "status response $it")
        }
        viewModel.discoverListResponse.observe(this){
            Log.d(TAG, "discover value ${it.productList}")
        }
    }

    private fun initView() {
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}