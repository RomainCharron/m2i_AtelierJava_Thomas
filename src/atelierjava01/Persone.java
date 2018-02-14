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
public class Persone {
    
    private String nom,prenom;
    private int age;
    private static  int minAge = -2147483648 ;
    private static  int maxAge = -2147483648;
    private static  boolean ifminA = false, ifmaxA = false;

    public Persone(String nom, String prenom, int age) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
    }
    // Accesseur
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public static int getMaxAge() {
        return maxAge;
    }

    public static int getMinAge() {
        return minAge;
    }
    // Modificateur

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
       
        //Persone.maxAge |= age;
        this.age = age;
        Persone.maxAge = (age > Persone.maxAge ? age : Persone.maxAge);
        //Persone.minAge = (age < Persone.minAge || Persone.minAge == 0 ? age : Persone.minAge);
        Persone.minAge = (age < Persone.minAge || Persone.minAge == -2147483648 ? age : Persone.minAge);
        {
        /*if(age > Persone.maxAge)
        {
            Persone.maxAge = age;
        }/**/
        /*if(age < Persone.minAge || Persone.minAge == 0)
        {
                Persone.minAge = age;
        }/**/
        /*if(Persone.minAge != 0)
        {
            if(age < Persone.minAge )
            {
                Persone.minAge = age;
            }
        }
        else
        {
                Persone.minAge = age;
        }/**/
        }
    }
    

    @Override
    public String toString() {
        return "Nom : " + this.getNom() + "\nPrenom : " + this.getPrenom() + "\nAge : " + this.getAge();
    }
    

    
    
    
    
    
}
