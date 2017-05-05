/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava.DAO;


import connection.ConnectionSingle;
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author homaitre
 */
public abstract class DAO<T> {
    
    protected Connection connect = null;
    
    public DAO(Connection conn) throws ClassNotFoundException{
        Class.forName("org.postgresql.Driver"); 
        this.connect = conn;
    
  }
  
  public abstract boolean create(T obj);

  public abstract boolean delete(T obj);

  public abstract boolean update(T obj);

  public abstract T find(int id);
  
  public abstract T find(String login, String mdp);
  
  public abstract boolean verify(String login, String mdp);
  
  public abstract T initialise(String login);
     
}
