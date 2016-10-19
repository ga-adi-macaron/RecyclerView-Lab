package com.elysium.recyclerview_lab;

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

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(LinearLayoutManager);

        List<CustomObject> customObjectList = new ArrayList<>();

        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject("2"));
        customObjectList.add(new CustomObject("3"));
        customObjectList.add(new CustomObject("4"));
        customObjectList.add(new CustomObject("5"));
        customObjectList.add(new CustomObject("6"));
        }

        mRecyclerView.setAdapter(new CustomRecyclerView(customObjectList));

        }
    }
}
