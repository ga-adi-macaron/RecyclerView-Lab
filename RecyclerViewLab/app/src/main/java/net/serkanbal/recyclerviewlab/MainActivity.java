package net.serkanbal.recyclerviewlab;

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

        //Initialize the recycler view.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //Create the Layout Manager:
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);

        //Now that we created; call the layout manager
        mRecyclerView.setLayoutManager(linearLayoutManager);

        //This part populates the Recycle List.
        List<CustomObject> customObjects = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            customObjects.add(new CustomObject());
        }

        mRecyclerView.setAdapter(new CustomRecyclerAdapter(customObjects));
    }
}