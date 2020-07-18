package com.example.a1_calculator;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class calendar2 extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar2);
        init();
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

    private void init(){

        //Calendar를 이용하여 년, 월, 일, 시간, 분을 PICKER에 넣어준다.
        final Calendar cal = Calendar.getInstance();

//        Log.e(TAG, cal.get(Calendar.YEAR)+"");
//        Log.e(TAG, cal.get(Calendar.MONTH)+1+"");
//        Log.e(TAG, cal.get(Calendar.DATE)+"");
//        Log.e(TAG, cal.get(Calendar.HOUR_OF_DAY)+"");
//        Log.e(TAG, cal.get(Calendar.MINUTE)+"");

        //DATE PICKER DIALOG
        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog dialog = new DatePickerDialog(calendar2.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {

                        String msg = String.format("%d 년 %d 월 %d 일", year, month+1, date);
                        Toast.makeText(calendar2.this, msg, Toast.LENGTH_SHORT).show();
                    }
                }, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));

                dialog.getDatePicker().setMaxDate(new Date().getTime());    //입력한 날짜 이후로 클릭 안되게 옵션
                dialog.show();

            }
        });


        //TIME PICKER DIALOG
        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TimePickerDialog dialog = new TimePickerDialog(calendar2.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int min) {

                        String msg = String.format("%d 시 %d 분", hour, min);
                        Toast.makeText(calendar2.this, msg, Toast.LENGTH_SHORT).show();
                    }
                }, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true);  //마지막 boolean 값은 시간을 24시간으로 보일지 아닐지

                dialog.show();

            }
        });
    }
}
