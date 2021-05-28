/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Acer
 */
public class Circle extends Shape {

   
    
   
   private double radius = 1.0;
   
   public Circle(){
       System.out.println("This is the Circle \n the radius is " + radius);
   } 
   public Circle (double radius){
   this.radius= radius;
   }
   
   public Circle (double radius, String color, boolean filled){
   this.radius= radius;
   this.color = color;
   this.filled = filled;
   }
   
   public double getRadius(){
   return radius;
   }
   
   public void setRadius( double radius){
   this.radius= radius;
   }
   
   public double getArea(){
       return 0;
   }
   
   public double getPerimeter (){
       return 0;
   }
   
   public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
   
    public static void main(String[] args) {
        Circle x = new Circle();
    }
   
}


