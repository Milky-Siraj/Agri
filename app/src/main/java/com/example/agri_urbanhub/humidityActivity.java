package com.example.agri_urbanhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class humidityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humidity);
        CardView viewCrop= findViewById(R.id.cardHome);
        viewCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(humidityActivity.this,MainActivity.class));


            }
        });
        CardView viewhumidty= findViewById(R.id.cardviewhumidity);
        viewhumidty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(humidityActivity.this, viewHumidity.class));


            }
        });
    }
}