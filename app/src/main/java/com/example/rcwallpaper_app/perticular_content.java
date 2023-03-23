package com.example.rcwallpaper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class perticular_content extends AppCompatActivity implements View.OnClickListener {

    ImageButton img;
    ArrayList<Integer> temp= new ArrayList<>();
    ImageButton left,right;
    int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perticular_content);
        img=findViewById(R.id.content_image);
        left=findViewById(R.id.content_left);
        right=findViewById(R.id.content_right);
        left.setOnClickListener(this);
        right.setOnClickListener(this);
        temp=getIntent().getIntegerArrayListExtra("hanuman");
        pos=getIntent().getIntExtra("pos",0);
        img.setImageResource(temp.get(pos));
        img.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==left.getId()){
            if(pos>0) {
                pos--;
                img.setImageResource(temp.get(pos));
            }
        }
        if(view.getId()==right.getId()){
            if(pos<temp.size()-1) {
                pos++;
                img.setImageResource(temp.get(pos));
            }
        }
        if(view.getId()==img.getId()){
            Intent intent = new Intent(perticular_content.this,alert_image.class);
            intent.putExtra("image",temp.get(pos));
            startActivity(intent);
        }
    }
}