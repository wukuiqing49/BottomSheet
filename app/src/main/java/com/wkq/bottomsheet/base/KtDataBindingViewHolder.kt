package com.wkq.bottomsheet.base

import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * 作者: 吴奎庆
 *
 * 时间: 2020/5/9
 *
 * 简介:
 */

class KtDataBindingViewHolder : RecyclerView.ViewHolder {

     var viewBinding :ViewDataBinding?=null
    constructor(itemView: View) : super(itemView)

    fun setBinding(viewBinding:ViewDataBinding){
        this.viewBinding=viewBinding
    }

    fun getBinding(): ViewDataBinding? {
        return this.viewBinding
    }
}