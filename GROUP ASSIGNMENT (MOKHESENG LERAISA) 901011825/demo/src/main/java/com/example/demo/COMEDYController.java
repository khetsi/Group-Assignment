package com.example.demo;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class COMEDYController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void L1(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=CqVB-7gOse0");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void C1(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=sY8gUtyeAKE");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void F1(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=X2m-08cOAbc");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void H1(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=uOxp0rdfqBI");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void T1(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=XdKzUbAiswE");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void C2(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=sY8gUtyeAKE");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void F2(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=X2m-08cOAbc");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void H2(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=uOxp0rdfqBI");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void L2(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=CqVB-7gOse0");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void T2(MouseEvent mouseEvent) {
        WebView webView= new WebView();
        webView.getEngine().load("https://www.youtube.com/watch?v=XdKzUbAiswE");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 950, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
