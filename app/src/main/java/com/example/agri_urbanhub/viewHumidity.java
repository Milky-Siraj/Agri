package com.example.agri_urbanhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class viewHumidity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_humidity);
        TextView descriptionTextView = findViewById(R.id.description);
        int humidityValue=70;
        descriptionTextView.setText("Currently calculated humidity: " + humidityValue);
        TextView humidityMessageTextView = findViewById(R.id.humidityMessage);
        if (humidityValue > 60 && humidityValue<85) {
            humidityMessageTextView.setText("Humid Enough!");
            humidityMessageTextView.setTextColor(Color.parseColor("#00FF00"));
        } else {
            humidityMessageTextView.setText("Water soil to increase humidity. Re-measure for plant health. Thank you for improving growing conditions.");
            humidityMessageTextView.setTextColor(Color.parseColor("#FF0000"));
        }


    }
}