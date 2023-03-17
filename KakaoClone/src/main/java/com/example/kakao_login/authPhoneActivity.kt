package com.example.kakao_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class authPhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth_phone)

        findViewById<Button>(R.id.btnMainScreen).setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
        }
    }
}