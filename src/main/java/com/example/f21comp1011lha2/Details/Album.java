package com.example.f21comp1011lha2.Details;

import com.google.gson.annotations.SerializedName;

public class Album {
    @SerializedName("name")
    private String name;

    public String getName() {
        return name;
    }
}
