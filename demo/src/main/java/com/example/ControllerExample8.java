package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ControllerExample8 implements Initializable {
    @FXML private ImageView imageView;
    @FXML private MediaView mediaView;
    @FXML private Button btnPlay;
    @FXML private Button btnPause;
    @FXML private Button btnStop;
    @FXML private Label labelTime;
    @FXML private Slider sliderVolume;
    @FXML private ProgressBar progressBar;
    @FXML private ProgressIndicator progressIndicator;

    private boolean endOfMedia;

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        Media media = new Media(getClass().getResource("media/Audio.mp3").toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

        //MediaPlayer Control
        mediaPlayer.setOnReady(new Runnable() {
            @Override
            public void run(){
                mediaPlayer.currentTimeProperty().addListener(new ChangeListener<javafx.util.Duration>() {
                    @Override
                    public void changed(ObservableValue<? extends javafx.util.Duration> observable, javafx.util.Duration oldValue, javafx.util.Duration newValue) {
                        double progress = mediaPlayer.getCurrentTime().toSeconds() / mediaPlayer.getTotalDuration().toSeconds();
                        progressBar.setProgress(progress);
                        progressIndicator.setProgress(progress);
                        labelTime.setText(
                            (int)mediaPlayer.getCurrentTime().toSeconds() + "/" + (int)mediaPlayer.getTotalDuration().toSeconds() + " sec"
                        );
                    }
                    
                });
                btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
            }
        });
        mediaPlayer.setOnPlaying(()->{
            btnPlay.setDisable(true); btnPause.setDisable(false); btnStop.setDisable(false);
        });
        mediaPlayer.setOnPaused(()->{
            btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(false);
        });
        mediaPlayer.setOnEndOfMedia(()->{
            endOfMedia = true;
            btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
        });
        mediaPlayer.setOnStopped(()->{
            btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
        });

        //Button Control
        btnPlay.setOnAction(event->{
            if(endOfMedia){mediaPlayer.stop(); mediaPlayer.seek(mediaPlayer.getStartTime());}
            mediaPlayer.play();
            endOfMedia = false;
        });
        btnPause.setOnAction(event->{mediaPlayer.pause();});
        btnStop.setOnAction(event->{mediaPlayer.stop();});

        //Slider Control
        sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);
            }
            
        });
        sliderVolume.setValue(50);
    }
    
}
