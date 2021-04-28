package com.example.listview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;


public class CustomAdapter {

    String NAMES,DESCRIPTIONS;
    int IMAGES;

    public CustomAdapter(String NAMES, String DESCRIPTIONS, int IMAGES) {
        this.NAMES = NAMES;
        this.DESCRIPTIONS = DESCRIPTIONS;
        this.IMAGES = IMAGES;
    }

    public String getNAMES() {
        return NAMES;
    }

    public void setNAMES(String NAMES) {
        this.NAMES = NAMES;
    }

    public String getDESCRIPTIONS() {
        return DESCRIPTIONS;
    }

    public void setDESCRIPTIONS(String DESCRIPTIONS) {
        this.DESCRIPTIONS = DESCRIPTIONS;
    }

    public int getIMAGES() {
        return IMAGES;
    }

    public void setIMAGES(int IMAGES) {
        this.IMAGES = IMAGES;
    }

}
