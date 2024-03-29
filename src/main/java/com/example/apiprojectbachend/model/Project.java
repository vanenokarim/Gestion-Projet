package com.example.apiprojectbachend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "projets")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nomProjet")
    private String nom;

    @Column(name = "libelleProjet")
    private String libelle;

    @Column(name = "descriptionProjet")
    private String description;

    @Column(name = "statutProjet")
    private String statut;


    @Column(name = "datecreationProjet")
    @Temporal(TemporalType.DATE)
    private Date datecreation;

    public Project() {
    }

    public Project(long id, String nom, String libelle, String description,String statut, Date datecreation)  {
        this.id = id;
        this.nom = nom;
        this.libelle = libelle;
        this.description = description;
        this.statut = statut;
        this.datecreation = datecreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {this.statut = statut;}

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", statut='" + statut + '\'' +
                '}';
    }
}
