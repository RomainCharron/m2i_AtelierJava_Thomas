/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.view;

import atelierjava01.exercice_ferme.entiti.Joueur;
import atelierjava01.exercice_ferme.service.JoueurService;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class EcranInscription extends GridPane{

    private Button btnLogin = new Button();
    private Label labPseudo = new Label(),
            labPassWord = new Label(),
            labMsgInscription = new Label();
    private TextField txtFPseudo = new TextField(),
            txtFpwPassWord = new PasswordField();
    private JoueurService uneInscription = new JoueurService();
    private Alert iInscriptionAlert = new Alert(Alert.AlertType.CONFIRMATION, "Inscription réusit", ButtonType.CLOSE);
    
    
    public EcranInscription() {
        
        labPassWord.setText("Mot-de-passe");
        
        labPseudo.setText("Pseudo");
        
        btnLogin.setText("Inscription");
        
        this.add(labPseudo, 0, 0);
        this.add(labPassWord, 0, 1);
        this.add(txtFPseudo, 1, 0);
        this.add(txtFpwPassWord, 1, 1);
        
        this.add(btnLogin  , 1, 2);
        this.add(labMsgInscription  , 0, 3);
        
        //
//        btnLogin.setOnAction((event) -> {
//            uneInscription.inscription(txtFPseudo.getText(), txtFpwPassWord.getText());
//        });
        btnLogin.setOnAction((event) -> {
            try {
                uneInscription.inscription(txtFPseudo.getText(), txtFpwPassWord.getText());
                iInscriptionAlert.showAndWait();
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                labMsgInscription.setText(e.getMessage());
            }
            
        });
        //this.add(this, col, raw);
    }
    
    
}
