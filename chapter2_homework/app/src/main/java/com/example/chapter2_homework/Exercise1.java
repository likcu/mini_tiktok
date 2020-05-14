package com.example.chapter2_homework;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exercise1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exe1);
        Log.d("ex1", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ex1", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ex1", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ex1", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ex1", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ex1", "onDestroy");
    }

}
