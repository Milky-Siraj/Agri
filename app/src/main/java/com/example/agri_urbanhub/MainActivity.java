package com.example.agri_urbanhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView viewCrop = findViewById(R.id.cardviewcrop);
        viewCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VeiwCropActivity2.class));
            }
        });

        CardView cropAnalysis = findViewById(R.id.cardcropAnalysis);
        cropAnalysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, cardcropAnalysisActivity.class));
            }
        });

        CardView irrigation = findViewById(R.id.cardirrigation);
        irrigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, irrigationActivity.class));
            }
        });

        CardView humidity = findViewById(R.id.cardhumidity);
        humidity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, humidityActivity.class));
            }
        });

        CardView tips = findViewById(R.id.cardTips);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, tipsActivity.class));
            }
        });
    }
}