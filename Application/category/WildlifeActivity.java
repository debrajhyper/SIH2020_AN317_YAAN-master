package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WildlifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wildlife);

        TextView westBengal, rajasthan, utthrakhand;
        westBengal = findViewById(R.id.westbengal);
        rajasthan = findViewById(R.id.rajasthan);
        utthrakhand = findViewById(R.id.uttrakhand);

        westBengal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WildlifeActivity.this, westbengalActivity.class);
                startActivity(intent);
            }
        });

        rajasthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WildlifeActivity.this, rajasthanActivity.class);
                startActivity(intent);
            }
        });

        utthrakhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WildlifeActivity.this, uttrakhandActivity.class);
                startActivity(intent);
            }
        });
    }
}
