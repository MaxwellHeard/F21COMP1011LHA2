package com.example.f21comp1011lha2.Details;

import com.google.gson.annotations.SerializedName;

public class SongDetails {
    @SerializedName("song")
    private Details details;

    public Details getDetails() {
        return details;
    }
}
