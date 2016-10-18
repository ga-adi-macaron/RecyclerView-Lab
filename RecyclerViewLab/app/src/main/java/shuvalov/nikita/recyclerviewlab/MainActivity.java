package shuvalov.nikita.recyclerviewlab;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<FunData> funDataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL,false);

        funDataList = new ArrayList<>();

        recyclerView.setLayoutManager(linearLayoutManager);
        Resources res = getResources();
        String[] songs = res.getStringArray(R.array.songs);
        String[] artists = res.getStringArray(R.array.artists);
        TypedArray albums = getResources().obtainTypedArray(R.array.albumCovers);
        for (int i = 0; i < artists.length; i++) {
            funDataList.add(new FunData(songs[i], artists[i],albums.getResourceId(i,-1)));
        }
        for (int i =0; i<20; i++){
            funDataList.add(new FunData("Filler", "Filler"));
        }
        recyclerView.setAdapter(new FunRecyclerAdapter(funDataList));
    }
}
