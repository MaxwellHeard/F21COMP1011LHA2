package com.example.f21comp1011lha2;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    /**
     * This method extracts the JSON from the file
     *
     */
    public static GeniusResponse getSongsFromJSON()
    {
        Gson gson = new Gson();
        GeniusResponse result = null;

        try(
                FileReader fileReader = new FileReader("apiResponse.json");
                JsonReader jsonReader = new JsonReader(fileReader);
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

}
