package com.example.f21comp1011lha2;

import com.google.gson.annotations.SerializedName;

public class Song {
    @SerializedName("full_title")
    private String fullTitle;

    @Override
    public String toString() {
        return String.format("%s",fullTitle);
    }
}
