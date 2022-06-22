package com.news.speed_meter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import in.unicodelabs.kdgaugeview.KdGaugeView;

public class MainActivity extends AppCompatActivity {
    KdGaugeView kdGaugeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kdGaugeView = findViewById(R.id.speedMeter);
        kdGaugeView.setSpeed(150);
    }
}
