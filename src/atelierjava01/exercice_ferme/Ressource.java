/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme;

import javax.print.DocFlavor;

/**
 *
 * @author Formation
 */
public class Ressource {
    
    public enum TypeRessource{
        ANIMAL_MOUNTON,
        ANIMAL_VACHE,
        CULTURE_BLE,
        CULTURE_MAIS,
        FERMIER
    }
    
    private String nom;
    private TypeRessource laDesignation;

    public Ressource(String nom, TypeRessource laDesignation) {
        this.nom = nom;
        this.laDesignation = laDesignation;
    }

    

    public void setLaDesignation(TypeRessource laDesignation) {
        this.laDesignation = laDesignation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeRessource getLaDesignation() {
        return laDesignation;
    }

    public String getNom() {
        return nom;
    }
    
    
}
