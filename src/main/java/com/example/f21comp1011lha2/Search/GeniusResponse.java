package com.example.f21comp1011lha2.Search;

import com.google.gson.annotations.SerializedName;

public class GeniusResponse {
    @SerializedName("response")
    private Hits response;

    public Hits getResponse() {return response;}
    public void setResponse(Hits response) {this.response = response;}
}
