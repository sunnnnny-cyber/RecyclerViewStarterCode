package com.example.recyclerviewstudentversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Todo initialize these variables
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Player> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //Todo create method that will fill list of players
    public void fill_player(){
        list.add(new Player("Lebron James", 34, 13, "NBA Basketball", R.drawable.lebron));
        list.add(new Player("Lciop", 30, 9, "CR Esports",  R.drawable.lciop));
        list.add(new Player("Aron Baynes", 33, 7, "NBA Basketball",R.drawable.Aron));
        list.add(new Player("Reggie Bullock",28, 0,"NBA Basketball",R.drawable.Reggie));
        list.add(new Player("Robert Covington",29, 6, "NBA Basketball",R.drawable.Robert));
        list.add(new Player("Derrick Favors",28,9, "NBA Basketball",R.drawable.Derrick));
        list.add(new Player("Patty Mills", 31, 10, "NBA Basketball",R.drawable.Patty));
        //player.add(new Player(""))
    }
}
