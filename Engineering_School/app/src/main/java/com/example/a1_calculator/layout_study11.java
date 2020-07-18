package com.example.a1_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class layout_study11 extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_study11);
//        final ImageView im1 = (ImageView) findViewById(R.id.img1) ;
//        final ImageView im2 = (ImageView) findViewById(R.id.img2) ;

//        Button.OnClickListener onClickListener = new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch (view.getId()) {
//                    case R.id.btn1 : // 0
//                        if(count == 0){
//                            im1.setVisibility(View.INVISIBLE);
//                            im2.setVisibility(View.VISIBLE);
//                            count = 1;
//                            break ;
//                        }
//                        else{
//                            im2.setVisibility(View.INVISIBLE);
//                            im1.setVisibility(View.VISIBLE);
//                            count = 0;
//                            break ;
//                        }
//
//                }
//            }
//        } ;
//
//        Button bt1 = (Button) findViewById(R.id.btn1) ;
//        bt1.setOnClickListener(onClickListener) ;
    }
}
