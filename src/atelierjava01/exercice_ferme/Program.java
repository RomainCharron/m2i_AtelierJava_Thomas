/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme;

/**
 *
 * @author Formation
 */
public class Program {
    
    static Ferme uneFerme;
    
    public static void main(String[] args) {
        
        System.out.println("Run exercice_ferme");
        uneFerme = new Ferme(Double.NaN, "La ferme de Binor");
        
    }
}