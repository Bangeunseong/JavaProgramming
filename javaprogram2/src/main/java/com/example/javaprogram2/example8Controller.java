package com.example.javaprogram2;

import java.net.URL;
import java.time.Duration;
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

public class example8Controller implements Initializable {
    @FXML private Label labelTime;
    @FXML private Slider sliderVolume;
    @FXML private ProgressBar progressBar;
    @FXML private ProgressIndicator progressIndicator;
    @FXML private MediaView mediaView;
    @FXML private ImageView imageView;
    @FXML private Button btnPlay;
    @FXML private Button btnPause;
    @FXML private Button btnStop;

    private boolean endOfMedia;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        //Media Object initialize
        Media media = new Media(getClass().getResource("media/audio.mp3").toString());
        //MediaPlayer Object initialize
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

        mediaPlayer.setOnReady(new Runnable() {
            @Override
            public void run(){
                mediaPlayer.currentTimeProperty().addListener(new ChangeListener<javafx.util.Duration>() {
                    @Override
                    public void changed(ObservableValue<? extends javafx.util.Duration> arg0, javafx.util.Duration arg1, javafx.util.Duration arg2) {
                        double progress = mediaPlayer.getCurrentTime().toSeconds() / mediaPlayer.getTotalDuration().toSeconds();
                        progressBar.setProgress(progress);
                        progressIndicator.setProgress(progress);
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
            progressBar.setProgress(1.0);
            progressIndicator.setProgress(1.0);
            endOfMedia = true;
            btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
        });
        mediaPlayer.setOnStopped(()->{
            btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
        });

        sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                mediaPlayer.setVolume(sliderVolume.getValue()/100.0);
            }
        });
        sliderVolume.setValue(50.0);
        btnPlay.setOnAction(event->{
            if(endOfMedia){mediaPlayer.stop(); mediaPlayer.seek(mediaPlayer.getStartTime());}
            mediaPlayer.play(); endOfMedia = false;
        });
        btnPause.setOnAction(event->{mediaPlayer.pause();});
        btnStop.setOnAction(event->{mediaPlayer.stop();});
    }
}
