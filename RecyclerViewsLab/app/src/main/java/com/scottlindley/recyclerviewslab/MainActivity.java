package com.scottlindley.recyclerviewslab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                MainActivity.this, LinearLayoutManager.VERTICAL, false);

        //EVERY 5th ITEM IS A BONUS LIST ITEM (a different object type)l,
        List<Object> listItems = new ArrayList<>();
        for(int i=0; i<50; i++){
            if(i%5==0){
                listItems.add(new BonusListItem());
            }
                listItems.add(new ListItem());
        }

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(new MyRecyclerViewAdapter(listItems));
    }
}
