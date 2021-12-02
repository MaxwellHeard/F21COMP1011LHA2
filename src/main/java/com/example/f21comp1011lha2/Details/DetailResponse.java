package com.example.f21comp1011lha2.Details;

import com.google.gson.annotations.SerializedName;

public class DetailResponse {
    @SerializedName("response")
    private SongDetails response;

    public SongDetails getResponse() {return response;}
}
