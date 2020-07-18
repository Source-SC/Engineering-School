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

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bal0 : // 0
                        Intent intent0 = new Intent(
                                getApplicationContext(),
                                layout_study.class);
                        startActivity(intent0);
                        break ;
                    case R.id.bal1 : // 1
                        Intent intent1 = new Intent(
                                getApplicationContext(),
                                layout_study2.class);
                        startActivity(intent1);
                        break ;
                    case R.id.bal2 : // 2
                        Intent intent2 = new Intent(
                                getApplicationContext(),
                                layout_study3.class);
                        startActivity(intent2);
                        break ;
                    case R.id.bal3 : // 3
                        Intent intent3 = new Intent(
                                getApplicationContext(),
                                calendar.class);
                        startActivity(intent3);
                        break ;
                    case R.id.bal4 : // 4
                        Intent intent4 = new Intent(
                                getApplicationContext(),
                                layout_study7.class);
                        startActivity(intent4);
                        break ;
                    case R.id.bal5 : // 5
                        Intent intent5 = new Intent(
                                getApplicationContext(),
                                ListViewItem.class);
                        startActivity(intent5);
                        break ;
                    case R.id.bal6 : // 6
                        Intent intent6 = new Intent(
                                getApplicationContext(),
                                ListViewAdapter.class);
                        startActivity(intent6);
                        break ;
                    case R.id.bal7 : // 7
                        Intent intent7 = new Intent(
                                getApplicationContext(),
                                layout_study10.class);
                        startActivity(intent7);
                        break ;
                    case R.id.bal8 : // 8
                        Intent intent8 = new Intent(
                                getApplicationContext(),
                                layout_study11.class);
                        startActivity(intent8);
                        break ;
                    case R.id.f1 : // 9
                        Intent intentf1 = new Intent(
                                getApplicationContext(),
                                calculator.class);
                        startActivity(intentf1);
                        break ;
                    case R.id.f2 : // +
                        Intent intentf2 = new Intent(
                                getApplicationContext(),
                                change_image.class);
                        startActivity(intentf2);
                        break ;
                    case R.id.f3 : // -
                        Intent intentf3 = new Intent(
                                getApplicationContext(),
                                profile.class);
                        startActivity(intentf3);
                        break ;
                    case R.id.f4 : // x
                        Intent intentf4 = new Intent(
                                getApplicationContext(),
                                login.class);
                        startActivity(intentf4);
                        break ;
                    case R.id.f5 : // /
                        Intent intentf5= new Intent(
                                getApplicationContext(),
                                calendar2.class);
                        startActivity(intentf5);
                        break ;
//                    case R.id.f6 : // =
//                        Intent intentf6 = new Intent(
//                                getApplicationContext(),
//                                layout_study.class);
//                        startActivity(intentf6);
//                        break ;
                }
            }
        } ;

        Button bal0 = (Button) findViewById(R.id.bal0) ;
        bal0.setOnClickListener(onClickListener) ;
        Button bal1 = (Button) findViewById(R.id.bal1) ;
        bal1.setOnClickListener(onClickListener) ;
        Button bal2 = (Button) findViewById(R.id.bal2) ;
        bal2.setOnClickListener(onClickListener) ;
        Button bal3 = (Button) findViewById(R.id.bal3) ;
        bal3.setOnClickListener(onClickListener) ;
        Button bal4 = (Button) findViewById(R.id.bal4) ;
        bal4.setOnClickListener(onClickListener) ;
        Button bal5 = (Button) findViewById(R.id.bal5) ;
        bal5.setOnClickListener(onClickListener) ;
        Button bal6 = (Button) findViewById(R.id.bal6) ;
        bal6.setOnClickListener(onClickListener) ;
        Button bal7 = (Button) findViewById(R.id.bal7) ;
        bal7.setOnClickListener(onClickListener) ;
        Button bal8 = (Button) findViewById(R.id.bal8) ;
        bal8.setOnClickListener(onClickListener) ;
//        Button bal9 = (Button) findViewById(R.id.bal9) ;
//        bal9.setOnClickListener(onClickListener) ;
        Button f1 = (Button) findViewById(R.id.f1) ;
        f1.setOnClickListener(onClickListener) ;
        Button f2 = (Button) findViewById(R.id.f2) ; // +
        f2.setOnClickListener(onClickListener) ;
        Button f3 = (Button) findViewById(R.id.f3) ; // =
        f3.setOnClickListener(onClickListener) ;
        Button f4 = (Button) findViewById(R.id.f4) ; // -
        f4.setOnClickListener(onClickListener) ;
        Button f5 = (Button) findViewById(R.id.f5) ; // x
        f5.setOnClickListener(onClickListener) ;
        Button f6 = (Button) findViewById(R.id.f6) ; // /
        f6.setOnClickListener(onClickListener) ;
//        Button bt2 = (Button) findViewById(R.id.btn2) ; // /
//        bt2.setOnClickListener(onClickListener) ;
    } // end onCreate()
} // e
