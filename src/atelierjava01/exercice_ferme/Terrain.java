/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme;

//import java.util.*;

import java.util.ArrayList;


/**
 *
 * @author Formation
 */
public class Terrain {
    
    private double TailleHectare;
    private ArrayList<Ressource> listRessource = new ArrayList<>();

    public Terrain(double TailleHectare) {
        this.TailleHectare = TailleHectare;
    }

    public ArrayList<Ressource> getListRessource() {
        return listRessource;
    }

    public double getTailleHectare() {
        return TailleHectare;
    }

    public void setListRessource(ArrayList<Ressource> listRessource) {
        this.listRessource = listRessource;
    }

    public void setTailleHectare(double TailleHectare) {
        this.TailleHectare = TailleHectare;
    }
    
    
            
}
