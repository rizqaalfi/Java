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
public class Shape {
    
    String color = "red";
    boolean filled = true;

    public Shape() {
    }
    public Shape (String color, boolean filled){
    this.color = color  ;
    this.filled = filled ;
    }
    public String getColor(){
    return color;
    }
    public void setColor(String color){
    this.color = color;
    }
    public boolean isFilled(){
        return true;
    }
    public void setFilled(boolean filled){
    this.filled = filled;
    }
     public String toString() {
        return "Shape{" + "color=" + color + '}' + "Shape{" + "filled=" + filled + '}';
    }
    

   
        
   }

    
