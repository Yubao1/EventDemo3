package com.xe.views

import android.content.Context
import android.support.annotation.Nullable
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.xe.eventdemo3.E_Activity

/**
 * Created by 86188 on 2021/7/27.
 */
class MyView3: View {
    constructor(context: Context): super(context) {
    }
    constructor(context: Context, @Nullable attrs: AttributeSet): super(context,attrs) {
    }
    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int): super(context,attrs,defStyleAttr) {
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(E_Activity.TAG,"--MyView3--ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(E_Activity.TAG,"--MyView3--ACTION_MOVE")
            }
            MotionEvent.ACTION_UP -> {
                Log.d(E_Activity.TAG,"--MyView3--ACTION_UP")
            }
        }
        return false
    }
}