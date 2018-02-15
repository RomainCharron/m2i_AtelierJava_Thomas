/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtelierJAVA01.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class MapTest {
    
    @Test
    public void testMap()
    {
        HashMap<String, String> nomPrenomMap;
        nomPrenomMap = new  HashMap<>();
        
        nomPrenomMap.put("Charron", "Romain");
        nomPrenomMap.put("Bonchar", "Binor");
        nomPrenomMap.put("Kagurazaka", "Azuna");
        
        System.out.println("Get Prenom : " + nomPrenomMap.get("Bonchar"));
    }     
    
    @Test
    public void mapKeySetOK() {
        
        HashMap<String, String> nomPrenomMap;
        nomPrenomMap = new  HashMap<>();
        
        nomPrenomMap.put("Charron", "Romain");
        nomPrenomMap.put("Bonchar", "Binor");
        nomPrenomMap.put("Kagurazaka", "Azuna");
        
        
        
        Set<String> setKey = nomPrenomMap.keySet();
        for (String unString : setKey) {
            System.out.println(""+ unString + " " + nomPrenomMap.get(unString));
        }
        String unString;
        Iterator<String> itera = setKey.iterator();
        while (itera.hasNext()) {
            unString = itera.next();
            System.out.println("}"+ unString + " " + nomPrenomMap.get(unString));
            
        }
        for (String unString2 : nomPrenomMap.keySet()) {
            System.out.println(""+ unString2 + " " + nomPrenomMap.get(unString2));
        }
        
        System.out.println("Get Prenom : " + nomPrenomMap.get("Bonchar"));
    }
}
