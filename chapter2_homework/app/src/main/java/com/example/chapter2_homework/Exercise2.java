package com.example.chapter2_homework;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.LinkedList;
import java.util.Queue;


/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercise2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exe2);
        Log.d("ex2", "onCreate");
        final TextView currentView = findViewById(R.id.countView);
        currentView.setText("Count: " + String.valueOf(getAllChildViewCount(findViewById(android.R.id.content).getRootView())));
    }

    public int getAllChildViewCount(View view) {
        int count = 0;
        Queue<ViewGroup> queue = new LinkedList<>();
        if(view instanceof ViewGroup){
            queue.add((ViewGroup)view);
        }else{
            count++;
        }
        while(!queue.isEmpty()){
            View currentView = queue.poll();
            int childCount = ((ViewGroup)currentView).getChildCount();
            for(int i = 0; i < childCount; i++){
                View child = ((ViewGroup)currentView).getChildAt(i);
                if(child instanceof ViewGroup){
                    queue.add((ViewGroup)child);
                }else{
                    count++;
                }
            }
        }
        return count;
    }
}
