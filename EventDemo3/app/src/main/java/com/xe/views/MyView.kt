package com.xe.views

import android.content.Context
import android.support.annotation.Nullable
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.xe.eventdemo3.D_Activity

/**
 * Created by 86188 on 2021/7/26.
 */
class MyView: View {
     constructor(context: Context): super(context) {
     }
    constructor(context: Context,@Nullable attrs: AttributeSet): super(context,attrs) {
    }
    constructor(context: Context,@Nullable attrs: AttributeSet,defStyleAttr: Int): super(context,attrs,defStyleAttr) {
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var b: Boolean = super.onTouchEvent(event)
        Log.d(D_Activity.TAG,"MyView----" + b)
        return b
    }
}