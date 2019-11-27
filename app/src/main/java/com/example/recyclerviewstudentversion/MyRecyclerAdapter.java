package com.example.recyclerviewstudentversion;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;


// Todo Implement methods required
//onCreateViewHolder()
//onBindViewHolder
//getItemCount
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    List<Player> listOfPlayers;
    Context context;
    int posi;

    public MyRecyclerAdapter(@NonNull List<Player> objects) {
        listOfPlayers = objects;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.single_player_view, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.age.setText(listOfPlayers.get(position).getAge()+"");
    holder.name.setText(listOfPlayers.get(position).getName()+"");
    holder.worth.setText(listOfPlayers.get(position).getWorth()+"");
    holder.sport.setText(listOfPlayers.get(position).getMain_sport()+"");
    int i = listOfPlayers.get(position).getImage();
    holder.imageView.setImageResource(i);



    }

    @Override
    public int getItemCount() {
        return listOfPlayers.size();
    }


    // Todo implement ViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView age;
        public TextView sport;
        public TextView worth;
        public ImageView imageView;
        // get references to each of the views in the single_item.xml
        // Todo implement constructor
        private MyViewHolder(@NonNull View single_player_view) {
            super(single_player_view);
            name = single_player_view.findViewById(R.id.name);
            age = single_player_view.findViewById(R.id.age);
            sport = single_player_view.findViewById((R.id.sport));
            worth = single_player_view.findViewById((R.id.sport));
            imageView = single_player_view.findViewById(R.id.ima);
        }
    }
}
