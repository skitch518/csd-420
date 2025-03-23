package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static final int NUM_CARDS = 52;  // Total number of cards
    private ImageView[] cardImages = new ImageView[NUM_CARDS];
    private Random random = new Random();
    HBox hbox = new HBox(10);

    @Override
    public void start(Stage stage) throws IOException {
       
    
        // Create a VBox
        VBox rootPane = new VBox(20);
        scene = new Scene(rootPane, 640, 480);
       
        Button reset = new Button("Reset Cards");
      
        // Set the alignment for the HBox 
        hbox.setAlignment(Pos.CENTER);

        // Center the VBox
        rootPane.setAlignment(Pos.CENTER);

        // Load the 52 images into the array
        loadCardImages();

        // Display 4 random cards when the app starts
        displayRandomCard();

        // Set up the reset button action (reset the cards when clicked)
        reset.setOnAction(event -> displayRandomCard());
      
        // 
        rootPane.getChildren().addAll(hbox, reset);
        stage.setTitle("Card Display");
        stage.setScene(scene);
        stage.show();


       }

      
    static void setRoot(String fxml) throws IOException {
       // scene.setRoot(loadFXML(fxml));
    }

     // Load the 52 images into the cardImages array
     private void loadCardImages() {
        for (int i = 0; i < NUM_CARDS; i++) { // Using a loop instead on manually entering all 52 cards 
            Image image = new Image(getClass().getResourceAsStream("/cards/" + (i + 1) + ".png"));
            cardImages[i] = new ImageView(image);
            cardImages[i].setFitHeight(100);
            cardImages[i].setFitWidth(100);
            cardImages[i].setPreserveRatio(true);
        }
    }

    private void displayRandomCard() {

        // Clear the existing cards
        hbox.getChildren().clear();

        // Array List holds all of the card indexes
        // Adding this layer to avoid randon number generator selecting the same card twice
        ArrayList<Integer> cardIndexes = new ArrayList<>();
        
        // Add all indexes from 0 to 51 to the ArrayList
       IntStream.range(0, 52).forEach(cardIndexes::add);

        // Select 4 cards
        for (int i = 0; i < 4; i++) {
            // Use a random number generator to get a random card index from the ArrayList
            int randomIndex = random.nextInt(cardIndexes.size());  // Get random index in the list size
            
            // Get the actual card index using the random index
            int selectedCardIndex = cardIndexes.get(randomIndex);
            
            // Add the corresponding card image to the HBox
            hbox.getChildren().add(cardImages[selectedCardIndex]);
            
            // Remove the selected card index from the ArrayList so it's not chosen again
            cardIndexes.remove(randomIndex);
        }
        
    }

   
    public static void main(String[] args) {
        launch();
    }

}