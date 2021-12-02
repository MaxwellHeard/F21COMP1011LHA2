package com.example.f21comp1011lha2.Details;

import com.google.gson.annotations.SerializedName;

public class Producer {
    @SerializedName("name")
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
