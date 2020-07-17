package com.example.a1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//

public class calculator extends AppCompatActivity {
    Button btnTest = null;
    Context context = this;
    TextView tv = null;
    int oper;
    int start = 0;
    // 0 is start, 1 is exist value,
    // 2 is +
    // 3 is -
    // 4 is x
    // 5 is /
    // 6 is after calculate
    int save = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView value = (TextView) findViewById(R.id.btn0);
                switch (view.getId()) {
                    case R.id.btn17 : // 0
                        //Toast.makeText(getApplicationContext(),"now is 0", Toast.LENGTH_SHORT).show();
                        number(0);
                        break ;
                    case R.id.btn13 : // 1
                        number(1);
                        break ;
                    case R.id.btn14 : // 2
                        number(2);
                        break ;
                    case R.id.btn15 : // 3
                        number(3);
                        break ;
                    case R.id.btn9 : // 4
                        number(4);
                        break ;
                    case R.id.btn10 : // 5
                        number(5);
                        break ;
                    case R.id.btn11 : // 6
                        number(6);
                        break ;
                    case R.id.btn5 : // 7
                        number(7);
                        break ;
                    case R.id.btn6 : // 8
                        number(8);
                        break ;
                    case R.id.btn7 : // 9
                        number(9);
                        break ;
                    case R.id.btn16 : // +
                        plus();
                        break ;
                    case R.id.btn12 : // -
                        minus();
                        break ;
                    case R.id.btn8 : // x
                        multiple();
                        break ;
                    case R.id.btn4 : // /
                        divide();
                        break ;
                    case R.id.btn19 : // =
                        answer();
                        break ;
                    case R.id.btn1 : // AC
                        Toast.makeText(getApplicationContext(),"click", Toast.LENGTH_SHORT).show();

                        fun_ac();
                        break ;
                    case R.id.btn2 : // +/-
                        Toast.makeText(getApplicationContext(),"click", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(
                                getApplicationContext(), // 현재 화면의 제어권자
                                MainPage.class); // 다음 넘어갈 클래스 지정
                        startActivity(intent); // 다음 화면으로 넘어간다
                        break ;
                }
            }
        } ;

        Button bt17 = (Button) findViewById(R.id.btn17) ;
        bt17.setOnClickListener(onClickListener) ;
        Button bt13 = (Button) findViewById(R.id.btn13) ;
        bt13.setOnClickListener(onClickListener) ;
        Button bt14 = (Button) findViewById(R.id.btn14) ;
        bt14.setOnClickListener(onClickListener) ;
        Button bt15 = (Button) findViewById(R.id.btn15) ;
        bt15.setOnClickListener(onClickListener) ;
        Button bt9 = (Button) findViewById(R.id.btn9) ;
        bt9.setOnClickListener(onClickListener) ;
        Button bt10 = (Button) findViewById(R.id.btn10) ;
        bt10.setOnClickListener(onClickListener) ;
        Button bt11 = (Button) findViewById(R.id.btn11) ;
        bt11.setOnClickListener(onClickListener) ;
        Button bt5 = (Button) findViewById(R.id.btn5) ;
        bt5.setOnClickListener(onClickListener) ;
        Button bt6 = (Button) findViewById(R.id.btn6) ;
        bt6.setOnClickListener(onClickListener) ;
        Button bt7 = (Button) findViewById(R.id.btn7) ;
        bt7.setOnClickListener(onClickListener) ;
        Button bt1 = (Button) findViewById(R.id.btn1) ;
        bt1.setOnClickListener(onClickListener) ;
        Button bt16 = (Button) findViewById(R.id.btn16) ; // +
        bt16.setOnClickListener(onClickListener) ;
        Button bt19 = (Button) findViewById(R.id.btn19) ; // =
        bt19.setOnClickListener(onClickListener) ;
        Button bt12 = (Button) findViewById(R.id.btn12) ; // -
        bt12.setOnClickListener(onClickListener) ;
        Button bt8 = (Button) findViewById(R.id.btn8) ; // x
        bt8.setOnClickListener(onClickListener) ;
        Button bt4 = (Button) findViewById(R.id.btn4) ; // /
        bt4.setOnClickListener(onClickListener) ;
        Button bt2 = (Button) findViewById(R.id.btn2) ; // /
        bt2.setOnClickListener(onClickListener) ;

    }
    public void answer(){
        int tmp = getValue();
        if(oper == 2){
            setValue(tmp + save);
        }
        else if(oper == 3){
            setValue(save - tmp);
        }
        else if(oper == 4){
            setValue(tmp * save);
        }
        else if(oper == 5){
            setValue(save/tmp);
        }
        save = 0;
        start = 6;

    }


    public void plus(){
        save = getValue();
        start = 2;
        oper = 2;
    }

    public void minus(){
        save= getValue();
        start = 3;
        oper = 3;
    }

    public void multiple(){
        save = getValue();
        start = 4;
        oper = 4;
    }

    public void divide(){
        save = getValue();
        start = 5;
        oper = 5;
    }

    public void fun_ac(){
        start = 0;
        setValue(0);
    }

    public void number(int x){
        if(getValue() == 0 || start == 0){ // 초기화상태
            start = 1;
            setValue(x);
        }
        else if(start == 2 || start == 3 || start == 4 || start == 5){ // 사칙연산 이후
            setValue(x);
            start = 1;

        }
        else if(start == 6){
            setValue(x);
            start= 1;
        }
        else{
            int tmp = getValue();
            tmp = tmp * 10 + x;
            setValue(tmp);
        }
    }

    public int getValue(){
        tv = (TextView) findViewById(R.id.btn0);
        int num = Integer.parseInt(tv.getText().toString());
        return num;
    }

    public void setValue(int x){
        tv = (TextView) findViewById(R.id.btn0);
        tv.setText(String.valueOf(x));
    }

}

//intent intent = new Intent(context, MainActivity2.class);
//startActivity(intent);
