package com.example.f21comp1011lha2;

import com.google.gson.annotations.SerializedName;

public class GeniusResponse {
    @SerializedName("meta")
    private Object meta;

    public Object getMeta() {return meta;}
    public void setMeta(Object meta) {this.meta = meta;}

    @SerializedName("response")
    private Hits response;

    public Hits getResponse() {return response;}
    public void setResponse(Hits response) {this.response = response;}

}
