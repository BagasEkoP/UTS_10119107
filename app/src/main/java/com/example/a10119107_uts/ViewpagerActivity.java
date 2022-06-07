package com.example.a10119107_uts;

// Nama     : Bagas Eko Pambudi
// NIM      : 10119107
// Kelas    : IF-3

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.a10119107_uts.MainActivity;
import com.example.a10119107_uts.R;



public class ViewpagerActivity extends AppCompatActivity {

    ViewPager viewpager;
    viewpageradapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        viewpager = findViewById(R.id.view_pager);
        viewPagerAdapter = new viewpageradapter(this);

        viewpager.setAdapter(viewPagerAdapter);
    }

    public void onClick(View view){
        Intent intent = new Intent(ViewpagerActivity.this, MainActivity.class);
        startActivity(intent);
    }
}