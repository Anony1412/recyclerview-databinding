package com.ptit.databindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ptit.databindingexample.databinding.ActivityMainBinding
import com.ptit.databindingexample.model.Account

class MainActivity : AppCompatActivity() {

    private val accountAdapter = AccountAdapter()
    private var mainBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initData()
    }

    private fun initData() {
        val accounts = mutableListOf<Account>().apply {
            for (i in 0..100) add(Account("username $i", "password $i"))
        }
        accountAdapter.updateData(accounts)
        mainBinding?.recyclerViewAccount?.adapter = accountAdapter
    }
}
