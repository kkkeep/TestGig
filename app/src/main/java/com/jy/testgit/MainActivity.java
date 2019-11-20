package com.jy.testgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void fun1(){
        System.out.println("fun1");
    }


    private void fun2(){
        System.out.println("lisi");
    }
}
