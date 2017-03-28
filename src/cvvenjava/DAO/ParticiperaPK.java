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
public class ParticiperaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "num_pers")
    private int numPers;
    @Basic(optional = false)
    @Column(name = "num_even")
    private int numEven;

    public ParticiperaPK() {
    }

    public ParticiperaPK(int numPers, int numEven) {
        this.numPers = numPers;
        this.numEven = numEven;
    }

    public int getNumPers() {
        return numPers;
    }

    public void setNumPers(int numPers) {
        this.numPers = numPers;
    }

    public int getNumEven() {
        return numEven;
    }

    public void setNumEven(int numEven) {
        this.numEven = numEven;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numPers;
        hash += (int) numEven;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParticiperaPK)) {
            return false;
        }
        ParticiperaPK other = (ParticiperaPK) object;
        if (this.numPers != other.numPers) {
            return false;
        }
        if (this.numEven != other.numEven) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cvvenjava.DAO.ParticiperaPK[ numPers=" + numPers + ", numEven=" + numEven + " ]";
    }
    
}
