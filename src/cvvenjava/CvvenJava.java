/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author morlinyia
 */
public class CvvenJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            String url = "jdbc:postgresql://78.221.246.54:5432/groupe1bJavaCvven";
            String user = "groupe1b";
            String passwd = "mdp1b"; 
            
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver O.K.");
            
            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !"); 
            
            //Création d'un objet Statement
      Statement state = conn.createStatement();
      //L'objet ResultSet contient le résultat de la requête SQL
      ResultSet result = state.executeQuery("SELECT * FROM participant");
      //On récupère les MetaData
      ResultSetMetaData resultMeta = result.getMetaData();
         
      System.out.println("\n**********************************");
      //On affiche le nom des colonnes
      for(int i = 1; i <= resultMeta.getColumnCount(); i++)
        System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
         
      System.out.println("\n**********************************");
         
      while(result.next()){         
        for(int i = 1; i <= resultMeta.getColumnCount(); i++)
          System.out.print("\t" + result.getObject(i).toString() + "\t |");
            
        System.out.println("\n---------------------------------");

      }
System.out.println("- Il y a " + resultMeta.getColumnCount() + " colonnes dans cette table");
for(int i = 1; i <= resultMeta.getColumnCount(); i++)
        System.out.println("\t *" + resultMeta.getColumnName(i));        

      System.out.println("Voici les noms et prénoms : ");
      System.out.println("\n---------------------------------");

      while(result.next()){
        System.out.print("\t" + result.getString("nom") + "\t |");
        System.out.print("\t" + result.getString("prenom") + "\t |");
        System.out.println("\n---------------------------------");
      }

      result.close();
      state.close();
    } catch (Exception e) {
      e.printStackTrace();
    }  
            
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
}
