/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtelierJAVA01.exercice_ferme.entite.test;

import atelierjava01.exercice_ferme.entite.Joueur;
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
    // Login
    
    //
    private void testLoginOK00(String login, String mdp)
    {
        FermerService instenceService = new FermerService();
        
        if(!instenceService.Connecter(login, mdp))
        {
            throw  new RuntimeException("Le login ou le mots de pass sont incorrect");
        }
        else
        {
            System.out.println("Le compte existe" + login);
        }
    }
    
    @Test
    public void testLoginOK01()
    {
        testLoginOK00("Binor", "Coco55");
    }
    
    @Test
    public void testLoginOK02()
    {
        testLoginOK00("Asuna", "Coco55");
    }
    
    @Test
    public void testLoginOK03()
    {
        testLoginOK00("Binor2", "Cocob5");
    }
    
    @Test
    public void testLoginOK04()
    {
        testLoginOK00("Asuna2", "Cocob5");
    }
    
    @Test(expected = RuntimeException.class)
    public void testLoginKO01()
    {
        testLoginOK00("Asuna2", "gongi07");
    }
    @Test(expected = RuntimeException.class)
    public void testLoginKO02()
    {
        testLoginOK00("Asuna3", "Cocob5");
    }
}
