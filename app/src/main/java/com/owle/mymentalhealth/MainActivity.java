package com.owle.mymentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.owle.mymentalhealth.utils.Tolls;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
    }

    private void initToolbar() {
        Tolls.setSystemBarColor(this, R.color.blue_500);
    }
}