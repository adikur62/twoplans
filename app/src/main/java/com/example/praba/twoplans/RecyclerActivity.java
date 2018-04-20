package com.example.praba.twoplans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        list = (RecyclerView) findViewById(R.id.home_list);
        list.setLayoutManager(new LinearLayoutManager(this));
        HomeAdapter adapter = new HomeAdapter(RecyclerActivity.this);
        list.setAdapter(adapter);
    }
}
