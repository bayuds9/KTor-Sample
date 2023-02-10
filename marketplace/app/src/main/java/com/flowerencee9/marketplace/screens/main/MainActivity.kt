package com.flowerencee9.marketplace.screens.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.ActivityMainBinding
import com.flowerencee9.marketplace.screens.main.cart.CartFragment
import com.flowerencee9.marketplace.screens.main.explore.ExploreFragment
import com.flowerencee9.marketplace.support.utils.isUserSeller
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var fExplore: Fragment
    private lateinit var fCart: Fragment
    private lateinit var fAccount: Fragment
    private lateinit var fReserve: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        setupFragments()
        setupButtonNavigation()
    }

    private fun setupFragments() {
        fExplore = ExploreFragment()
        setCurrentFragment(fExplore)
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            commit()
        }
    }

    private fun setupButtonNavigation() {
        with(binding) {
            navBottom.apply {
                inflateMenu(if (isUserSeller()) R.menu.seller_bottom_menu else R.menu.bottom_nav_menu)
                setOnItemSelectedListener {
                    when(it.itemId){
                        R.id.nav_explore -> setCurrentFragment(fExplore)
                        else -> Toast.makeText(
                            this@MainActivity,
                            "Not Implemented",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    true
                }
            }
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}