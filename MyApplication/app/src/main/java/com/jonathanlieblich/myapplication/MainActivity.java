package com.jonathanlieblich.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        List<CustomObject> CustomObjectList = new ArrayList<>();
        CustomObjectList.add(new CustomObject());
        CustomObjectList.add(new CustomObject());
        CustomObjectList.add(new CustomObject("Object 3", "Description 3", Color.LTGRAY, false));
        CustomObjectList.add(new CustomObject("Object 4", "Description 4", Color.BLACK, false));
        CustomObjectList.add(new CustomObject("Object 5", "Description 5", Color.MAGENTA, false));
        CustomObjectList.add(new CustomObject("Object 6", "Description 6", Color.CYAN, false));
        CustomObjectList.add(new CustomObject("Object 7", "Description 7", Color.GRAY, false));
        CustomObjectList.add(new CustomObject("Object 8", "Description 8", Color.BLACK, false));
        CustomObjectList.add(new CustomObject("Object 9", "Description 9", Color.LTGRAY, false));
        CustomObjectList.add(new CustomObject("Object 10", "Description 10", Color.RED, false));

        mRecyclerView.setAdapter(new CustomRecycleViewAdapter(CustomObjectList));

    }
}
