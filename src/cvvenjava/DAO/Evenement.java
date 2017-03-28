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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author homai
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evenement.findAll", query = "SELECT e FROM Evenement e")
    , @NamedQuery(name = "Evenement.findByNumEven", query = "SELECT e FROM Evenement e WHERE e.numEven = :numEven")
    , @NamedQuery(name = "Evenement.findByIntitule", query = "SELECT e FROM Evenement e WHERE e.intitule = :intitule")
    , @NamedQuery(name = "Evenement.findByTheme", query = "SELECT e FROM Evenement e WHERE e.theme = :theme")
    , @NamedQuery(name = "Evenement.findByDateDebut", query = "SELECT e FROM Evenement e WHERE e.dateDebut = :dateDebut")
    , @NamedQuery(name = "Evenement.findByDuree", query = "SELECT e FROM Evenement e WHERE e.duree = :duree")
    , @NamedQuery(name = "Evenement.findByNbPartMax", query = "SELECT e FROM Evenement e WHERE e.nbPartMax = :nbPartMax")
    , @NamedQuery(name = "Evenement.findByDescription", query = "SELECT e FROM Evenement e WHERE e.description = :description")
    , @NamedQuery(name = "Evenement.findByOrganisateur", query = "SELECT e FROM Evenement e WHERE e.organisateur = :organisateur")
    , @NamedQuery(name = "Evenement.findByTypeEven", query = "SELECT e FROM Evenement e WHERE e.typeEven = :typeEven")})
public class Evenement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_even")
    private Integer numEven;
    private String intitule;
    private String theme;
    @Column(name = "date_debut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    private Integer duree;
    @Column(name = "nb_part_max")
    private Integer nbPartMax;
    private String description;
    private String organisateur;
    @Column(name = "type_even")
    private String typeEven;

    public Evenement() {
    }

    public Evenement(Integer numEven) {
        this.numEven = numEven;
    }

    public Integer getNumEven() {
        return numEven;
    }

    public void setNumEven(Integer numEven) {
        this.numEven = numEven;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Integer getNbPartMax() {
        return nbPartMax;
    }

    public void setNbPartMax(Integer nbPartMax) {
        this.nbPartMax = nbPartMax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public String getTypeEven() {
        return typeEven;
    }

    public void setTypeEven(String typeEven) {
        this.typeEven = typeEven;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numEven != null ? numEven.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evenement)) {
            return false;
        }
        Evenement other = (Evenement) object;
        if ((this.numEven == null && other.numEven != null) || (this.numEven != null && !this.numEven.equals(other.numEven))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cvvenjava.DAO.Evenement[ numEven=" + numEven + " ]";
    }
    
}
