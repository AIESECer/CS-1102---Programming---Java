/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progassignuni.pkg6;

/**
 *
 * @author Nazim
 */
public class ProgAssignUni6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MatchBox matchBox;
        matchBox=new MatchBox(5,10,3);
        
        matchBox.calculateWeight(); // Calculate Weight of the Matchbox
        matchBox.getVolume(); // Print the Matchbox Datas
                
    }
    
}
