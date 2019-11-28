package com.example.recyclerviewstudentversion;

import android.widget.ImageView;

public class Player {
    int pictureAddress;
    //Todo finish the class player
    // Todo 5 member variables
    String name;
    int age;
    long worth;
    String main_sport;
    int image;
    String wiki;
    //Todo name, age, worth(money), main sport and int image resource from drawable
    //Todo create constructor and getters and setters
    public String getName() {
        return name;
    }


    public Player(String name, int age, long worth, String main_sport,  int pictureAddress) {
        this.name = name;
        this.age = age;
        this.worth = worth;
        this.main_sport=main_sport;
        this.pictureAddress=pictureAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getWorth() {
        return worth;
    }

    public void setWorth(Long worth) {
        this.worth = worth;
    }

    public String getMain_sport() {
        return main_sport;
    }

    public void setMain_sport(String main_sport) {
        this.main_sport = main_sport;
    }

    public int getImage() {
        return image;
    }


    public void setImage(int image) {
        this.image = image;
    }
    // use Android Studio for fast writing code, find Code->Generate

}
