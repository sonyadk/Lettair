package com.example.lettair

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegOrLogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_or_log)
    }

    fun logMe(view: View){
        val logIntent = Intent(this, LoginActivity::class.java)
        startActivity(logIntent)
    }

    fun regMe(view: View){
        val regIntent = Intent(this, RegActivity::class.java)
        startActivity(regIntent)
    }
}

