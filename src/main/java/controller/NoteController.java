package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class NoteController {

    @FXML
    private TextField noteField;

    @FXML
    private ListView<String> noteList;

    @FXML
    private void addNote() {
        String text = noteField.getText();
        if (text != null && !text.trim().isEmpty()) {
            noteList.getItems().add(text);
            noteField.clear();
        }
    }
}
