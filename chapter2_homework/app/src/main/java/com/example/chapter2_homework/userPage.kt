package com.example.chapter2_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_user_page.*

class userPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_page)
        btn.setOnClickListener {
            val extraData = intent.getStringExtra("user_name")
            Toast.makeText(this, extraData, Toast.LENGTH_SHORT).show()
        }
    }
}
