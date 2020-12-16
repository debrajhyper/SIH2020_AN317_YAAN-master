package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class goldentempleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldentemple);

        TextView goldenTemple;
        goldenTemple = findViewById(R.id.goldentemple);

        goldenTemple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goldentempleActivity.this, BookingActivity.class);
                startActivity(intent);
            }
        });
    }
}
