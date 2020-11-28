package com.example.kt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_list extends AppCompatActivity {
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<DataModel> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lv = (ListView) findViewById(R.id.listview);
        arr_bean = new ArrayList<DataModel>();
        arr_bean.add(new DataModel(R.drawable.image3,"Nguyễn Hữu TUấn","Hello"));
        arr_bean.add(new DataModel(R.drawable.image2,"Nguyễn Văn Trí","Hi"));
        arr_bean.add(new DataModel(R.drawable.image3,"Dưỡng Dương","Hello"));
        arr_bean.add(new DataModel(R.drawable.image4,"Phúc Trịnh","Hello"));
        arr_bean.add(new DataModel(R.drawable.image5,"An Nguyễn","Hello"));
        arr_bean.add(new DataModel(R.drawable.image6,"Hà Đại Nghĩa","Hi"));
        arr_bean.add(new DataModel(R.drawable.image4,"Phúc Trịnh","Hi"));
        adapter = new ListViewBaseAdapter(arr_bean, this);
        lv.setAdapter(adapter);
    }
}