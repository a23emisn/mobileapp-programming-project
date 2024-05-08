package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Mushroom {
    private String ID;
    private String name;
    @SerializedName("cost")
    private int price;
    @SerializedName("size")
    private int height;
    @SerializedName("location")
    private String location;
    @SerializedName("category")
    private String edibility;
    @SerializedName("auxdata")
    private String mushroomPic;

    public Mushroom(String ID, String name, int price, int height, String location, String edibility, String mushroomPic) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.height = height;
        this.edibility = edibility;
        this.location = location;
        this.mushroomPic = mushroomPic;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getHeight() {
        return height;
    }

    public String getLocation() {
        return location;
    }

    public String getEdibility(){
        return edibility;
    }

    public String getMushroomPic(){
        return mushroomPic;
    }
}