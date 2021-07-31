package com.xe.views

import android.content.Context
import android.support.annotation.Nullable
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.xe.eventdemo3.E_Activity
import com.xe.eventdemo3.F_Activity

/**
 * Created by 86188 on 2021/7/28.
 */
class MyView4: View {

    constructor(context: Context): super(context) {
    }
    constructor(context: Context, @Nullable attrs: AttributeSet): super(context,attrs) {
    }
    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int): super(context,attrs,defStyleAttr) {
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(F_Activity.TAG,"--MyView4--onTouchEvent--ACTION_DOWN")
                super.onTouchEvent(event)
                parent.requestDisallowInterceptTouchEvent(false)
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(F_Activity.TAG,"--MyView4--onTouchEvent--ACTION_MOVE")
            }
            MotionEvent.ACTION_UP -> {
                Log.d(F_Activity.TAG,"--MyView4--onTouchEvent--ACTION_UP")
            }
        }
        return true
    }
}