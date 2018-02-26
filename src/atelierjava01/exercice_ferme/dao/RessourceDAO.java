/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.dao;

import atelierjava01.exercice_ferme.entiti.Joueur;
import atelierjava01.exercice_ferme.entiti.Ressource;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Formation
 */
public class RessourceDAO {
    
    public void ajouter(Ressource ressource) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU_Charron").createEntityManager();
        em.getTransaction().begin();
        em.persist(ressource);
        em.getTransaction().commit();

    }
}
