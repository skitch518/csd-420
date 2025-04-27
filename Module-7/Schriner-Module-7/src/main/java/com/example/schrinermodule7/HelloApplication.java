package com.example.schrinermodule7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;


import java.io.IOException;

/*
 *  Jason Schriner
 *  Module 7
 *  4/27/25
 */

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 320, 240);

        // Link css style sheets
        scene.getStylesheets().add(HelloApplication.class.getResource("/css/circleStyle.css").toExternalForm());

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}

/*
 *  Used the intellij setup to create the project and then just added the circle
 *  objects and .css file while removing the button
 *  I wasn't sure if you also wanted the square object or what the test code might be
 */