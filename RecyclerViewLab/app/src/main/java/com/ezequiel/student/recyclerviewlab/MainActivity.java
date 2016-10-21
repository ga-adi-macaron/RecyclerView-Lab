package com.ezequiel.student.recyclerviewlab;

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

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(MainActivity.this,
                        LinearLayoutManager.VERTICAL,
                        false);

        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<CustomObject> customObjectList = new ArrayList<>();

        customObjectList.add(new CustomObject("Title0", "Description0", Color.GRAY, false));
        customObjectList.add(new CustomObject("Title1", "Description1", Color.GREEN, false));
        customObjectList.add(new CustomObject("Title2", "Description2", Color.RED, false));
        customObjectList.add(new CustomObject("Title3", "Description3", Color.MAGENTA, false));
        customObjectList.add(new CustomObject("Title4", "Description4", Color.BLACK, false));
        customObjectList.add(new CustomObject("Title5", "Description5", Color.BLUE, false));
        customObjectList.add(new CustomObject("Title6", "Description6", Color.YELLOW, false));
        customObjectList.add(new CustomObject("Title7", "Description7", Color.CYAN, false));
        customObjectList.add(new CustomObject("Title8", "Description8", Color.GRAY, false));
        customObjectList.add(new CustomObject("Title9", "Description9", Color.GREEN, false));

        mRecyclerView.setAdapter(new CustomRecyclerViewAdapter(customObjectList));
    }
}
