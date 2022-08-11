package com.wkq.bottomsheet

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.wkq.bottomsheet.base.KtAdapter
import com.wkq.bottomsheet.base.KtDataBindingViewHolder
import com.wkq.bottomsheet.databinding.ItemGoodsBinding


/**
 * @author wkq
 *
 * @date 2022年08月11日 13:53
 *
 *@des
 *
 */

class GoodsAdapter(mContext: Context):KtAdapter<String> (mContext){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var binding = DataBindingUtil.inflate<ItemGoodsBinding>(
            LayoutInflater.from(mContext),
            R.layout.item_goods, parent, false)
        var holder = KtDataBindingViewHolder(binding.root)
        holder.setBinding(binding)
        return holder
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        var bindingHolder = holder as KtDataBindingViewHolder
        var binding = bindingHolder.getBinding() as ItemGoodsBinding
        var info = getItem(position)
        binding.tvContent.text=info
    }

}