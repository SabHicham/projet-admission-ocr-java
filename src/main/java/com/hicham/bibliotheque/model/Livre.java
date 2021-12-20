package com.hicham.bibliotheque.model;

import com.sun.istack.NotNull;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "livre")
public class Livre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotNull
    String titre;

    @NotNull
    String auteur;

    @NotNull
    String genre;

    Date date_de_parution;

    String edition;

    public Livre() {
    }

    public Livre(String titre, String auteur, String genre, Date date_de_parution, String edition) {
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.date_de_parution = date_de_parution;
        this.edition = edition;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDateDeParution() {
        return date_de_parution;
    }

    public void setDateDeParution(java.util.Date dateDeParution) {
        this.date_de_parution = dateDeParution;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
