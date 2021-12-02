package com.example.f21comp1011lha2.Search;

import com.google.gson.annotations.SerializedName;

public class Hits {
    @SerializedName("hits")
    private Song[] hits;

    public Song[] getHits() {return hits;}

}
