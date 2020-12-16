package com.example.yaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {
    FloatingActionButton alexa;
    TextView romantic, family, adventure, religious, nature, wildlife, eductaion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        romantic = findViewById(R.id.romantic);
        family = findViewById(R.id.family);
        adventure = findViewById(R.id.adventure);
        religious = findViewById(R.id.religious);
        nature = findViewById(R.id.nature);
        wildlife = findViewById(R.id.wildlife);
        eductaion = findViewById(R.id.education);
        alexa = findViewById(R.id.alexa);

        romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,RomanticActivity.class);
                startActivity(intent);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,FamilyActivity.class);
                startActivity(intent);
            }
        });

        adventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,AdventureActivity.class);
                startActivity(intent);
            }
        });

        religious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ReligiousActivity.class);
                startActivity(intent);
            }
        });

        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,NatureActivity.class);
                startActivity(intent);
            }
        });

        wildlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,WildlifeActivity.class);
                startActivity(intent);
            }
        });

        eductaion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,EducationActivity.class);
                startActivity(intent);
            }
        });

        alexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, featuresActivity.class);
                startActivity(intent);
            }
        });
    }
}
