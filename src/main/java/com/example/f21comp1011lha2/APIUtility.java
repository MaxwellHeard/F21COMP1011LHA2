package com.example.f21comp1011lha2;

import com.example.f21comp1011lha2.Details.DetailResponse;
import com.example.f21comp1011lha2.Search.GeniusResponse;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    /**
     * This method extracts the JSON from the file
     */
    public static GeniusResponse getSongsFromJSON()
    {
        Gson gson = new Gson();
        GeniusResponse result = null;

        try(
                FileReader fileReader = new FileReader("apiResponse.json");
                JsonReader jsonReader = new JsonReader(fileReader)
        )
        {
            result = gson.fromJson(jsonReader, GeniusResponse.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * This method calls the Genius API and returns a GeniusResponse
     */
    public static GeniusResponse getSongsFromAPI(String searchText) throws IOException, InterruptedException {
        GeniusResponse result = null;

        searchText = searchText.replace(" ", "%20");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://genius.p.rapidapi.com/search?q="+searchText))
                .header("x-rapidapi-host", "genius.p.rapidapi.com")
                .header("x-rapidapi-key", "5ac627ad53mshe8f071a953584ccp1b40fdjsn3ed5785de164")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers
                .ofFile(Paths.get("apiResponse.json")));

        result = getSongsFromJSON();
        return result;
    }

    /**
     * This method calls the Genius API and returns song details
     */
    public static DetailResponse getSongDetails(String songID) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://genius.p.rapidapi.com/songs/"+songID))
                .header("x-rapidapi-host", "genius.p.rapidapi.com")
                .header("x-rapidapi-key", "5ac627ad53mshe8f071a953584ccp1b40fdjsn3ed5785de164")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        return gson.fromJson(response.body(), DetailResponse.class);
    }
}
