package com.example.f21comp1011lha2;

import com.google.gson.annotations.SerializedName;

public class GeniusResponse {
    @SerializedName("response")
    private Song[] response;

    public Song[] getResponse() {return response;}
    public void setResponse(Song[] response) {this.response = response;}

}
