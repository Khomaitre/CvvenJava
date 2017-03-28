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
    @NamedQuery(name = "Historique.findAll", query = "SELECT h FROM Historique h")
    , @NamedQuery(name = "Historique.findByNumEven", query = "SELECT h FROM Historique h WHERE h.historiquePK.numEven = :numEven")
    , @NamedQuery(name = "Historique.findByNumSalle", query = "SELECT h FROM Historique h WHERE h.historiquePK.numSalle = :numSalle")
    , @NamedQuery(name = "Historique.findByCommentaire", query = "SELECT h FROM Historique h WHERE h.commentaire = :commentaire")})
public class Historique implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistoriquePK historiquePK;
    private String commentaire;

    public Historique() {
    }

    public Historique(HistoriquePK historiquePK) {
        this.historiquePK = historiquePK;
    }

    public Historique(int numEven, int numSalle) {
        this.historiquePK = new HistoriquePK(numEven, numSalle);
    }

    public HistoriquePK getHistoriquePK() {
        return historiquePK;
    }

    public void setHistoriquePK(HistoriquePK historiquePK) {
        this.historiquePK = historiquePK;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historiquePK != null ? historiquePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historique)) {
            return false;
        }
        Historique other = (Historique) object;
        if ((this.historiquePK == null && other.historiquePK != null) || (this.historiquePK != null && !this.historiquePK.equals(other.historiquePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cvvenjava.DAO.Historique[ historiquePK=" + historiquePK + " ]";
    }
    
}
