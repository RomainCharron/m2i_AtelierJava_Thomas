/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava01.exercice_ferme.entiti;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Formation
 */
@Entity
public class Joueur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String motdepasse;
    private Double budget;
    
    
    @OneToMany(mappedBy = "duJoueur")
    List<Ressource> lesRessourcesPosaider;

    public Joueur() {
        
    }

    
    
    public Joueur(String nom, String motdepasse, Double budget) {
        this.nom = nom;
        this.motdepasse = motdepasse;
        this.budget = budget;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBudget() {
        return budget;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getNom() {
        return nom;
    }

    public List<Ressource> getLesRessourcesPosaider() {
        return lesRessourcesPosaider;
    }

    public void setLesRessourcesPosaider(List<Ressource> lesRessourcesPosaider) {
        this.lesRessourcesPosaider = lesRessourcesPosaider;
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
        if (!(object instanceof Joueur)) {
            return false;
        }
        Joueur other = (Joueur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atelierjava01.exercice_ferme.entiti.Joueur[ id=" + id + " ]";
    }
    
}
