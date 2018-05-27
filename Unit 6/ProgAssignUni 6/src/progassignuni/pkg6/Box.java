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
public class Box {
    
    public double width;
    public double height;
    public double depth;
    
    //This is an empty constructor
   void Box() {
          ;
   }
 
   public Box(double w, double h, double d) {
          width = w;
          height = h;
          depth = d;
   }
 
   public void getVolume() {
          System.out.println("Volume is : " + width * height * depth);
   }
    
} 
