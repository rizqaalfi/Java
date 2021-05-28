/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 111-112
 * latihan OOP Java
 */
public class Circle {
    private double radius;
    
    public Circle (){
        radius = 0.0;
    }
    
    public Circle ( double radius){
        this.radius = radius;
    }
    
    public void setRadius( double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getDiameter(){
        return calcDiameter();
    }
    
    public double getCircumference(){
        return calcCircumference();
    }
    
    public double getArea (){
        return calcArea();
    }
    
    public double calcDiameter(){
        return 2* radius;
    }
    
    public double calcCircumference(){
        return Math.PI*2*radius;
    }
    
    public double calcArea(){
        return Math.PI*radius*radius;
    }
    
    public String toString(){
        String str = 
                " Lingkaran : \n" +
                "Radius = " + radius + " cm \n" +
                "Diameter = " + calcDiameter() + " cm \n" +
                "Keliling = " + calcCircumference() + " cm \n" +
                "Luas = " + calcArea() + " cm \n";
        return str;
    
    }
    static void test(){
        Circle x = new Circle(9);
        System.out.println(x);
    }
    public static void main(String[] args) {
        test();
    }
    
          
}
