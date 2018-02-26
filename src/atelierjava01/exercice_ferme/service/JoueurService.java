/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.service;

import atelierjava01.exercice_ferme.dao.JoueurDAO;
import atelierjava01.exercice_ferme.dao.RessourceDAO;
import atelierjava01.exercice_ferme.entiti.Joueur;
import atelierjava01.exercice_ferme.entiti.Ressource;
//import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Formation
 */
public class JoueurService {

    private Pattern patternMDP, patternPSEUDO, patternEclu;

    //private HashMap<String,Joueur> mapFerme;

    /*private static final String PASSWORD_PATTERN_ORIGINAL =
              "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";/**/
    private static final String PASSWORD_PATTERN
            = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{5,15}";
    private static final String PSEUDO_PATTERN
            = "().{3,15}";
    private String EX_PATTERN;

    public JoueurService() {
        this.patternMDP = Pattern.compile(PASSWORD_PATTERN);
        this.patternPSEUDO = Pattern.compile(PSEUDO_PATTERN);
        //mapFerme = new HashMap<>();
    }

    public JoueurService(String phyletrechar) {
        this.patternMDP = Pattern.compile(PASSWORD_PATTERN);
        this.patternPSEUDO = Pattern.compile(PSEUDO_PATTERN);
        //mapFerme = new HashMap<>();
        EX_PATTERN = phyletrechar;
        patternEclu = Pattern.compile(phyletrechar);
    }

    public void inscription(String pseudo, String mdp) {
        //Double.NaN
        this.inscription(pseudo, mdp, null);

    }

    /*public HashMap<String, Joueur> getMapFerme() {
        return this.mapFerme;
    }/**/
    public void inscription(String pseudo, String mdp, Double budget) {

        Matcher matcher = patternPSEUDO.matcher(pseudo);
        if (!matcher.matches()) {
            throw new RuntimeException("Le psudo doit être comprise entre  3 et 15 charractére");
        }
        matcher = patternMDP.matcher(mdp);
        if (!matcher.matches()) {
            throw new RuntimeException("Le mots de pass doit être comprise entre  5 et 15 charractére \n"
                    + "doit avoir une minuscule\n" + "une majuscule\n" + "et un Chifre");
        }
        if (EX_PATTERN != null) {
            matcher = patternEclu.matcher(pseudo);
            if (matcher.matches()) {
                throw new RuntimeException("Le pseudo pas de caractére spécieux \npseudo : " + pseudo);
            }
            matcher = patternEclu.matcher(mdp);
            if (matcher.matches()) {
                throw new RuntimeException("Le mots de pass pas de caractére spécieux \nmdp : " + mdp);
            }
        }
//        JoueurDAO dao = new JoueurDAO();
//        if(!dao.existe(pseudo))
//        {
//            dao.ajouter(new Joueur(pseudo, mdp, budget));
//        }
//        else
//        {
//            throw  new RuntimeException("Le compte " + pseudo + "existe déja");
//        }
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe(pseudo)) {
            throw new RuntimeException("Le compte " + pseudo + " existe déja");
        }
        
        dao.ajouter(new Joueur(pseudo, mdp, budget));

        //this.mapFerme.put(pseudo, new Joueur(budget, pseudo, mdp));//put(pseudo,new Joueur(budget, pseudo, mdp);
    }

    public Joueur connecter(String psedo, String mdp) {

        JoueurDAO dao = new JoueurDAO();
        if(dao.existe(psedo, mdp)) return dao.show(psedo);
        else return null;

    }
    
    public void rejoindrePartie(long idJoueur)
    {
        // 1. Génére les ressources SI aucune resource pour ce joueur
        JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.rechercher(idJoueur);
        if (joueur.getLesRessourcesPosaider().isEmpty()) {
            addRessources(joueur,"Carrote d'origine",Ressource.TypeRessource.CAROTTES,5);
            
            addRessources(joueur,"ble d'origine",Ressource.TypeRessource.BLE,5);
            
            addRessources(joueur,"Premier chevres",Ressource.TypeRessource.CHEVRES,5);
            
            addRessources(joueur,"Premier Fermier",Ressource.TypeRessource.FERMIER,2);
        }
    }
    private void addRessources(Joueur leJoueur,String leNom,Ressource.TypeRessource leType,int quentitée)
    {
        for (int i = 0; i < quentitée; i++) 
        {
            Ressource uneRessource = new Ressource(leNom, leType);
            uneRessource.setDuJoueur(leJoueur);
            leJoueur.getLesRessourcesPosaider().add(uneRessource);
                    
            RessourceDAO dao = new RessourceDAO();
            dao.ajouter(uneRessource);
        }
    }
}
