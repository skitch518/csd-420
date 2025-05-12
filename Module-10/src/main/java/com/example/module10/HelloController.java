package com.example.module10;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField recordField;

    @FXML
    protected void onDisplayButtonClick() {
        try {
            int id = Integer.parseInt(recordField.getText());
            DisplayRecord dr = new DisplayRecord();
            dr.display(id);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid ID format");
        }
    }

    @FXML
    protected void onUpdateButtonClick() {
        try {
            int recordNumber = Integer.parseInt(recordField.getText());

            UpdateRecord updater = new UpdateRecord();
            String record = updater.fetchRecordByNumber(recordNumber);

            // Optionally print or use the record (but you said no setText, so just use it here)
            System.out.println("Record #" + recordNumber + ": " + record);

        } catch (NumberFormatException e) {
            System.out.println("Invalid record number entered.");
        ); }
    }
}