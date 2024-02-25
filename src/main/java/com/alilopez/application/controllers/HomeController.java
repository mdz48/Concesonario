package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private BottomNavigationButton addCarroButton;

    @FXML
    private BottomNavigationButton addMotoButton;

    @FXML
    private BottomNavigationButton addClientButton;

    @FXML
    private BottomNavigationButton clientesButton;

    @FXML
    private Button exitButton;

    @FXML
    private BottomNavigationButton inventoryButton;

    @FXML
    void onClickAddCarroButton(MouseEvent event) {
        App.newStage("carro-view", "App - View Carro");
    }

    @FXML
    void onClickAddClienteButton(MouseEvent event) {
        App.newStage("client-view", "App - View Client");
    }

    @FXML
    void onClickAddMotoButton(MouseEvent event) {
        App.newStage("moto-view", "App - View Moto");
    }

    @FXML
    void onClickClientesButton(MouseEvent event) {

    }

    @FXML
    void onClickInventoryButton(MouseEvent event) {

    }

    @FXML
    void onMouseClickExitButton(MouseEvent event) {
        Platform.exit();
    }
    @FXML
    void initialize() {
        exitButton.getStyleClass().setAll("btn","btn-gl","btn-success");
        exitButton.setStyle("-fx-font-size: 20px; -fx-font-weight: 900; -fx-alignment: center;");
    }
}
