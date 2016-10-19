package com.korbkenny.recyclerview_lab;

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

        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(MainActivity.this,
                        LinearLayoutManager.VERTICAL,
                        false);

        List<ObjectItem> famousBocceBallPlayers = new ArrayList<>();
        famousBocceBallPlayers.add(new ObjectItem("Umberto Granaglia", "Best player ever", Color.BLUE));
        famousBocceBallPlayers.add(new ObjectItem("Fanny", "The butt the losers have to kiss (look it up)", Color.RED));
        famousBocceBallPlayers.add(new ObjectItem("Chris Gerardo", "First recipient of the USBFWoH", Color.GREEN));
        famousBocceBallPlayers.add(new ObjectItem("Juanito Cuneo", "7 year US player", Color.BLACK));
        famousBocceBallPlayers.add(new ObjectItem("Bruno Freschet", "Son of Luigi", Color.MAGENTA));
        famousBocceBallPlayers.add(new ObjectItem("Mario Massa", "Retired to be a family man", Color.CYAN));
        famousBocceBallPlayers.add(new ObjectItem("Adriano Undorte", "Started the Festa Italiana di San Mateo", Color.YELLOW));
        famousBocceBallPlayers.add(new ObjectItem("Aldo Della Croce", "Petitioned Bocce to be an Olympic Sport", Color.LTGRAY));
        famousBocceBallPlayers.add(new ObjectItem("Tom Albanese", "Has raised millions for bocce ball events", Color.WHITE));
        famousBocceBallPlayers.add(new ObjectItem("Jeff Kendalson", "Bestest player ever", Color.DKGRAY));


        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(new RecyclerViewAdapter(famousBocceBallPlayers));


    }
}
