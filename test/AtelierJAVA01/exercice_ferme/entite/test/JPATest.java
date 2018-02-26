/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtelierJAVA01.exercice_ferme.entite.test;


import atelierjava01.exercice_ferme.dao.JoueurDAO;
import atelierjava01.exercice_ferme.entiti.Joueur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.Test;


/**
 *
 * @author Formation
 */
public class JPATest {
    
    @Test
    public void runJPA_OK() {
        
        //Persistence unePersistence = new Persistence();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Charron");
        EntityManager jPAEM = factory.createEntityManager();
        jPAEM.getTransaction().begin();
        
        Joueur unJoueur = new Joueur("Marco", "Polo55", 100d);//Joueur(Double.NaN, "Marco", "polo");
        
        jPAEM.persist(unJoueur);
        
        jPAEM.getTransaction().commit();
    }
    
    @Test
    public void select01_OK(){
    
        EntityManager em = Persistence.createEntityManagerFactory("PU_Charron").createEntityManager();
        
        Query qQuery = em.createQuery(""
                + "SELECT j "
                + "FROM Joueur j "
                + "WHERE j.nom = :pseudo "
                + "AND j.motdepasse = :password");
        qQuery.setParameter("password", "Marco");
        qQuery.setParameter("pseudo", "Polo55");
        
//        return (Joueur)qQuery.getSingleResult() != null; /**/
        //return true;
    }
}
