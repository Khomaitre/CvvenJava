/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava;

/**
 *
 * @author homai
 */
public class DAOPatternDemo {
    public static void main(String[] args){
         PersonnDao  personneDAO = new PersonnDAOImpl();
    
    for (Personn participant : personneDAO.getAllParticipant()) {
        System.out.println("Student: [RollNo : " + participant.getIdParticipant() + ", Name : " + participant.getNom() + " ]");
    }
    }
   
}
