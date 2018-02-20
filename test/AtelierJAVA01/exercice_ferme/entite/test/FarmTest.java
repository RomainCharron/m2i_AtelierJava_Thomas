/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtelierJAVA01.exercice_ferme.entite.test;

import atelierjava01.exercice_ferme.entite.Ferme;
import atelierjava01.exercice_ferme.service.FermerService;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class FarmTest {
    
    private static final String PASSWORD_PATTERN_ORIGINAL =
              "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
    private static final String PASSWORD_PATTERN  = 
            "[A-Za-z].{6,20}";
    
    private static final String PASSWORD_PATTERN2  = 
            "[B]";
    
    /**
     * - nini 3 lettre max 8
     * - unique
     */
    @Test
    public void testIncriptionOK01()
    {
        FermerService instenceService = new FermerService(PASSWORD_PATTERN2);
        instenceService.inscription("Asuna2", "Cocob5");
        instenceService.inscription("Binor2", "Cocob5");
    }
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO01()
    {
        FermerService instenceService = new FermerService(PASSWORD_PATTERN2);
        instenceService.inscription("asunacabra", "Cocob5");
    }
    
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO02()
    {
        FermerService instenceService = new FermerService(PASSWORD_PATTERN2);
        instenceService.inscription("Asuna", "Cocobc");
    }
    
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO03()
    {
        FermerService instenceService = new FermerService(PASSWORD_PATTERN2);
        instenceService.inscription("Asuna", "cocob5");
    }
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO04()
    {
        FermerService instenceService = new FermerService(PASSWORD_PATTERN2);
        instenceService.inscription("As", "Cocob5");
    }
    @Test(expected = RuntimeException.class)
    public void testIncriptionDAO05()
    {
        FermerService instenceService = new FermerService();
        instenceService.inscription("Asuna", "Cocob5");
        instenceService.inscription("Binor", "Cocob5");
        instenceService.inscription("Asuna", "Cocob5");
        
    }
}
