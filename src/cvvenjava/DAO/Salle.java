/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava.DAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author homai
 */
@Entity
@Table(name = "salle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salle_1.findAll", query = "SELECT s FROM Salle_1 s")
    , @NamedQuery(name = "Salle_1.findByNumSalle", query = "SELECT s FROM Salle_1 s WHERE s.numSalle = :numSalle")
    , @NamedQuery(name = "Salle_1.findByCapacite", query = "SELECT s FROM Salle_1 s WHERE s.capacite = :capacite")
    , @NamedQuery(name = "Salle_1.findByDispo", query = "SELECT s FROM Salle_1 s WHERE s.dispo = :dispo")
    , @NamedQuery(name = "Salle_1.findByEquipement", query = "SELECT s FROM Salle_1 s WHERE s.equipement = :equipement")})
public class Salle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_salle")
    private Integer numSalle;
    private Integer capacite;
    private Boolean dispo;
    private String equipement;

    public Salle() {
    }

    public Salle(Integer numSalle) {
        this.numSalle = numSalle;
    }

    public Integer getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(Integer numSalle) {
        this.numSalle = numSalle;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public Boolean getDispo() {
        return dispo;
    }

    public void setDispo(Boolean dispo) {
        this.dispo = dispo;
    }

    public String getEquipement() {
        return equipement;
    }

    public void setEquipement(String equipement) {
        this.equipement = equipement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numSalle != null ? numSalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salle)) {
            return false;
        }
        Salle other = (Salle) object;
        if ((this.numSalle == null && other.numSalle != null) || (this.numSalle != null && !this.numSalle.equals(other.numSalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cvvenjava.DAO.Salle_1[ numSalle=" + numSalle + " ]";
    }
    
}
