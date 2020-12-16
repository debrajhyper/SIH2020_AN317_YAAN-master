package com.example.yaan;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        TextView taj, hampi, ba;
        taj = findViewById(R.id.tajmahal);
        hampi = findViewById(R.id.hampi);
        ba = findViewById(R.id.bannerghatta);

        taj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationActivity.this, tajmahalActivity.class);
                startActivity(intent);
            }
        });

        hampi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationActivity.this, hampiActivity.class);
                startActivity(intent);
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationActivity.this, bannerghattaActivity.class);
                startActivity(intent);
            }
        });

    }
}
