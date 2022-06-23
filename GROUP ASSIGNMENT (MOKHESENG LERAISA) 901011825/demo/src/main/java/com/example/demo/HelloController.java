package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    void co(MouseEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("COMEDY.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 760, 650);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void dr(MouseEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DRAMA.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 760, 650);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ho(MouseEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HORROR.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 760, 650);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void ho1(MouseEvent mouseEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HORROR.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 760, 650);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void dr1(MouseEvent mouseEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DRAMA.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 760, 650);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void co1(MouseEvent mouseEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("COMEDY.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 760, 650);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }
}