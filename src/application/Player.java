package application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Player extends BorderPane{
	
	Media media;
	MediaPlayer player;
	MediaView view;
	Pane mediapane;
	MediaBar bar;
	
	public Player(String file) {
		media = new Media(file);
		player = new MediaPlayer(media);
		view = new MediaView(player);
		mediapane = new Pane();
		
		mediapane.getChildren().add(view);
		
		setCenter(mediapane);
		
		bar = new MediaBar(player);
		
		setBottom(bar);
		
		setStyle("-fx-background-color: #bfc2c7");
		player.play();
	}
}
