package com.piston.homeautomation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    Slider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slider = findViewById(R.id.slider);

        slider.addOnChangeListener((slider, value, fromUser) -> {
            String tv1 = Float.toString(value);
            Toast.makeText(MainActivity.this, tv1, Toast.LENGTH_SHORT).show();
        });
    }
}