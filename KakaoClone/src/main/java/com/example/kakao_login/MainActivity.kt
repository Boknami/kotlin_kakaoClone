package com.example.kakao_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val makeAccountButton = findViewById<Button>(R.id.make_account_btn)

        fun moveAccountPage(){
            val intent = Intent(this, subActivity::class.java)
            startActivity(intent)
        }

        makeAccountButton.setOnClickListener{
            moveAccountPage()
        }
    }
}