package com.example.f21comp1011lha2.Details;

import com.google.gson.annotations.SerializedName;

public class Details {

    @SerializedName("artist_names")
    private String artistNames;

    @SerializedName("title")
    private String title;

    @SerializedName("song_art_image_url")
    private String songArt;

    @SerializedName("producer_artists")
    private Producer[] producers;

    @SerializedName("album")
    private Album album;

    public String getArtistNames() {
        return artistNames;
    }

    public String getTitle() {
        return title;
    }

    public String getSongArt() {
        return songArt;
    }

    public Producer[] getProducers() {
        return producers;
    }

    public String getAlbum() {
        return album.getName();
    }
}
