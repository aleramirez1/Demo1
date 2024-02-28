package com.aleram.demo01;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class HelloControllerr {

    @FXML
    private VBox buttonLayout;

    @FXML
    private VBox formLayout;

    @FXML
    private TextField nameField;

    @FXML
    private TextField idField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField semesterField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private void handleRegister() {
        buttonLayout.setVisible(false);
        formLayout.setVisible(true);
    }

    @FXML
    private void handleBack() {
        formLayout.setVisible(false);
        buttonLayout.setVisible(true);
    }

    @FXML
    private void handleIDField() {
        idField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                idField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
    }

    @FXML
    private void handleEmailField() {
        emailField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.contains("@") && !oldValue.contains("@")) {
                emailField.setText(oldValue);
            }
        });
    }
}
