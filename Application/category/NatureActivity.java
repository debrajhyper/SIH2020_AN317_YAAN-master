package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        TextView ooty, lakshadweep, utthrakhand;
        ooty = findViewById(R.id.chardham);
        lakshadweep = findViewById(R.id.goldentemple);
        utthrakhand = findViewById(R.id.uttrakhand);

        ooty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NatureActivity.this, ootyActivity.class);
                startActivity(intent);
            }
        });

        lakshadweep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NatureActivity.this, lakshadweepActivity.class);
                startActivity(intent);
            }
        });

        utthrakhand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NatureActivity.this, uttrakhandActivity.class);
                startActivity(intent);
            }
        });

    }
}
