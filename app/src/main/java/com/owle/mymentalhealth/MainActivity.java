package com.owle.mymentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.owle.mymentalhealth.utils.Tolls;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();


        LinearLayout favorite = findViewById(R.id.favorite);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MentalActivity2.class));
            }
        });
        LinearLayout btn_entertain = findViewById(R.id.btn_entertain);
        btn_entertain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SubKategoriActivity.class));
            }
        });
    }

    private void initToolbar() {
        Tolls.setSystemBarColor(this, R.color.blue_500);
    }
}