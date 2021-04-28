package com.example.listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adapter extends ArrayAdapter<CustomAdapter> {

    private Context mContext;
    private int mRessource;
    public Adapter(@NonNull Context context, int resource, ArrayList<CustomAdapter> objects) {
        super(context, resource, objects);
        this.mContext=context;
        this.mRessource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        convertView=layoutInflater.inflate(mRessource,parent,false);
        ImageView imageView=convertView.findViewById(R.id.imageView2);
        TextView textname=convertView.findViewById(R.id.txt1);
        TextView textdescription=convertView.findViewById(R.id.txt2);
        imageView.setImageResource(getItem(position).getIMAGES());
        textname.setText(getItem(position).getNAMES());
        textdescription.setText(getItem(position).getDESCRIPTIONS());
        return convertView;
    }
}
