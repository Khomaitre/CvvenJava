/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvvenjava;

/**
 *
 * @author Killian
 */
import java.util.List;

public interface PersonnDao {
   public List<Personn> getAllParticipant();
   public Personn getParticipant(int idParticipant);
   public void updateParticipant(Personn participant);
   public void deleteParticipant(Personn participant);
}
