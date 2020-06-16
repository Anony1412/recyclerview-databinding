package com.ptit.databindingexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ptit.databindingexample.databinding.AccountItemBinding
import com.ptit.databindingexample.model.Account

class AccountViewHolder(
    private val accountItemBinding: AccountItemBinding
) : RecyclerView.ViewHolder(accountItemBinding.root) {

    fun bind(account: Account) {
        accountItemBinding.account = account
    }
}
