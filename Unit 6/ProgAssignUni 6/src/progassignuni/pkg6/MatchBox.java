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
public class MatchBox extends Box {
    public double weight;
    
    void MatchBox() {
          ;
   }
 
   public MatchBox(double widthI,double heightI,double depthI /*,double weightI*/) {
        super(widthI,heightI,depthI);
   }
   
   public void calculateWeight(){//Weight Calculation
       this.weight=(width * height * depth)*(0.03611); 
   }
   
   public void getVolume() {//This is a polymorphysm 
          System.out.println("width of MatchBox is " +width);
          System.out.println("height of MatchBox is " +height);
          System.out.println("deptht of MatchBox is " +depth);
          System.out.println("weight of MatchBox is " +weight);
          
          System.out.println("Volume is : " + width * height * depth);
   }
   
   
   
   
    
}
