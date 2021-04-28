package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview= (ListView)findViewById(R.id.list);
        ArrayList<CustomAdapter> arrayList=new ArrayList<>();
        arrayList.add(new CustomAdapter("Bradley Cooper","Actor,Age=46",R.drawable.bradleycooper));
        arrayList.add(new CustomAdapter("Chris Evans","Actor,Age=39",R.drawable.chrisevans));
        arrayList.add(new CustomAdapter("Johnny Depp","Actor,Age=57",R.drawable.johnnydepp));
        arrayList.add(new CustomAdapter("Leonardo Dicaprio","Actor,Age=46",R.drawable.leonardodicaprio));
        arrayList.add(new CustomAdapter("Jake Gyllenhaal","Actor,Age=40",R.drawable.jakegyllenhaal));
        Adapter adapter= new Adapter(this,R.layout.customlayout,arrayList);
        listview.setAdapter(adapter);
    }

}
