package com.example.javaprogram2;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App1.setRoot("secondary");
    }
}
