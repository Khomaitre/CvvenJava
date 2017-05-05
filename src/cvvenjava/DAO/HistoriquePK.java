/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava.DAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author homai
 */
@Embeddable
public class HistoriquePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "num_even")
    private int numEven;
    @Basic(optional = false)
    @Column(name = "num_salle")
    private int numSalle;

    public HistoriquePK() {
    }

    public HistoriquePK(int numEven, int numSalle) {
        this.numEven = numEven;
        this.numSalle = numSalle;
    }

    public int getNumEven() {
        return numEven;
    }

    public void setNumEven(int numEven) {
        this.numEven = numEven;
    }

    public int getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numEven;
        hash += (int) numSalle;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriquePK)) {
            return false;
        }
        HistoriquePK other = (HistoriquePK) object;
        if (this.numEven != other.numEven) {
            return false;
        }
        if (this.numSalle != other.numSalle) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cvvenjava.DAO.HistoriquePK[ numEven=" + numEven + ", numSalle=" + numSalle + " ]";
    }
    
}
