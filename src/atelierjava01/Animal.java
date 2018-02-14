/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01;

/**
 *
 * @author Formation
 */
public class Animal {
    private static int nbAnimal = 0;
    
    String genre;
    String espece;
    Float taille;
    Float poidsKg;
    Animal parent;

    public Animal() {
        nbAnimal++;
    }

    public static int getNbAnimal() {
        return nbAnimal;
    }
    
    
    
    public void print()
    {
        System.out.println("#################");
        System.out.println("espece : " + espece + "\ngenre : " + genre + "\ntaille : " + taille + "\npoidsKg : " + poidsKg + "\nparent : " + parent);
    }

    @Override
    public String toString(){
        return "espece : " + espece + "\ngenre : " + genre + "\ntaille : " + taille + "\npoidsKg : " + poidsKg + "\nparent : " + parent;
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        nbAnimal--;
    }
    
    
}
