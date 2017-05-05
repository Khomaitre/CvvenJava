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
  private static String url = "jdbc:postgresql://78.221.246.54:5432/groupe1bJavaCvven";
  //Nom du user
  private static String user = "groupe1b";
  //Mot de passe de l'utilisateur
  private static String passwd = "mdp1b";
  //Objet Connection
  private static Connection connect;
   
  public static Connection getInstance(){
    if(connect == null){
      try {
          try {
              connect = DriverManager.getConnection(url, user, passwd);
              System.out.println("Connexion Effectué");
          } catch (Exception ex){
              
              System.out.println("Exception : " + ex.getMessage());
              url = "jdbc:postgresql://172.16.10.65:5432/groupe1bJavaCvven";
              System.out.println("New Url : " + url);
          }
        connect = DriverManager.getConnection(url, user, passwd);
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }      
    return connect;
  }
}
 