package com.example.recyclerviewstudentversion;

// Todo create a player class that will hold info about the player
public class Player{
    String name;
    int age;
    double worth;
    String main_sport;
    String url;
    int pictureAddress;
    public int getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(int pictureAddress) {
        this.pictureAddress = pictureAddress;
    }

    public Player(String name, int age, double worth, String main_sport, String url, int pictureAddress) {
        this.name = name;
        this.age = age;
        this.worth = worth;
        this.main_sport=main_sport;
        this.url= url;
        this.pictureAddress=pictureAddress;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public void setMain_sport(String main_sport) {
        this.main_sport = main_sport;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public double getWorth() {

        return worth;
    }

    public String getMain_sport() {
        return main_sport;
    }

    public String getUrl(){
        return url;
    }

}
