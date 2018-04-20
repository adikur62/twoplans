package com.example.praba.twoplans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DesaActivity extends AppCompatActivity {
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler1);

        list = (RecyclerView) findViewById(R.id.sub_list);
        list.setLayoutManager(new LinearLayoutManager(this));
        SubAdapterDesa adapter = new SubAdapterDesa(DesaActivity.this);
        list.setAdapter(adapter);
    }
}
