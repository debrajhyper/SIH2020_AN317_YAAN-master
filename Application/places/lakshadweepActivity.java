package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lakshadweepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakshadweep);

        TextView lakshadweep;
        lakshadweep = findViewById(R.id.lakshadweep);

        lakshadweep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lakshadweepActivity.this, BookingActivity.class);
                startActivity(intent);
            }
        });
    }
}
