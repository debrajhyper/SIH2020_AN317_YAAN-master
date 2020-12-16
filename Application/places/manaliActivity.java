package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class manaliActivity extends AppCompatActivity {

    TextView manali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manali);

        manali= findViewById(R.id.manali);

        manali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( manaliActivity.this, BookingActivity.class);
                startActivity(intent);
            }
        });

    }
}
