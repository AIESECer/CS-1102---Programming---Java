/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignunit.pkg5;

/**
 *
 * @author Nazim
 */
public class ProgrammingAssignUnit5 {
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
 
    {
        // TODO code application logic here
        StatCalc myStatCalc;
        myStatCalc = new StatCalc();
        
        double setOfNumbers[]={5, 7, 12, 23, 3, 2, 8, 14, 10, 5, 9, 13,};//Create an array that contains all the number to be used with the class
            
        for(int i=0; i<setOfNumbers.length;i++){
            myStatCalc.enter(setOfNumbers[i]);
            System.out.println("Number : "+setOfNumbers[i]);
        }
        System.out.println("Prints Statistcis");
        System.out.println("Count : "+ myStatCalc.getCount());
        System.out.println("Mean : "+ myStatCalc.getMean());
        System.out.println("Standard Deviation : "+ myStatCalc.getStandardDeviation());
    }
  // end class StatCalc  
}

