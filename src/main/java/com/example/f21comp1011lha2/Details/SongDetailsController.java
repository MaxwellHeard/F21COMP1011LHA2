package com.example.f21comp1011lha2.Details;

import com.example.f21comp1011lha2.APIUtility;
import com.example.f21comp1011lha2.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SongDetailsController implements InitializesSong {

    @FXML
    private ImageView coverImageView;

    @FXML
    private Label artistNameLabel;

    @FXML
    private Label songTitleLabel;

    @FXML
    private Label albumTitleLabel;

    @FXML
    private ListView<Producer> producerListView;

    public void getSongDetails(String songID) {
        try {
            DetailResponse songDetails = APIUtility.getSongDetails(songID);
            artistNameLabel.setText(songDetails.getResponse().getDetails().getArtistNames());
            songTitleLabel.setText(songDetails.getResponse().getDetails().getTitle());
            albumTitleLabel.setText(songDetails.getResponse().getDetails().getAlbum());
            producerListView.getItems().addAll(songDetails.getResponse().getDetails().getProducers());
            try {
                coverImageView.setImage(new Image(songDetails.getResponse().getDetails().getSongArt()));
            } catch (Exception e)
            {
                coverImageView.setImage(new Image(getClass().getResourceAsStream("placeholder.jpg")));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void returnToSearch(ActionEvent actionEvent) throws IOException {
        SceneChanger.changeScenes(actionEvent, "search-view.fxml", "Search For Music!");
    }

}