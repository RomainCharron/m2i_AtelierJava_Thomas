/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Formation
 */
public class NewFXMain extends Application {

    private BorderPane rootLoginMenu;
    private Button btnConnexion = new Button(),
            btnInscription = new Button();
    private Label labCopyRight = new Label();
    
    public NewFXMain() {
        
        
        btnConnexion.setText("Connexion");
        btnConnexion.setOnAction( e -> {
            rootLoginMenu.setCenter(new EcranConnexion());
        });
        
        
        btnInscription.setText("Inscription");
        btnInscription.setOnAction( e -> {
            rootLoginMenu.setCenter(new EcranInscription());
        });
        
        labCopyRight.setText("Copytright 2018 M2i");
        
        rootLoginMenu = new BorderPane();
        
        
        HBox btngroup = new HBox();
        btngroup.getChildren().add(btnConnexion);
        btngroup.getChildren().add(btnInscription);
        
        
        rootLoginMenu = new BorderPane();
        
        rootLoginMenu.setTop(btngroup);
        
        
        rootLoginMenu.setBottom(labCopyRight);
    }
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
        // Pre INIT
        
        //INIT
        
        Scene scene = new Scene(rootLoginMenu, 300, 250);
        
        primaryStage.setTitle("Gaia");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
