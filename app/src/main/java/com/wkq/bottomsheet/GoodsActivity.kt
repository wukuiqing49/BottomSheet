package com.wkq.bottomsheet

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * @author wkq
 *
 * @date 2022年08月11日 13:58
 *
 *@des
 *
 */

class GoodsActivity:AppCompatActivity() {

    var liveGoodsFragment:GoodsFragment?=null
    companion object {
        fun newIntent(context: Activity) {
            val intent = Intent(context, GoodsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setTranslucentForImageView(this, 0, null)
        liveGoodsFragment = GoodsFragment()
        liveGoodsFragment!!.show(supportFragmentManager, "LiveGoodsFragment")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (liveGoodsFragment!=null)liveGoodsFragment!!.onActivityResult(requestCode, resultCode, data)

    }

}