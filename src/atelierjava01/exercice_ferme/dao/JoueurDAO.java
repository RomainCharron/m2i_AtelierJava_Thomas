/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.dao;

import atelierjava01.exercice_ferme.entiti.Joueur;
import java.util.ArrayList;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class JoueurDAO {

    static private class EM {

        static EntityManager createEntityManager() {
            //EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Charron");
            //EntityManager jPAEM = factory.createEntityManager();
            return Persistence.createEntityManagerFactory("PU_Charron").createEntityManager();
        }

        static void beginT(EntityManager em) {
            em.getTransaction().begin();
        }

        static void commitT(EntityManager em) {
            em.getTransaction().commit();
        }

    }
    //private static ArrayList<Joueur>  lesJoueur = new ArrayList<>();

//    static 
//    {
//       
//        lesJoueur.add(new Joueur( "Binor", "Coco55", Double.NaN));
//        lesJoueur.add(new Joueur( "Asuna", "Coco55", Double.NaN));
//        
//    }
    public void ajouter(Joueur joueur) {
        //if(existe(ferme.getNom())) Joueur.lesferme.add(ferme);
        //JoueurDAO.lesJoueur.add(ferme);
        /*EntityManager em = EM.createEntityManager();
        
        EM.beginT(em);
        em.persist(joueur);
        EM.commitT(em);
        /**/
        EntityManager em = Persistence.createEntityManagerFactory("PU_Charron").createEntityManager();
        em.getTransaction().begin();
        em.persist(joueur);
        em.getTransaction().commit();

    }

    public Joueur show(String login) {

        EntityManager em = EM.createEntityManager();

        Query qQuery = em.createQuery(""
                + "SELECT j "
                + "FROM Joueur j "
                + "WHERE j.nom = :pseudo");
        qQuery.setParameter("pseudo", login);

        try {
            return (Joueur) qQuery.getSingleResult();//!= null; 
        } catch (Exception e) {
            System.out.println("" + e.toString());
        } finally {

        }

        /*
        for (Joueur joueur : lesJoueur) {
        if (ferme.getNom().equals(login) ) 
                EM.commitT(em);
                return ferme.getNom();
        }
        return null;/*/
        return null;
    }

    public boolean existe(String login) {
        //return null != this.show(login);
        /*
        for (Joueur ferme : lesferme) {
            if (ferme.getNom().equals(login) ) {
                return true;
            }
        }
        return false;*/
        EntityManager em = EM.createEntityManager();

        Query qQuery = em.createQuery(""
                + "SELECT COUNT(j) "
                + "FROM Joueur j "
                + "WHERE j.nom = :pseudo");
        qQuery.setParameter("pseudo", login);

        return (Long) qQuery.getSingleResult() != 0;//!= null; 
    }

    public boolean existe(String login, String mdp) {

        EntityManager em = EM.createEntityManager();

        Query qQuery = em.createQuery(""
                + "SELECT j FROM Joueur j "
                + "WHERE j.nom = :pseudo "
                + "AND j.motdepasse = :password");
        qQuery.setParameter("password", mdp);
        qQuery.setParameter("pseudo", login);

        return (Joueur) qQuery.getSingleResult() != null;
        /*
        for (Joueur joueur : lesJoueur) {
        if (this.existe(login))
            if(joueur.getMotdepasse().equals(mdp))
                return true;
        }
        return false;/**/

        //return lesJoueur.stream().anyMatch((joueur) -> (this.existe(login) && joueur.getMotdepasse().equals(mdp)));
    }
    
    public Joueur rechercher(Long idJoueur)
    {
        EntityManager em = Persistence.createEntityManagerFactory("PU_Charron").createEntityManager();
        
        //Joueur unJoueur = em.find(Joueur.class, idJoueur);
        return em.find(Joueur.class, idJoueur);
    }
}
