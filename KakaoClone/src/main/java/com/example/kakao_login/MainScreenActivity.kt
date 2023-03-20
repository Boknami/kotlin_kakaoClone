package com.example.kakao_login

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainScreenActivity : AppCompatActivity() {
    //임시 유저 정보 생성
    var UserList = arrayListOf<User>(
        User(R.drawable.android, "근재", "1", "안녕하세용?"),
        User(R.drawable.android, "근재", "2", "안녕하세용?"),
        User(R.drawable.android, "근재", "3", "안녕하세용?"),
        User(R.drawable.android, "근재", "4", "안녕하세용?"),
        User(R.drawable.android, "근재", "5", "안녕하세용?"),
        User(R.drawable.android, "근재", "6", "안녕하세용?"),
        User(R.drawable.android, "근재", "7", "안녕하세용?"),
        User(R.drawable.android, "근재", "8", "안녕하세용?")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val Adapter = UserAdapter(this,UserList )
        findViewById<ListView>(R.id.listView).adapter = Adapter
//        //만들 배열 리스트
//        val item = arrayOf("사과", "배", "딸기", "키위", "근재")
//
//        //리스튜브는 어댑터가 있어야만 데이터를 보여줄 수 있다.
//        //context => 한 액티비티의 모든 정보를 담고 있는
//        //어댑터 달아줌 -> 기존 심플 리스트 아이템을 유지하면서 우리가 만든 아이템 배열을 넣어준다
//        findViewById<ListView>(R.id.listView).adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)


    }
}