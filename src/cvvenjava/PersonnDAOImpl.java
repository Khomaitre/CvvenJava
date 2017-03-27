/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava;

/**
 *
 * @author morlinyia
 */
import java.util.ArrayList;
import java.util.List;

public class PersonnDAOImpl implements PersonnDao {
	
   //list is working as a database
   List<Personn> participants;

   public PersonnDAOImpl(){
      participants = new ArrayList<Personn>();
      Personn participants1 = new Personn("De Niro", "Robert", "mail@sfr.fr", "Google", "Tres bon client", "rob", "1234", false);
      Personn participants2 = new Personn("John", "Cena", "mail@sfr.fr", "Google", "Tres bon client", "rob", "1234", false);
      participants.add(participants1);
      participants.add(participants2);		
   }
   
   public void deleteStudent(Personn student) {
      participants.remove(student.getIdParticipant());
      System.out.println("Student: Roll No " + student.getIdParticipant() + ", deleted from database");
   }

   //retrive list of students from the database
   public List<Personn> getAllStudents() {
      return participants;
   }

  
   public Personn getStudent(int IdParticipant) {
      return participants.get(IdParticipant);
   }
//https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
  
   public void updateStudent(Personn student) {
      participants.get(student.getIdParticipant()).setNom(student.getNom());
      System.out.println("Student: Roll No " + student.getIdParticipant() + ", updated in the database");
   }

    @Override
    public List<Personn> getAllParticipant() {
        
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateParticipant(Personn participant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteParticipant(Personn participant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personn getParticipant(int idParticipant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}