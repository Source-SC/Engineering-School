package com.example.a1_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class project1 extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.project1);
        final ImageView img_up1 = (ImageView) findViewById(R.id.img_up_1) ;
        final ImageView img_up2 = (ImageView) findViewById(R.id.img_up_2) ;
        final ImageView img_down1 = (ImageView) findViewById(R.id.img_down_1) ;
        final ImageView img_down2 = (ImageView) findViewById(R.id.img_down_2) ;

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn_up : // 0
                        if(count == 0){
                            img_up1.setVisibility(View.INVISIBLE);
                            img_up2.setVisibility(View.VISIBLE);
                            img_down1.setVisibility(View.VISIBLE);
                            img_down2.setVisibility(View.INVISIBLE);
                            count = 1;
                            break ;
                        }
                        else{
                            img_up1.setVisibility(View.VISIBLE);
                            img_up2.setVisibility(View.INVISIBLE);
                            img_down1.setVisibility(View.INVISIBLE);
                            img_down2.setVisibility(View.VISIBLE);
                            count = 0;
                            break ;
                        }
                    case R.id.btn_down : // 0
                        if(count == 0){
                            img_up1.setVisibility(View.INVISIBLE);
                            img_up2.setVisibility(View.VISIBLE);
                            img_down1.setVisibility(View.VISIBLE);
                            img_down2.setVisibility(View.INVISIBLE);
                            count = 1;
                            break ;
                        }
                        else{
                            img_up1.setVisibility(View.VISIBLE);
                            img_up2.setVisibility(View.INVISIBLE);
                            img_down1.setVisibility(View.INVISIBLE);
                            img_down2.setVisibility(View.VISIBLE);
                            count = 0;
                            break ;
                        }
                }
            }
        } ;

        Button btn_up = (Button) findViewById(R.id.btn_up) ;
        btn_up.setOnClickListener(onClickListener) ;
        Button btn_down = (Button) findViewById(R.id.btn_down) ;
        btn_down.setOnClickListener(onClickListener) ;
    }
}
