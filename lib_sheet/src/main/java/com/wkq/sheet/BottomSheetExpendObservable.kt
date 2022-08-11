package com.wkq.sheet

import java.util.*


/**
 * @author wkq
 *
 * @date 2021年09月15日 15:24
 *
 *@des  底部是否展开的观察者
 *
 */

object BottomSheetExpendObservable:Observable() {

    fun updateBottomSheetState(isExpend: Boolean){
        setChanged()
        notifyObservers(isExpend)
    }

}