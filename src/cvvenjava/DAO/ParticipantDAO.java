/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava.DAO;

import connection.ConnectionSingle;
import java.util.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.util.PSQLException;

/**
 *
 * @author morlinyia
 */
public class ParticipantDAO extends DAO<Participant>{
  public ParticipantDAO(Connection conn) throws ClassNotFoundException {
    super(conn);
    
  }

  public boolean create(Participant obj) {
      boolean result = false;
    try {
        Class.forName("org.postgresql.Driver");
        Statement state = ConnectionSingle.getInstance().createStatement();
        state.executeUpdate("INSERT INTO participant(nom, prenom, mail"
                + ", date_naiss, organisation, observation, role, login, mdp) "
                + "VALUES ('" + obj.getNom() + "','" + obj.getPrenom() 
                + "','" + obj.getMail() + "','" + obj.getDateNaiss() 
                + "','" + obj.getOrganisation() + "','" + obj.getObservation() 
                + "'," + obj.getRole() + ",'" + obj.getLogin() + "','" 
                + obj.getMdp() + "')"
        );
        
        
        result = true;
    } catch (ClassNotFoundException | SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return result;
  }

  public boolean delete(Participant obj) {
    return false;
  }
   
  public boolean update(Participant obj) {
    return false;
  }
  
  public boolean verify(String login, String mdp){
      boolean result = false;      
    try{
          Class.forName("org.postgresql.Driver"); 
          Statement state = ConnectionSingle.getInstance().createStatement();
          ResultSet resultQuery = state.executeQuery("SELECT * FROM participant"
                  + "WHERE login = '" +  login + "' AND mdp = '" + mdp + "'");
          //ResultSetMetaData resultMeta = resultQuery.getMetaData();
          
            while(resultQuery.next()){
                if(resultQuery.getString("login").equals(login) && 
                        resultQuery.getString("mdp").equals(mdp)
                ){
                    result = true;       
                }
            }
        resultQuery.close();
        state.close();
    } catch(Exception e) {
          e.printStackTrace();
      }
      return result;
  }
  
  public Participant initialise(String login){
      int numPers = 0;    
      String nom = null, prenom = null, mail = null,  organisation = null, 
              observation = null; 
      Date dateNass = null;
      boolean role = false;
      Participant part = null;
      
    try {
          Class.forName("org.postgresql.Driver"); 
         
          Statement state = ConnectionSingle.getInstance().createStatement();
          ResultSet resultQuery = state.executeQuery("SELECT * FROM participant"
                  + "WHERE login = '" +  login + "'");
          ResultSetMetaData resultMeta = resultQuery.getMetaData();
          
            while(resultQuery.next()){
                if(resultQuery.getString("login").equals(login)){
                    
                  
                    numPers = resultQuery.getInt("num_pers");
                    nom = resultQuery.getString("nom");
                    prenom = resultQuery.getString("prenom");
                    dateNass = resultQuery.getDate("date_naiss");
                    organisation = resultQuery.getString("organisation");
                    observation = resultQuery.getString("observation");
                    role = resultQuery.getBoolean("role");        
              }
            }
        part =  new Participant(numPers, nom, prenom, mail, dateNass, 
                organisation, observation, role);
        resultQuery.close();
        state.close();
      } catch (Exception ex) {
          ex.printStackTrace();
      } 
    
      return part;    
  }
  @Override
  public Participant find(String login, String mdp) {
      
      int numPers = 0;    
      String nom = null, prenom = null, mail = null,  organisation = null, 
              observation = null; 
      Date dateNass = null;
      boolean role = false;
      Participant part = null;
      
      try {
          Class.forName("org.postgresql.Driver"); 
          Statement state = ConnectionSingle.getInstance().createStatement();
      //L'objet ResultSet contient le résultat de la requête SQL
      ResultSet result = state.executeQuery("SELECT * FROM participant "
              + "WHERE login = '" +  login + "' AND mdp = '" + mdp + "'");
      //On récupère les MetaData
      ResultSetMetaData resultMeta = result.getMetaData();
      
      System.out.println("\n**********************************");
      
for(int i = 1; i <= resultMeta.getColumnCount(); i++)
        //System.out.println("\t *" + resultMeta.getColumnName(i));        

      //System.out.println("Voici les noms et prénoms : ");
      //System.out.println("\n---------------------------------");

      while(result.next()){
        //System.out.print("\t" + result.getString("login") + "\t |");
        //System.out.print("\t" + result.getString("nom") + "\t |");
        //System.out.print("\t" + result.getString("prenom") + "\t |");
        //System.out.print("\t" + result.getDate("date_naiss") + "\t |");
        //System.out.print("\t" + result.getString("organisation") + "\t |");
        //System.out.print("\t" + result.getString("observation") + "\t |");
        //System.out.print("\t" + result.getBoolean("role") + "\t |");
        
        //System.out.println("\n---------------------------------");
        
        numPers = result.getInt("num_pers");
        nom = result.getString("nom");
        prenom = result.getString("prenom");
        dateNass = result.getDate("date_naiss");
        organisation = result.getString("organisation");
        observation = result.getString("observation");
        role = result.getBoolean("role");        
      }
      part =  new Participant(numPers, nom, prenom, mail, dateNass, 
              organisation, observation, role);
      result.close();
      state.close(); 
      } catch (PSQLException ex) {
          ex.printStackTrace();
      } catch(Exception e){
          
      }
      
    return part;
  }

    @Override
    public Participant find(int id) {
        Participant eleve = new Participant();      
        try {

            
        } catch (Exception ex) {

        }
        return eleve;
    }

    
}
