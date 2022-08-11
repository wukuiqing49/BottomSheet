package com.wkq.sheet


import android.content.Context
import android.content.res.Configuration
import android.util.TypedValue


inline fun <T, R> T?.runIfNotNull(block: T.() -> R): R? = this?.block()



fun Context?.isTablet() = this?.resources?.getBoolean(R.bool.super_bottom_sheet_isTablet)
    ?: false

fun Context?.isInPortrait() = this?.resources?.configuration?.orientation == Configuration.ORIENTATION_PORTRAIT

internal fun Context.getAttrId(attrId: Int): Int {
    TypedValue().run {
        return when {
            !theme.resolveAttribute(attrId, this, true) -> INVALID_RESOURCE_ID
            else -> resourceId
        }
    }
}