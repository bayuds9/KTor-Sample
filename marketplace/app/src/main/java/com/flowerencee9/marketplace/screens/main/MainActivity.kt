package com.flowerencee9.marketplace.screens.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.ActivityMainBinding
import com.flowerencee9.marketplace.screens.auth.login.LoginFragment
import com.flowerencee9.marketplace.screens.main.account.AccountFragment
import com.flowerencee9.marketplace.screens.main.cart.CartFragment
import com.flowerencee9.marketplace.screens.main.explore.ExploreFragment
import com.flowerencee9.marketplace.screens.main.summary.SummaryFragment
import com.flowerencee9.marketplace.support.utils.isLogin
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
        fCart = CartFragment()
        fAccount = when(isLogin()) {
            true -> AccountFragment()
            else -> LoginFragment()
        }
        fReserve = SummaryFragment()
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
                        R.id.nav_cart -> setCurrentFragment(fCart)
                        R.id.nav_account -> setCurrentFragment(fAccount)
                        R.id.nav_reserve -> setCurrentFragment(fReserve)
                    }
                    true
                }
            }
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
        fun myIntent(context: Context) = Intent(context, MainActivity::class.java).apply {
            addFlags(
                Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            )
        }
    }
}