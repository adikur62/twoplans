package com.example.praba.twoplans;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView list;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        list = (RecyclerView) findViewById(R.id.home_list);
        list.setLayoutManager(new LinearLayoutManager(this));
        HomeAdapter adapter = new HomeAdapter(RecyclerActivity.this);
        list.setAdapter(adapter);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                drawerLayout.closeDrawers();
                switch(menuItem.getItemId()){
                    case R.id.navigation1:
                        Toast.makeText(getApplicationContext(), "Beranda Telah Dipilih", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.navigation2:
                        Toast.makeText(getApplicationContext(), "Profile Telah Dipilih", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.navigation3:
                        Toast.makeText(getApplicationContext(), "Daftar Telah Dipilih", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.navigation4:
                        Toast.makeText(getApplicationContext(), "Setting Telah Dipilih", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.navigation5:
                        Toast.makeText(getApplicationContext(), "About Telah Dipilih", Toast.LENGTH_SHORT).show();
                        return true;

                    default:
                        Toast.makeText(getApplicationContext(), "Kesalahan Terjadi", Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer,R.string.closeDrawer){
            @Override
            public void onDrawerClosed(View drawerView){
                super.onDrawerClosed(drawerView);
            }
            @Override
            public void onDrawerOpened(View drawerView){
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}
