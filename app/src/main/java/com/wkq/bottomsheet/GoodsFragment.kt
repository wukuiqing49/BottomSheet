package com.wkq.bottomsheet

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.wkq.bottomsheet.databinding.FragmentGoodsBinding
import com.wkq.sheet.BaseBottomSheetFragment
import com.wkq.sheet.BottomSheetExpendObservable
import java.util.*


/**
 * @author wkq
 *
 * @date 2022年08月11日 13:22
 *
 *@des
 *
 */

class GoodsFragment : BaseBottomSheetFragment(), Observer {


    override fun getCornerRadius() =
        requireContext().resources.getDimension(R.dimen.live_goods_corner_radius)

    override fun getStatusBarColor() = Color.TRANSPARENT

    var binding: FragmentGoodsBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_goods,
            container,
            false
        )
        return binding!!.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView() {

        BottomSheetExpendObservable.addObserver(this)
        var mAdapter=GoodsAdapter(requireActivity())
        binding!!.rvContent.layoutManager=LinearLayoutManager(activity)
        binding!!.rvContent.adapter=mAdapter
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
        mAdapter.addItem("2")
    }

    override fun onDestroy() {
        super.onDestroy()
        BottomSheetExpendObservable.deleteObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {

    }


}