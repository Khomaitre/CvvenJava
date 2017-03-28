/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author homai
 */
public class ConnectionSingle {
    
      
      
  //URL de connexion
  private String url = "jdbc:postgresql://78.221.246.54:5432/groupe1bJavaCvven";
  //Nom du user
  private String user = "groupe1b";
  //Mot de passe de l'utilisateur
  private String passwd = "mdp1b";
  //Objet Connection
  private static Connection connect;
   
  //Constructeur privé
  private ConnectionSingle(){
    try {
      connect = DriverManager.getConnection(url, user, passwd);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
   
  //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
   public static Connection getInstance(){
    if(connect == null){
      new ConnectionSingle();
    }
    return connect;   
  }   
}