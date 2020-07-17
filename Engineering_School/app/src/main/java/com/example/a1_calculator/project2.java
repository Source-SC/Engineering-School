package com.example.a1_calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class project2 extends Activity {


    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hanyang);

        new Thread(new Runnable() {
            @Override
            public void run() {
                final TextView tv1 = (TextView) findViewById(R.id.tv1) ;
                int count = 3;
                while(count > 0) { // 현재 UI 스레드가 아니기 때문에 메시지 큐에 Runnable을 등록 함
                    count--;
                    final int finalCount = count;

                    Message msg = handler.obtainMessage();
                    msg.arg1 = count;
                    handler.sendMessage(msg);
                    tv1.setText("" + count);

//                    runOnUiThread(new Runnable() {
//                        public void run() { // 메시지 큐에 저장될 메시지의 내용
//                            tv1.setText("" + finalCount);
//                        }
//                    });
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        MainPage.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
                finish();
            }
        }).start();
    }

}
