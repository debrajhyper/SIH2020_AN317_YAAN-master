package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class kerelaActivity extends AppCompatActivity {

    TextView kerela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerela);

        kerela= findViewById(R.id.kerela);

        kerela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( kerelaActivity.this, BookingActivity.class);
                startActivity(intent);
            }
        });

    }
}
