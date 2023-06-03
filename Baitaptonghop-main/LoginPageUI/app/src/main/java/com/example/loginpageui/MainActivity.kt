package com.example.loginpageui

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signUp = findViewById<TextView>(R.id.signUp)
        val logIn = findViewById<TextView>(R.id.logIn)
        val signIn = findViewById<Button>(R.id.signIn)
        val signUpLayout = findViewById<LinearLayout>(R.id.signUpLayout)
        val logInLayout = findViewById<LinearLayout>(R.id.logInLayout)
        signUp.setOnClickListener {
            signUp.background = resources.getDrawable(R.drawable.switch_trcks, null)
            signUp.setTextColor(resources.getColor(R.color.textColor, null))
            logIn.background = null
            signUpLayout.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
            logIn.setTextColor(resources.getColor(R.color.pinkColor, null))
        }
        logIn.setOnClickListener {
            signUp.background = null
            signUp.setTextColor(resources.getColor(R.color.pinkColor, null))
            logIn.background = resources.getDrawable(R.drawable.switch_trcks, null)
           signUpLayout.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.textColor, null))
        }
        signIn.setOnClickListener() {
            startActivity(Intent(this@MainActivity, NewActivity::class.java))
        }
    // test
    }
}