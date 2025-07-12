package org.example.drawapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Buttons
        Button btn1 = new Button("Home");
        Button btn2 = new Button("About");
        Button btn3 = new Button("Contact");

        btn1.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);

        // Header layout
        HBox header = new HBox(10, btn1, btn2, btn3);
        header.setPadding(new Insets(10));
        header.setAlignment(Pos.CENTER);
        header.setStyle("-fx-background-color: #2c3e50;"); // Header color

        HBox.setHgrow(btn1, Priority.ALWAYS);
        HBox.setHgrow(btn2, Priority.ALWAYS);
        HBox.setHgrow(btn3, Priority.ALWAYS);

        String btnStyle = "-fx-background-color: #3498db; -fx-text-fill: white;";
        btn1.setStyle(btnStyle);
        btn2.setStyle(btnStyle);
        btn3.setStyle(btnStyle);

        // Root layout
        BorderPane root = new BorderPane();
        root.setTop(header);
        root.setStyle("-fx-background-color: #ecf0f1;"); // Full screen background

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Full Screen Background");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
