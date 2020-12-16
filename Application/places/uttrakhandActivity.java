package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class uttrakhandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttrakhand);

        TextView uttrakhand;
        uttrakhand = findViewById(R.id.uttrakhand);

        uttrakhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(uttrakhandActivity.this, BookingActivity.class);
                startActivity(intent);
            }
        });
    }
}
