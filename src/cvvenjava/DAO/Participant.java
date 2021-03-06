/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava.DAO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author homai
 */
@Entity
@Table(name = "participant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participant.findAll", query = "SELECT p FROM Participant p")
    , @NamedQuery(name = "Participant.findByNumPers", query = "SELECT p FROM Participant p WHERE p.numPers = :numPers")
    , @NamedQuery(name = "Participant.findByNom", query = "SELECT p FROM Participant p WHERE p.nom = :nom")
    , @NamedQuery(name = "Participant.findByPrenom", query = "SELECT p FROM Participant p WHERE p.prenom = :prenom")
    , @NamedQuery(name = "Participant.findByMail", query = "SELECT p FROM Participant p WHERE p.mail = :mail")
    , @NamedQuery(name = "Participant.findByDateNaiss", query = "SELECT p FROM Participant p WHERE p.dateNaiss = :dateNaiss")
    , @NamedQuery(name = "Participant.findByOrganisation", query = "SELECT p FROM Participant p WHERE p.organisation = :organisation")
    , @NamedQuery(name = "Participant.findByObservation", query = "SELECT p FROM Participant p WHERE p.observation = :observation")
    , @NamedQuery(name = "Participant.findByRole", query = "SELECT p FROM Participant p WHERE p.role = :role")
    , @NamedQuery(name = "Participant.findByLogin", query = "SELECT p FROM Participant p WHERE p.login = :login")
    , @NamedQuery(name = "Participant.findByMdp", query = "SELECT p FROM Participant p WHERE p.mdp = :mdp")})
public class Participant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_pers")
    private Integer numPers;
    private String nom;
    private String prenom;
    private String mail;
    @Column(name = "date_naiss")
    @Temporal(TemporalType.DATE)
    private Date dateNaiss;
    private String organisation;
    private String observation;
    private Boolean role;
    private String login;
    private String mdp;

    public Participant() {
    }

    public Participant(Integer numPers, String nom, String prenom, String mail, Date dateNaiss, String organisation, String observation, Boolean role) {
        this.numPers = numPers;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.dateNaiss = dateNaiss;
        this.organisation = organisation;
        this.observation = observation;
        this.role = role;
    }
    public Participant(String nom, String prenom, String mail, Date dateNaiss, String organisation, String observation, Boolean role, String login, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.dateNaiss = dateNaiss;
        this.organisation = organisation;
        this.observation = observation;
        this.role = role;
        this.login = login;
        this.mdp = mdp;
    }

    
    public Participant(Integer numPers, String nom) {
        this.numPers = numPers;
        this.nom = nom;
    }
    public Participant(String login, String mdp){
        this.login = login;
        this.mdp = mdp;
    }

    public Integer getNumPers() {
        return numPers;
    }

    public void setNumPers(Integer numPers) {
        this.numPers = numPers;
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

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numPers != null ? numPers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participant)) {
            return false;
        }
        Participant other = (Participant) object;
        if ((this.numPers == null && other.numPers != null) || (this.numPers != null && !this.numPers.equals(other.numPers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cvvenjava.DAO.Participant[ numPers=" + numPers + " ]";
    }
    
}
