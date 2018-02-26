/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.entiti;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Formation
 */
@Entity
public class Ressource implements Serializable {
    
    public enum TypeRessource{
//        ANIMAL_MOUNTON,
//        ANIMAL_VACHE,
//        CULTURE_BLE,
//        CULTURE_MAIS,
//        CULTURE_CAROTTES,
//        CULTURE_CHEVRES,
//        FERMIER
        FROMAGE,
        BLE,
        CAROTTES,
        CHEVRES,
        FERMIER
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    
    @Enumerated(value = EnumType.STRING)
    private TypeRessource laDesignation;
    
    
    @JoinColumn(name = "Joueur_id")
    @ManyToOne // many = plusieur pour 1
    private Joueur duJoueur;

    public Ressource() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ressource(String nom, TypeRessource laDesignation) {
        this.nom = nom;
        this.laDesignation = laDesignation;
    }

    public void setLaDesignation(TypeRessource laDesignation) {
        this.laDesignation = laDesignation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeRessource getLaDesignation() {
        return laDesignation;
    }

    public String getNom() {
        return nom;
    }

    public Joueur getDuJoueur() {
        return duJoueur;
    }

    public void setDuJoueur(Joueur duJoueur) {
        this.duJoueur = duJoueur;
    }

    
    
    

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ressource)) {
            return false;
        }
        Ressource other = (Ressource) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atelierjava01.exercice_ferme.entiti.Ressource[ id=" + id + " ]";
    }
    
}
