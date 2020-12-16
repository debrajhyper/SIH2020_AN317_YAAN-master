package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReligiousActivity extends AppCompatActivity {
    TextView chardham, goldenTemple, meenakshi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);

        chardham = findViewById(R.id.chardham);
        goldenTemple = findViewById(R.id.goldentemple);
        meenakshi = findViewById(R.id.meenakshi);

        chardham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousActivity.this, chardhamActivity.class);
                startActivity(intent);
            }
        });

        goldenTemple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousActivity.this, goldentempleActivity.class);
                startActivity(intent);
            }
        });

        meenakshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousActivity.this, meenakshiActivity.class);
                startActivity(intent);
            }
        });


    }
}
