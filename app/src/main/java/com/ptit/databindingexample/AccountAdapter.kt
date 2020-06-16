package com.ptit.databindingexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ptit.databindingexample.model.Account

class AccountAdapter : RecyclerView.Adapter<AccountViewHolder>() {

    private val accounts = mutableListOf<Account>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder {
        return AccountViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.account_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = accounts.size

    override fun onBindViewHolder(holder: AccountViewHolder, position: Int) {
        holder.bind(accounts[position])
    }

    fun updateData(data: List<Account>) {
        if (accounts.isNotEmpty()) accounts.clear()
        accounts.addAll(data)
        notifyDataSetChanged()
    }
}
