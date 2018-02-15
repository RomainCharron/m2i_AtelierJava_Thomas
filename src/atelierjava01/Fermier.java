/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01;

/**
 *123
 * @author Formation
 */
public class Fermier {
    
    private String nom;
    private String prenom;
    private String specialite;

    public Fermier(String nom, String prenom, String specialite) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setSpecialite(specialite);
        
        
        
        
    }
    
    

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpecialiter() {
        return specialite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Nom : " + this.getNom() + "\nPrenom : " + this.getPrenom() + "\nSpecialite : " + this.getSpecialiter();
    }
    
    
}
