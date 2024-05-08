package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Mushroom {
    private String ID;
    private String name;

    public Mushroom(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}

