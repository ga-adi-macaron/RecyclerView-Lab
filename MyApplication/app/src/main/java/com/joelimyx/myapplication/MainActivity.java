package com.joelimyx.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<ColorItem> colorItemList = new ArrayList<>();
        colorItemList.add(new ColorItem(Color.RED,"Line 1", "line 2"));
        colorItemList.add(new ColorItem(Color.YELLOW,"Random Line", "Gray"));
        colorItemList.add(new ColorItem(Color.MAGENTA,"Never gonna", "Give You"));
        colorItemList.add(new ColorItem(Color.GREEN,"Up", "Never gonna"));
        colorItemList.add(new ColorItem(Color.CYAN,"let you", "down"));
        colorItemList.add(new ColorItem(Color.DKGRAY,"Cloud", "line 2"));
        colorItemList.add(new ColorItem(Color.BLUE,"Water", "Rick and Morty"));
        colorItemList.add(new ColorItem(Color.YELLOW,"Palmer", "rick it"));
        colorItemList.add(new ColorItem(Color.LTGRAY,"Randomness", "not it"));
        colorItemList.add(new ColorItem(Color.RED,"String", "line it"));
        colorItemList.add(new ColorItem(Color.BLUE,"Darkness", "my friend"));
        colorItemList.add(new ColorItem(Color.BLACK,"Hotel", "Motel"));
        colorItemList.add(new ColorItem(Color.GREEN,"HELLO", "from the "));
        colorItemList.add(new ColorItem(Color.MAGENTA,"other side", "I Must"));
        colorItemList.add(new ColorItem(Color.YELLOW,"have called", "a thousand time"));

        mRecyclerView.setAdapter(new ColorViewAdapter(colorItemList));

    }
}
