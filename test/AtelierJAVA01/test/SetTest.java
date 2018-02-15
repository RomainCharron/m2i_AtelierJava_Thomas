/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtelierJAVA01.test;

import java.util.Arrays;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class SetTest {
    
    
    public SetTest() {
    }
    
    @Test 
    public void addOK(){
        HashSet<String> set = new HashSet<String>();
        String[] tabString = {"Rouge","Vert","Jaune"}; 
        set.addAll(Arrays.asList(tabString));
        String laString = "";
        
        laString += set.add("Rouge") + "\n";
        laString += set.add("Rouge") + "\n";
        laString += set.add("Rouge3") + "\n";
        laString += set.add("Rouge2") + "\n";
        laString += set.add("Rouge2") + "\n";
        System.out.println(laString);
        for (String string : set) {
            System.out.println("" + string);
        }
        
    }
    
}
