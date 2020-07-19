package com.example.a1_calculator;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewAnimator;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class myuser {
    String name;
    String num;

    void setprofile(String input, String input2){
        name = input;
        num = input2;
    }
}

public class listview_1 extends AppCompatActivity {
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3", "LIST4"};

    private EditText editSearch;
    private ListView listView;
    private ListAdapter oAdapter;
    ArrayList<myuser> oData = new ArrayList<>();
    ArrayList<myuser> tmp = new ArrayList<>();



    private ListView my = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_1);

        editSearch = (EditText) findViewById(R.id.et);
        listView = (ListView) findViewById(R.id.listview1);

        myuser user1 = new myuser();
        user1.setprofile("kim", "010-1234-1234");
        myuser user2 = new myuser();
        user2.setprofile("lee", "010-2345-3456");
        myuser user3 = new myuser();
        user3.setprofile("park", "010-4567-5678");
        myuser user4 = new myuser();
        user4.setprofile("choi", "010-1351-1345");

        oData.add(user1);
        oData.add(user2);
        oData.add(user3);
        oData.add(user4);

        tmp.add(user1);
        tmp.add(user2);
        tmp.add(user3);
        tmp.add(user4);

        my = (ListView) findViewById(R.id.listview1);
//        oAdapter = new ListAdapter(oData);
        oAdapter = new ListAdapter(oData, this);
        my.setAdapter(oAdapter);

        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = editSearch.getText().toString();
                search(text);
            }
        });
    }
    public void search(String charText) {
        //Toast.makeText(getApplicationContext(),"click", Toast.LENGTH_SHORT).show();

        oData.clear();
        if(charText.length() == 0){
            oData.addAll(tmp);
        }

        for(int i=0; i<4; i++){
            if(charText.equals(tmp.get(i).name)){
                oData.add(tmp.get(i));
            }
        }

        oAdapter = new ListAdapter(oData, this);
        my.setAdapter(oAdapter);

        oAdapter.notifyDataSetChanged();
    }

}