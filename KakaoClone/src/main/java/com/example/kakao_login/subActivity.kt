package com.example.kakao_login

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class subActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        val btnallagree = findViewById<Button>(R.id.all_agree_btn)
        val btnage = findViewById<Button>(R.id.age_agree_btn)
        val auth_btn =  findViewById<Button>(R.id.auth_handphone_btn)

        btnallagree.setOnClickListener {
            Log.d("전체 동의", "눌렀다")
            btnallagree.setBackgroundColor(Color.parseColor("#F7E600"))
        }

        btnage.setOnClickListener {
            Log.d("나이 동의", "눌렀다")
            btnage.setBackgroundColor(Color.parseColor("#F7E600"))
        }

        auth_btn.setOnClickListener {
            Log.d("다음 페이지 이동", "다음 페이지 이동")
            val intent = Intent(this, authPhoneActivity::class.java)
            startActivity(intent)
        }
    }
}