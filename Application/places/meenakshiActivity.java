package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class meenakshiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meenakshi);

        TextView meenakshi;
        meenakshi = findViewById(R.id.meenakshi);

        meenakshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(meenakshiActivity.this, BookingActivity.class);
                startActivity(intent);
            }
        });
    }
}
