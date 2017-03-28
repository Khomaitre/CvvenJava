/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava.DAO;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author homai
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participera.findAll", query = "SELECT p FROM Participera p")
    , @NamedQuery(name = "Participera.findByNumPers", query = "SELECT p FROM Participera p WHERE p.participeraPK.numPers = :numPers")
    , @NamedQuery(name = "Participera.findByNumEven", query = "SELECT p FROM Participera p WHERE p.participeraPK.numEven = :numEven")})
public class Participera implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParticiperaPK participeraPK;

    public Participera() {
    }

    public Participera(ParticiperaPK participeraPK) {
        this.participeraPK = participeraPK;
    }

    public Participera(int numPers, int numEven) {
        this.participeraPK = new ParticiperaPK(numPers, numEven);
    }

    public ParticiperaPK getParticiperaPK() {
        return participeraPK;
    }

    public void setParticiperaPK(ParticiperaPK participeraPK) {
        this.participeraPK = participeraPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (participeraPK != null ? participeraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participera)) {
            return false;
        }
        Participera other = (Participera) object;
        if ((this.participeraPK == null && other.participeraPK != null) || (this.participeraPK != null && !this.participeraPK.equals(other.participeraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cvvenjava.DAO.Participera[ participeraPK=" + participeraPK + " ]";
    }
    
}
