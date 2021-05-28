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
public class Rectangle extends Shape {
    
    private double width =1.0;
    private double length=1.0;
   
    
    public Rectangle(){
        
    }
    
    public Rectangle( double width, double length){
    this.width= width;
    this.length= length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
    this.width= width;
    this.length= length;
    this.color = color;
    this.filled= filled;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
    this.width= width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
    this.length = length;
    }
    
    public double getArea(){
    return 0;
    }
    
    public double getPerimeter(){
    return 0;
    }
    
    public String toString(){
        return "Rectangle{"+ "width = " + width + '}' + "Rectangle{" + "length ="
                + length + '}';
    }
}
