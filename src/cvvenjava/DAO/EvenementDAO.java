/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava.DAO;

import java.sql.Connection;
import connection.ConnectionSingle;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sylvie
 */
public class EvenementDAO extends DAO<Evenement> {

    public EvenementDAO(Connection conn) throws ClassNotFoundException {
        super(conn);
    }

    @Override
    public boolean create(Evenement obj) {
        boolean result = false;

        try {
            Class.forName("org.postgresql.Driver");
            Statement state = ConnectionSingle.getInstance().createStatement();
            System.out.println("TEST");
            state.executeUpdate("INSERT INTO evenement(intitule, theme, date_debut, duree, description, organisateur, type_even) VALUES (" + "'" +obj.getIntitule() + "'" + "," + "'" + obj.getTheme() + "'" + "," + "'" + obj.getDateDebut() + "'" + "," + obj.getDuree() + "," + "'" + obj.getDescription() + "'" + "," + "'" + obj.getOrganisateur() + "'" + "," + "'" + obj.getTypeEven() + "'" +")");
            
            result= true;

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
    
    /**
     * Retourne une ArrayList d'événements.
     * @return <Evenement>
     */
    public List<Evenement> getEvenement() {
            List<Evenement> listeEvenement = new  ArrayList<Evenement>();
            

        try {
            Class.forName("org.postgresql.Driver");
            Statement state = ConnectionSingle.getInstance().createStatement();
      
            state.executeQuery("SELECT * FROM evenement");
            ResultSet rs = state.getResultSet();
       
            while(rs.next()){
                listeEvenement.add(new Evenement(rs.getInt("num_even"), rs.getString("intitule"), rs.getString("theme"), rs.getDate("date_debut"), rs.getInt("duree"), rs.getInt("nb_part_max"), rs.getString("description"), rs.getString("organisateur"), rs.getString("type_even")));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EvenementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listeEvenement;
    }
        

    @Override
    public boolean delete(Evenement obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Evenement obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evenement find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evenement find(String login, String mdp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verify(String login, String mdp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evenement initialise(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
