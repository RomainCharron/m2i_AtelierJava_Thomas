/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.entite;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Ferme {

    private Double budget;
    private String nom;
    private ArrayList<Ressource> listRessource = new ArrayList<>();
    private ArrayList<Terrain> listTerrain = new ArrayList<>();
    private String motdepasse;

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    
    
    
    public Ferme(Double budget, String nom, String motdepasse) {
        this.budget = budget;
        this.nom = nom;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getBudget() {
        return budget;
    }

    public String getNom() {
        return nom;
    }
    
   
    
    
}