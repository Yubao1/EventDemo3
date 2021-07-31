package com.xe.eventdemo3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class E_Activity : AppCompatActivity() {
    companion object {
        var TAG: String = "E_Activity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_)
    }
}
