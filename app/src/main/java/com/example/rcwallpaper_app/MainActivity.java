package com.example.rcwallpaper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView  gridView;
    ArrayList<Integer> catagory = new ArrayList<>();
    ArrayList<Integer> hanuman = new ArrayList<>();
    ArrayList<Integer> mahadev = new ArrayList<>();
    ArrayList<Integer> ganesh = new ArrayList<>();
    ArrayList<Integer> krishna = new ArrayList<>();
    ArrayList<Integer> ram = new ArrayList<>();
    ArrayList<String> catagoryname = new ArrayList<>();
    main_custom_adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        fillcatagory();fillname();fillhanuman();fillmahadev();
        adapter= new main_custom_adapter(catagory,catagoryname,this);
        gridView.setNumColumns(2);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,perticular_content.class);
                if(i==4){
                    intent.putIntegerArrayListExtra("hanuman",hanuman);
                    intent.putExtra("pos",i);

                }else if(i==0){
                    intent.putIntegerArrayListExtra("hanuman",mahadev);
                    intent.putExtra("pos",i);

                }
                startActivity(intent);
            }
        });

    }

    public void init(){
        gridView=findViewById(R.id.main_grid);
    }
    public void fillcatagory(){
        catagory.add(R.drawable.mahadev);
        catagory.add(R.drawable.ganesh);
        catagory.add(R.drawable.krishna);
        catagory.add(R.drawable.ram);
        catagory.add(R.drawable.hanuman);

    }
    public void fillname(){
        catagoryname.add("Lord Mahadev");
        catagoryname.add("Lord Ganesh");
        catagoryname.add("Lord Krishna");
        catagoryname.add("Lord Ram");
        catagoryname.add("Lord Hanuman");
    }
    public void fillhanuman(){
        hanuman.add(R.drawable.img);
        hanuman.add(R.drawable.img_1);
        hanuman.add(R.drawable.img_2);
        hanuman.add(R.drawable.img_3);
        hanuman.add(R.drawable.img_4);
    }
    public void fillmahadev(){
        mahadev.add(R.drawable.img_5);
        mahadev.add(R.drawable.img_6);
        mahadev.add(R.drawable.img_7);
        mahadev.add(R.drawable.img_8);
        mahadev.add(R.drawable.img_9);
        mahadev.add(R.drawable.img_10);
    }
}