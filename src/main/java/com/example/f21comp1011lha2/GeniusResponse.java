package com.example.f21comp1011lha2;

import com.google.gson.annotations.SerializedName;

public class GeniusResponse {
    @SerializedName("hits")
    private Song[] hits;

    @SerializedName("status")
    private int status;

    public Song[] getHits() {return hits;}
    public void setHits(Song[] hits) {this.hits = hits;}

    public int getStatus() {return status;}
    public void setStatus(int status){this.status = status;}
}
