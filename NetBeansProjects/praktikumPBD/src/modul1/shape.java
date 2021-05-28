/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

/**
 *
 * @author Acer
 */
abstract class shape {
    
    public String color;
    public shape(){
    }

   public void setColor( String c){
    c = color;
   }
   public String getColor (){
       return color;
   }
   abstract public double area ();
   
    }
    

