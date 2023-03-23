package com.example.rcwallpaper_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class alert_image extends AppCompatActivity {
ImageButton alimg;
AlertDialog.Builder builder= new AlertDialog.Builder(alert_image.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_image);
        alimg=findViewById(R.id.alimage);
           int image=getIntent().getIntExtra("image",0);
           alimg.setImageResource(image);
        alimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}