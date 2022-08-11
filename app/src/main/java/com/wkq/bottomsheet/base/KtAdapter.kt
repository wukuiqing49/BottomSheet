package com.wkq.bottomsheet.base

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * 作者: 吴奎庆
 *
 * 时间: 2020/5/9
 *
 * 简介:
 */
abstract class KtAdapter<T>(context: Context) : KtBaseRvAdapter<T>(context) {



    init {
        this.mContext = context

    }
    init {
        this.mContext = context
    }

     var viewClickListener: OnAdapterViewClickListener<T>? = null

     fun setOnViewClickListener(listener: OnAdapterViewClickListener<T>) {
        viewClickListener = listener
    }


    override fun getItemCount(): Int {
        return itemList?.size ?: 0
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var ktHolder = holder as? KtDataBindingViewHolder
        ktHolder?.getBinding()?.executePendingBindings()
    }

    interface OnAdapterViewClickListener<T> {
        fun onViewClick(v: View?, program: T?)
    }

    open fun removeItem(position: Int) {
        itemList!!.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, itemList!!.size - position)
    }
}