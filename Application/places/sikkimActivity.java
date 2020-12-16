package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sikkimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikkim);

        TextView sikkim;
        sikkim = findViewById(R.id.sikkim);

        sikkim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sikkimActivity.this, BookingActivity.class);
                startActivity(intent);
            }
        });
    }
}
