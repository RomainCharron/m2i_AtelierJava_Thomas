/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtelierJAVA01.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class IteratorTest {
    
    public IteratorTest() {
    }
    
    @Test
    public void iteratorOK(){
        HashSet<String> set = new  HashSet<>();
        String[] tab = {"rouge","jaune","vert"};
        set.addAll(Arrays.asList(tab));
        
        Iterator<String> uniterator = set.iterator();
        String objet;
        while (uniterator.hasNext()) {            
            objet = uniterator.next();
            System.out.println(objet);
        }
        
        System.out.println("");
        System.out.println(uniterator.next());
        
    }
    
}
