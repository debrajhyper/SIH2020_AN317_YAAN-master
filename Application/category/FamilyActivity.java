package com.example.yaan;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FamilyActivity extends AppCompatActivity {

    TextView kerela, himachal, rajasthan;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);



        kerela = findViewById(R.id.kerela);
        himachal = findViewById(R.id.himachal);
        rajasthan = findViewById(R.id.rajasthan);

        kerela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FamilyActivity.this, kerelaActivity.class);
                startActivity(intent);
            }
        });

        himachal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FamilyActivity.this, himachalActivity.class);
                startActivity(intent);
            }
        });

        rajasthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FamilyActivity.this, rajasthanActivity.class);
                startActivity(intent);
            }
        });
    }
}
