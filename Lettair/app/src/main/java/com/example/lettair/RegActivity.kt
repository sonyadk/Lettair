package com.example.lettair

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_reg.*

class RegActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
    }



    fun regMain(view: View){
        val regIntent = Intent(this, MainActivity::class.java)
        startActivity(regIntent)
    }
}
