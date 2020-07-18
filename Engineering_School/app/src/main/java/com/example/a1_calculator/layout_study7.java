package com.example.a1_calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class layout_study7 extends AppCompatActivity {
    // appcompatactivity 가 원래 갖고있는것을 제정의할것이다.

    String TAG = "디버그";

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_study7);

        Log.d(TAG, "-=-=-=-=-=-=-=-=-=-=-= onCreat -=-=-=-=-=-=-=-=-");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "-=-=-=-=-=-=-=-=-=-=-= onStart -=-=-=-=-=-=-=-=-");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "-=-=-=-=-=-=-=-=-=-=-= onResume -=-=-=-=-=-=-=-=-");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "-=-=-=-=-=-=-=-=-=-=-= onPause -=-=-=-=-=-=-=-=-");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "-=-=-=-=-=-=-=-=-=-=-= onStop -=-=-=-=-=-=-=-=-");
    }


    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "-=-=-=-=-=-=-=-=-=-=-= onRestart -=-=-=-=-=-=-=-=-");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "-=-=-=-=-=-=-=-=-=-=-= onDestroy -=-=-=-=-=-=-=-=-");
    }
}
/*
탭레이아웃으로 구현

결제의 경우
SDK 제공하는곳이 많다.
bootpay
 */
