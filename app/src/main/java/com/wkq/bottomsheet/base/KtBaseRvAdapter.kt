package com.wkq.bottomsheet.base

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

/**
 * 作者: 吴奎庆
 *
 * 时间: 2020/5/9
 *
 * 简介:  kt  的databinding adapter
 */
abstract class KtBaseRvAdapter<T> : RecyclerView.Adapter<RecyclerView.ViewHolder> {

    var mContext: Context

    var itemList=ArrayList<T>()

    init {

        itemList = ArrayList<T>()
    }


    constructor(context: Context) {
        this.mContext = context
        itemList = ArrayList<T>()
    }


    fun getItems(): ArrayList<T>? {
        if (this.itemList == null) this.itemList = ArrayList()
        return this.itemList
    }

    fun getItem(position: Int): T? {
        if (itemList != null && position < itemList!!.size) {
            return this.itemList!!.get(position)
        }
        return null
    }

    fun addItem(t: T) {

        addItem(this.itemList!!.size, t)
    }

    open fun addItem(index: Int, item: T?) {
        if (item != null) {
            this.itemList?.add(index, item)
            try {
                notifyItemInserted(index)
            } catch (var4: Exception) {
            }
        }
    }
    open fun updateItems(items: List<T>?) {
        if (items != null) {
            this.itemList!!.clear()
            this.itemList!!.addAll(items)
            notifyDataSetChanged()
        }
    }

    fun addItems(items: List<T>?) {
        if (items != null) {
            this.itemList?.addAll(items.asIterable())
            notifyDataSetChanged()
        }

    }

    fun removeItem(item: T) {
        this.itemList?.remove(item)
        notifyDataSetChanged()
    }

    fun removeItems(items: List<T>?) {
        if (items != null) {
            this.itemList?.removeAll(items.asIterable())
        }
    }
    open fun removeAllItems() {
        this.itemList?.clear()
        notifyDataSetChanged()
    }

}