package com.example.rcwallpaper_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class main_custom_adapter extends BaseAdapter {
    ArrayList<Integer> catagory;
    ArrayList<String> catagoryname;
    MainActivity mainActivity;
    TextView txt;
    ImageView img;

    public main_custom_adapter(ArrayList<Integer> catagory, ArrayList<String> catagoryname, MainActivity mainActivity) {
        this.catagory = catagory;
        this.catagoryname = catagoryname;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return catagory.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(mainActivity).inflate(R.layout.main_items,viewGroup,false);
        txt=view.findViewById(R.id.item_text);
        img=view.findViewById(R.id.item_image);
        txt.setText(catagoryname.get(i));
        img.setImageResource(catagory.get(i));

        return view;
    }
}
