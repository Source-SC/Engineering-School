package com.example.a1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);



        Button bt0 = (Button)findViewById(R.id.btn0);
        Button bt1 = (Button)findViewById(R.id.btn1);
        Button bt2 = (Button)findViewById(R.id.btn2);
        Button bt3 = (Button)findViewById(R.id.btn3);
        Button bt4 = (Button)findViewById(R.id.btn4);
        Button bt5 = (Button)findViewById(R.id.btn5);
        Button bt6 = (Button)findViewById(R.id.btn6);
        Button bt7 = (Button)findViewById(R.id.btn7);
        Button bt8 = (Button)findViewById(R.id.btn8);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        calculator.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        project1.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        project1.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        layout_study.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        layout_study2.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        layout_study3.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        profile.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        login.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        layout_study6.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
    } // end onCreate()
} // e
