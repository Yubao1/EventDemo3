package com.xe.eventdemo3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xe.views.MyView

class D_Activity : AppCompatActivity() {
    companion object {
        var TAG: String = "D_Activity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_)
    }
}
