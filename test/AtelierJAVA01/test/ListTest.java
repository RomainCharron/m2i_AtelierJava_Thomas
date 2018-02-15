/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtelierJAVA01.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class ListTest {
    
    @Test
    public void tAddOK(){
        
        System.out.println("#### Démarage des test Unitaire tAddOK");
        
        ArrayList<String> listTestString = new ArrayList<>();
        
        listTestString.add("Le ciel nous thombe sur la tête !!!");
        listTestString.add("Parris");
        listTestString.add("Compiegne");
        listTestString.add("Senlis");
        listTestString.add("Londre");
        listTestString.add("test de guilmet");
                
        for (String elementList : listTestString) {
            System.out.println("\"" + elementList + "\"");
        }
        
        ArrayList listTestNoType = new ArrayList();
                
        System.out.println();
    }
    
    @Test
    public void tAddPlusIndOK(){
        System.out.println("#### Démarage des test Unitaire tAddPlusIndOK");
        
        
        
        
        
        System.out.println();
    }
    
    
    @Test
    public void nombrePremiers(){
        
        System.out.println("#### Démarage des test Unitaire nombrePremiers");
        
        /*Integer[] tab = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 ,97};
        ArrayList<Integer> nombrePremiers = new ArrayList<>();
        nombrePremiers.toArray(tab);
        /**/
        /*for(Integer elementList : nombrePremiers)
        {
            System.out.println("elementList : " + elementList);
        }/**/
        
        ArrayList<Integer> nombrePremiers = new ArrayList<>();
        nombrePremiers.add(2);
        nombrePremiers.add(3);
        //int indnbTestP = 3; 
        boolean isZero ;
        for (int indnbTestP = 3; nombrePremiers.size() < 100; indnbTestP++) {
            isZero = false;
            for(Integer indList : nombrePremiers)
            {
                if((indnbTestP % indList) == 0)
                    {
                        isZero = true;
                        break;
                    }
                
            }
            // si la boucle c'est terminer sans trouver zero on ajoute le nombre
            if(!isZero)
            {
                nombrePremiers.add(indnbTestP);
                System.out.print(indnbTestP + (nombrePremiers.size() % 10 == 9 ? "\n" : " "));
            }
        }
        for (int i = 0; i < nombrePremiers.size(); i++) 
        {
            //String untext = (i % 10) ? "\n" : " ";
            System.out.print(nombrePremiers.get(i).toString() + (i % 10 == 9 ? "\n" : " "));
            
        }
        System.out.println();
    }
    
    @Test
    public void Facoriel(){
        System.out.println("#### Démarage des test Unitaire Facoriel");
        
        final Integer ARG = 8;
        
        Integer facorisez = 1;
        
        for (int i = 1; i < ARG + 1; i++) {
            facorisez *= i;
        }
        
        System.out.println("Nombre : " + facorisez);
        System.out.println("");
    }
    
    
    
    @Test
    public void tRemoveOK(){
        System.out.println("#### Démarage des test Unitaire tRemoveOK");
        
        String[] tabString = {"Romain","Binor","Asuna"}; 
        ArrayList<String> listnom = new ArrayList(Arrays.asList(tabString));
        
        listnom.remove(0);

        for (String string : listnom) {
            
            System.out.println("" + string );
        }
        
        
        
        System.out.println();
    }
    @Test
    public void  tremoveAllOK()
    {
        System.out.println("#### Démarage des test Unitaire tremoveAllOK");
        
        String[] tabString = {"Rouge","Vert","Jaune"}; 
        ArrayList<String> listcouleur = new ArrayList(Arrays.asList(tabString));
        
        String[] tabString2 = {"Rouge","Jaune"}; 
        ArrayList<String> listcouleur2 = new ArrayList(Arrays.asList(tabString2));
        
        listcouleur.removeAll(listcouleur2);
        
        for (String string : listcouleur) {
            
            System.out.println("" + string );
        }
        System.out.println();
    }
    @Test
    public void arrayIteratorok()
    {
        System.out.println("#### Démarage des test Unitaire arrayIteratorok");
        
        String[] tabString = {"Rouge","Vert","Jaune"}; 
        ArrayList<String> listcouleur = new ArrayList(Arrays.asList(tabString));
        {
            Iterator<String> uniterator = listcouleur.iterator();
            String objet;
            while (uniterator.hasNext()) {            
                objet = uniterator.next();
                System.out.println(objet);
            }
            System.out.println("");
        }
        {
            String objet;
            while (listcouleur.iterator().hasNext()) {            
                objet = listcouleur.iterator().next();
                System.out.println(objet);
            }
        }
            
    }
}
