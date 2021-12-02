package com.example.f21comp1011lha2.Search;

import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("full_title")
    private String fullTitle;

    public String getFullTitle() {
        return fullTitle;
    }

    @SerializedName("id")
    private int songID;

    public int getSongID() {
        return songID;
    }

    @SerializedName("song_art_image_url")
    private String songArt;

    public String getSongArt() {
        return songArt;
    }
}
