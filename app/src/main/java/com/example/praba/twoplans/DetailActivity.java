package com.example.praba.twoplans;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imgGambar;
    TextView txtDet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //pemanggilan ID dari layout activity_detail.xml
        imgGambar = (ImageView) findViewById(R.id.imgDet);
        txtDet = (TextView) findViewById(R.id.txtDetail);


        // intent ini fungsinya adalah untuk menerima data dari HomeAdapter
        Intent terimadata = getIntent();
        String nm = terimadata.getStringExtra("Nama");
        getSupportActionBar().setTitle(nm);

        imgGambar.setImageResource(terimadata.getIntExtra("img", 1));
        txtDet.setText(terimadata.getStringExtra("Detail"));
        //angka satu itu menandakan bahwasannya nilai dari si integer (gak harus angka 1)


        // berfungsi untuk menampilkan icon back (kembali) di pojok kiri atas
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
}
