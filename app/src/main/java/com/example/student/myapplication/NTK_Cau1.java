package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NTK_Cau1 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.ListViewCustom);
        ArrayList<Custom> customs=new ArrayList<>();
        customs.add(new Custom(R.drawable.kyduyen,"Kỳ Duyên","1990",R.drawable.eng));
        customs.add(new Custom(R.drawable.dangthuthao,"Đặng Thu Thảo","1992",R.drawable.duc));
        customs.add(new Custom(R.drawable.thanhhuyen,"Thanh Huyền","1979",R.drawable.barzil));

        CustomAdapter adapter=new CustomAdapter(this,customs);
        listView.setAdapter(adapter);
    }

}
