package com.example.recyclerviewstudentversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Todo initialize these variables
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Player> listPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView Recycler = findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        getPlayers();
        MyRecyclerAdapter arrayAdapter1 = new MyRecyclerAdapter(listPlayers);
        Recycler.setAdapter(arrayAdapter1);
        Recycler.setLayoutManager(layoutManager);

    }
    //Todo create method that will fill list of players
    public void getPlayers(){
        listPlayers = new ArrayList<>();
        listPlayers.add(new Player("Usain St Leo Bolt",33,(long)90000000,"Track and Field",R.drawable.bolt));
        listPlayers.add(new Player("Kobe Bryant",41,(long)500000000,"Basketball",R.drawable.kobe));
        listPlayers.add(new Player("Lionel Andrés Messi Cuccittini",32,(long)400000000,"Football",R.drawable.mesi));
        listPlayers.add(new Player("Cristiano Ronaldo dos Santos Aveiro",34,(long)108000000,"Football",R.drawable.ronaldo));
        listPlayers.add(new Player("Niels Bohr",134,(long)5000000,"Football",R.drawable.niels));
        listPlayers.add(new Player("Harald Bohr",132,(long)5000000,"Football",R.drawable.bohr));
        listPlayers.add(new Player("AlphaGo",4,(long)35000000,"Go",R.drawable.alphago));
        listPlayers.add(new Player("Sun Yang",28,(long)10000000,"Swimming",R.drawable.sunyang));
        listPlayers.add(new Player("Anna Bessonova",35,(long)12000000,"Rhythmic Gymnastics", R.drawable.besa));
        listPlayers.add(new Player("Dina Averina",21,(long)16000000,"Rhythmic Gymnastics",R.drawable.evereena));
        listPlayers.add(new Player("Shiwen Ye",23,(long)16000000,"Swimming",R.drawable.shiwen));
        listPlayers.add(new Player("Jike Zhang",31,(long)20000000,"Table Tennis",R.drawable.jike));
        listPlayers.add(new Player("Miro Jurisic",79,(long)20000000,"Badminton",R.drawable.miro));
        listPlayers.add(new Player("Rookie Song",22,(long)200088888,"Electonic Sport",R.drawable.yijin));
        listPlayers.add(new Player("Tetsuya Kuroko",16,(long)2000,"Basketball",R.drawable.kuroko));
    }
}
