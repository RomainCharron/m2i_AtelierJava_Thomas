/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.view;

import atelierjava01.exercice_ferme.entiti.Joueur;
import atelierjava01.exercice_ferme.service.JoueurService;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class EcranConnexion extends GridPane {

    private Button btnConnexion = new Button();
    private Label labPseudo = new Label(),
            labPassWord = new Label();
    private TextField txtFPseudo = new TextField(),
            txtFpwPassWord = new PasswordField();
    private JoueurService uneConnexion = new JoueurService();
    private Alert iConnexionAlertSUCCESSFUL = new Alert(Alert.AlertType.CONFIRMATION, "Conncection réussie", ButtonType.CLOSE);
    private Alert iConnexionAlertFail = new Alert(Alert.AlertType.ERROR, "Echaique de la conncection", ButtonType.CLOSE);
    

    public EcranConnexion() {
        
        labPassWord.setText("Mot-de-passe");
        
        labPseudo.setText("Pseudo");
        
        btnConnexion.setText("Connexion");
        
        this.add(labPseudo, 0, 0);
        this.add(labPassWord, 0, 1);
        this.add(txtFPseudo, 1, 0);
        this.add(txtFpwPassWord, 1, 1);
        
        this.add(btnConnexion  , 1, 2);
        
        //
        btnConnexion.setOnAction((event) -> {
            try {
                Joueur unJoueur = uneConnexion.connecter(txtFPseudo.getText(), txtFpwPassWord.getText());
                if (unJoueur == null) {
                    
                    iConnexionAlertFail.setContentText("Echaique de la conncection");
                    iConnexionAlertFail.showAndWait();
                }
                else
                {
                    iConnexionAlertSUCCESSFUL.showAndWait();
                }
            } catch (Exception e) {
                iConnexionAlertFail.setContentText(e.getMessage());
                    iConnexionAlertFail.setContentText("Echaique de la conncection");
                iConnexionAlertFail.showAndWait();
                //System.out.println(e.getMessage());
            }
            
        });
    }
    
}
