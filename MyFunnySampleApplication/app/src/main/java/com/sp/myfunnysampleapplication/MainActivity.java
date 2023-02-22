package com.sp.myfunnysampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sp.funnylibrary.FunnyMainClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FunnyMainClass mainClass = new FunnyMainClass();
        mainClass.MainFunction(this,10,15);
    }
}