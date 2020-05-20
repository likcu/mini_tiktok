package com.example.chapter2_homework;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.exe3.*

import java.util.LinkedList;

class Exercise3 : AppCompatActivity() {

    private val userList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exe3)
        initUsers()
        val adapter = UserAdapter(this, R.layout.users, userList)
        listView.adapter = adapter
        listView.setOnItemClickListener{ _, _, position, _ ->
            val user = userList[position]
            //Toast.makeText(this, user.name, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, userPage::class.java)
            intent.putExtra("user_name", user.name)
            startActivity(intent)
        }
    }

    private fun initUsers() {
        userList.add(User("Apple",R.drawable.apple_pic))
        userList.add(User("Banana", R.drawable.banana_pic))
        userList.add(User("Orange", R.drawable.orange_pic))
        userList.add(User("Watermelon", R.drawable.watermelon_pic))
    }
}
