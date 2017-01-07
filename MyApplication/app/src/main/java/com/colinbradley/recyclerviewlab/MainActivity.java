package com.colinbradley.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRV = (RecyclerView)findViewById(R.id.rv);

        mRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object("#000000", "Title 1", "Description 1", false));
        objects.add(new Object("#FF0000", "Title 2", "Description 2", false));
        objects.add(new Object("#00FF00", "Title 3", "Description 3", false));
        objects.add(new Object("#0000FF", "Title 4", "Description 4", false));
        objects.add(new Object("#FFFF00", "Title 5", "Description 5", false));
        objects.add(new Object("#FF00FF", "Title 6", "Description 6", false));
        objects.add(new Object("#00FFFF", "Title 7", "Description 7", false));
        objects.add(new Object("#F0F0F0", "Title 8", "Description 8", false));
        objects.add(new Object("#0F0F0F", "Title 9", "Description 9", false));
        objects.add(new Object("#0FFFF0", "Title 10", "Description 10", false));
        objects.add(new Object("#000000", "Title 11", "Description 11", false));
        objects.add(new Object("#FF0000", "Title 12", "Description 12", false));
        objects.add(new Object("#00FF00", "Title 13", "Description 13", false));
        objects.add(new Object("#0000FF", "Title 14", "Description 14", false));
        objects.add(new Object("#FFFF00", "Title 15", "Description 15", false));
        objects.add(new Object("#FF00FF", "Title 16", "Description 16", false));
        objects.add(new Object("#00FFFF", "Title 17", "Description 17", false));
        objects.add(new Object("#F0F0F0", "Title 18", "Description 18", false));
        objects.add(new Object("#0F0F0F", "Title 19", "Description 19", false));
        objects.add(new Object("#0FFFF0", "Title 20", "Description 20", false));

        Adapter adapter = new Adapter(objects);
        mRV.setAdapter(adapter);
    }
}
