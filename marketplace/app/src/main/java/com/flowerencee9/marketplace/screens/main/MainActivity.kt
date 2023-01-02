package com.flowerencee9.marketplace.screens.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
//        TODO("Not yet implemented")
    }
}