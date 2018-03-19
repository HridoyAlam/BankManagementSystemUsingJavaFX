package com.mycompany.practice;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        Image icon = new Image("/icons/LoginPage.png");
        
        stage.getIcons().add(icon);
        
        stage.setResizable(false);
        
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
        
       // Media someSound = new Media(getClass().getResource("/audio/Welcome.mp3").toString());    
       // MediaPlayer mp = new MediaPlayer(someSound);
       // mp.play();
        
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
