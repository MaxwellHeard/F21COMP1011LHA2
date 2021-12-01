package com.example.f21comp1011lha2;

import com.google.gson.annotations.SerializedName;

public class Song {
    @SerializedName("result")
    private Result result;

    public String getArt() {
        return result.getSongArt();
    }

    @Override
    public String toString() {
        return result.getFullTitle();
    }
}
