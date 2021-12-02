package com.example.f21comp1011lha2.Search;

import com.example.f21comp1011lha2.APIUtility;
import com.example.f21comp1011lha2.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchController implements Initializable {

    @FXML
    private ImageView coverImageView;

    @FXML
    private Button detailsButton;

    @FXML
    private Label songTitleLabel;

    @FXML
    private Label errMsgLabel;

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<Song> initialSongDataListView;

    @FXML
    void getSearchResults(ActionEvent event) throws IOException, InterruptedException {
        initialSongDataListView.getItems().clear();
        initialSongDataListView.setVisible(true);
        errMsgLabel.setVisible(false);
        try {
            initialSongDataListView.getItems().addAll(
                    APIUtility.getSongsFromAPI(searchTextField.getText()).getResponse().getHits());
        } catch(NullPointerException e)
        {
            errMsgLabel.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errMsgLabel.setVisible(false);
        detailsButton.setVisible(false);
        initialSongDataListView.setVisible(false);
        coverImageView.setVisible(false);

        //add a listener to the ListView of movies to show the poster art
        initialSongDataListView.getSelectionModel().selectedItemProperty().addListener(
                (obs, old, songSelected) -> {
                    detailsButton.setVisible(true);
                    coverImageView.setVisible(true);
                    try {
                        coverImageView.setImage(new Image(songSelected.getArt()));
                        songTitleLabel.setText(songSelected.toString());
                    } catch (Exception e)
                    {
                        coverImageView.setImage(new Image(getClass().getResourceAsStream("placeholder.jpg")));
                    }
                }
        );
    }

    @FXML
    private void getSongDetails(ActionEvent event) throws IOException {
        int songID = initialSongDataListView.getSelectionModel().getSelectedItem().getSongID();
        SceneChanger.changeScenes(event, "song-details-view.fxml","Movie Details!",songID);
    }

}
