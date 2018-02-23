/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtelierJAVA01.exercice_ferme.entite.test;

import atelierjava01.exercice_ferme.entiti.Joueur;
import atelierjava01.exercice_ferme.service.JoueurService;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class JoueurServiceTest {
    
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
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("Asuna", "Cocob5");
        instenceService.inscription("Binor", "Cocob5");
    }
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO01()
    {
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("AsunacabraAsunacabra", "Cocob5");
    }
    
    /***
     * Fail le mots de pass n'a pas de chifre
     */
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO02()
    {
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("Asuna", "Cocobc");
    }
    
    /***
     * Fail le mots de pass n'a pas de majuscule
     */
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO03()
    {
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("Asuna", "cocob5");
    }
    
    /***
     * Psudo trop court
     */
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO04()
    {
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("tc", "Cocob5");
    }
    
    /***
     * inscription double ne doit pas marchée
     */
    @Test(expected = RuntimeException.class)
    public void testIncriptionKO05()
    {
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("AsunaDouble", "Cocob5");
//        instenceService.inscription("Binor", "Cocob5");
        instenceService.inscription("AsunaDouble", "Cocob5");
        
    }
    // Login
    
    //
    private void testLoginOK00(String login, String mdp)
    {
        JoueurService instenceService = new JoueurService();
        
        if(!instenceService.connecter(login, mdp))
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
        
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("BinorLogin", "Coco55");
        
        testLoginOK00("BinorLogin", "Coco55");
    }
    
    @Test
    public void testLoginOK02()
    {
        
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("AsunaLogin", "Coco55");
        
        testLoginOK00("AsunaLogin", "Coco55");
    }
    
    @Test
    public void testLoginOK03()
    {
        
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("BinorLogin2", "Cocob5");
        
        testLoginOK00("BinorLogin2", "Cocob5");
    }
    
    @Test
    public void testLoginOK04()
    {
        
        JoueurService instenceService = new JoueurService();
        instenceService.inscription("AsunaLogin2", "Cocob5");
        
        testLoginOK00("AsunaLogin2", "Cocob5");
    }
    
    @Test(expected = RuntimeException.class)
    public void testLoginKO01()
    {
        testLoginOK00("AsunaNotExi1", "gongi07");
    }
    @Test(expected = RuntimeException.class)
    public void testLoginKO02()
    {
        testLoginOK00("AsunaNotExi2", "Cocob5");
    }
}
