package com.example.rcwallpaper_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class alert_image extends AppCompatActivity {
ImageButton alimg;
AlertDialog.Builder builder;
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
                builder=new AlertDialog.Builder(alert_image.this);
                builder.setIcon(R.drawable.warning);
                builder.setTitle("warning");
                builder.setMessage("are you sure you want to exit");
                builder.setCancelable(true);
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }

        });

    }
}