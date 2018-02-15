/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formation
 */
public class AtelierJAVA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Le roi des cons");
        
        Animal unAnimal01,unAnimal02;
        
        unAnimal01 = new Animal();
        unAnimal01.espece = "Cochon";
        unAnimal01.genre = "Sus";
        unAnimal01.poidsKg = new Float(12);
        unAnimal01.print();
        
        unAnimal02 = new Animal();
        unAnimal02.espece = "Giraphe";
        unAnimal02.genre = "Giraffa";
        unAnimal02.print();
        try {
            unAnimal02.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(AtelierJAVA01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("#################");
        System.out.println("nb Animal : " + Animal.getNbAnimal());
        System.out.println("#################");
        
        Persone unePersone01,unePersone02,unePersone03;
        unePersone01 = new Persone("Kagurazaka", "Asuna", 16);
        unePersone03 = new Persone("Boncha", "Binor", 24);
        unePersone02 = new Persone("Charron", "Romain", 28);
        
        System.out.println("Max age : " + Persone.getMaxAge());
        System.out.println("Min age : " + Persone.getMinAge());
        System.out.println("#################");
        System.out.println(unAnimal01.toString());
        System.out.println("#################");
        
        System.out.println("#################");
        int a = 1, b = 4, c = 3, d = 0;
        
        d = a;
        d |= b;
        System.out.println(" a | d = " + d);        
        d = a;
        d |= c;
        System.out.println(" a | c = " + d);     
        d |= b; 
        System.out.println(" | d = " + d);   
        System.out.println("#################");
        
        System.out.println("#################");
        
        Fermier[] lesFermier = new Fermier[5];
        lesFermier[0] = new Fermier("toto", "bolobo", "ramassage de excrement");
        lesFermier[1] = new Fermier("Bob", "le bricoleur", "reparation");
        
        System.out.println(lesFermier[0].toString());
        System.out.println(lesFermier[1].toString());
        System.out.println("#################");
        System.out.println("# Les Liste ##");
        System.out.println("#################");
        
        ArrayList liste = new ArrayList();
        liste.add("Rouge");
        liste.add("Vert");
        liste.add("Bleu");
        liste.add(11);
        liste.add(unePersone01);
        liste.add(unePersone02);
        System.out.println("#################");
        
        for (Object object : liste) {
            System.out.println("#################");
            System.out.println(object);
            System.out.println("###");
            System.out.println(object.getClass());
        }
        
        
    }
    
}
