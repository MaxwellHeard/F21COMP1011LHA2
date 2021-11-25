package com.example.f21comp1011lha2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SearchController {

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<Song> initialSongDataListView;

    @FXML
    void getSearchResults(ActionEvent event) throws IOException, InterruptedException {

    }

}
