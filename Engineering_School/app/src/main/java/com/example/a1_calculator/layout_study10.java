package com.example.a1_calculator;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class layout_study10 extends AppCompatActivity {
    ArrayList<String> strArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 기본 생성 코드 및 ListView와 Adapter 생성 코드
        // ...

        // 위에서 생성한 listview에 클릭 이벤트 핸들러 정의.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_study8);

        for(int i=0;i<20;i++){
            strArrayList.add(i + "번째");
        }
        AdapterView listview = (ListView) findViewById(R.id.listview1);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position);

                String titleStr = item.getTitle();
                String descStr = item.getDesc();
                Drawable iconDrawable = item.getIcon();


                // TODO : use item data.
            }
        });
    }
}
