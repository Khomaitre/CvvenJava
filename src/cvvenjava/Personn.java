/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava;

import java.util.Calendar;

/**
 *
 * @author morlinyia
 */
public class Personn {
    private int idParticipant;
    private String nom, prenom, mail, organisation, obversation, login, mdp;
    private boolean role;
    private Calendar naissance;

    public Personn(String nom, String prenom, String mail, String organisation, String obversation, String login, String mdp, boolean role) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.organisation = organisation;
        this.obversation = obversation;
        this.login = login;
        this.mdp = mdp;
        this.role = role;
        this.naissance = naissance;
    }

    public int getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(int idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getObversation() {
        return obversation;
    }

    public void setObversation(String obversation) {
        this.obversation = obversation;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
    
}
