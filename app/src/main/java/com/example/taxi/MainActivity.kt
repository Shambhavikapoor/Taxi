package com.example.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun Get_started(view: View) {
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun Driver_button(view: View) {}
    fun Login_button(view: View) {}
}