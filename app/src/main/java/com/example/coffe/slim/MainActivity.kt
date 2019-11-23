package com.example.coffe.slim

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.coffe.slim.reglog.LoginActivity


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.login) as Button
        btn.setOnClickListener {
            val i = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(i)
        }


    }
}