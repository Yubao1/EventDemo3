package com.xe.eventdemo3

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by 86188 on 2021/7/26.
 */
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_d -> {
                var intent: Intent = Intent(this,D_Activity::class.java)
                startActivity(intent)
            }

            R.id.btn_e -> {
                var intent: Intent = Intent(this,E_Activity::class.java)
                startActivity(intent)
            }

            R.id.btn_f -> {
                var intent: Intent = Intent(this,F_Activity::class.java)
                startActivity(intent)
            }
        }
    }
}