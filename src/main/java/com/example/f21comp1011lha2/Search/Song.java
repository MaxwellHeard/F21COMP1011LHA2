package com.example.f21comp1011lha2.Search;

import com.google.gson.annotations.SerializedName;

public class Song {
    @SerializedName("result")
    private Result result;

    public String getArt() {
        return result.getSongArt();
    }

    public String getSongID() {
        return result.getSongID();
    }

    @Override
    public String toString() {
        return result.getFullTitle();
    }
}
