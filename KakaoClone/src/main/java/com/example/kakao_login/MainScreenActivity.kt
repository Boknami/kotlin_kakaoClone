package com.example.kakao_login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

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

        var bnv_main = findViewById(R.id.bnv_main) as BottomNavigationView

        // OnNavigationItemSelectedListener를 통해 탭 아이템 선택 시 이벤트를 처리
        // navi_menu.xml 에서 설정했던 각 아이템들의 id를 통해 알맞은 프래그먼트로 변경하게 한다.
        bnv_main.run { setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.first -> {
                    // 다른 프래그먼트 화면으로 이동하는 기능
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, homeFragment).commit()
                }
                R.id.second -> {
                    val boardFragment = BoardFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, boardFragment).commit()
                }
                R.id.third -> {
                    val viewFragment = ViewFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, viewFragment).commit()
                }
                R.id.fourth -> {
                    val shoppingFragment = ShoppingFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, shoppingFragment).commit()
                }
                R.id.five -> {
                    val settingFragment = SettingFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, settingFragment).commit()
                }
            }
            true
        }
            selectedItemId = R.id.first
        }

        //val Adapter = UserAdapter(this,UserList )
        //findViewById<ListView>(R.id.listView).adapter = Adapter
        //만들 배열 리스트
        //val item = arrayOf("사과", "배", "딸기", "키위", "근재")

        //리스튜브는 어댑터가 있어야만 데이터를 보여줄 수 있다.
        //context => 한 액티비티의 모든 정보를 담고 있는
        //어댑터 달아줌 -> 기존 심플 리스트 아이템을 유지하면서 우리가 만든 아이템 배열을 넣어준다
        //findViewById<ListView>(R.id.listView).adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)


    }
}