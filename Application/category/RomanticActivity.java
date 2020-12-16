package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RomanticActivity extends AppCompatActivity {

    TextView goa, andaman, manali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic);

        goa = findViewById(R.id.goa);
        andaman = findViewById(R.id.andaman);
        manali = findViewById(R.id.manali);

        goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RomanticActivity.this, goaActivity.class);
                startActivity(intent);
            }
        });

        andaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RomanticActivity.this, andamanActivity.class);
                startActivity(intent);
            }
        });

        manali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RomanticActivity.this, manaliActivity.class);
                startActivity(intent);
            }
        });
    }
}
