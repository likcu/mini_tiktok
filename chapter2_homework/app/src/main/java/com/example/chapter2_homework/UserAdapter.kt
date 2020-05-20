package com.example.chapter2_homework

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter(activity: Activity, val resourceId: Int, data: List<User>) : ArrayAdapter<User>(activity, resourceId, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(resourceId, parent, false)
        val userImage: ImageView = view.findViewById(R.id.image)
        val userName: TextView = view.findViewById(R.id.userName)
        val user = getItem(position)
        if(user != null) {
            userImage.setImageResource(user.imageId)
            userName.text = user.name
        }
        return view
    }
}