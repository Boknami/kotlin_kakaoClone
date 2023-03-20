package com.example.kakao_login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {
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

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        //val Adapter = UserAdapter(this,UserList )
        //findViewById<ListView>(R.id.listView).adapter = Adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}