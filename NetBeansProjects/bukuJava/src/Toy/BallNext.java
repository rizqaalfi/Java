/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 * @author Rizqa Alfiani
 * page 117
 * latihan OOP Java
 */
public class BallNext {
    private double radius;
    
    public BallNext(){
        radius = 0.0;
    }
    public BallNext (double radius){
        this.radius = radius;
    }
    public void setRadius (double radius){
        this.radius = radius;
    }
    public double getRadius (){
        return radius;
    }
   
    public double getDiameter (){
        return calcDiameter();
    }
    public double getVolume (){
        return calcVolume();
    }
    public double getArea (){
        return calcArea();
    }
    
    private double calcDiameter(){
        return 2*radius;
    }
    private double calcVolume(){
        return (3.0/4)*Math.PI*radius*radius*radius;
        // untuk menghasilkan nilai decimal double pada pembagian salah satunya
        // harus bertype double ex. (3.0/4)
    }
    private double calcArea (){
        return 4*Math.PI*radius*radius;
    }
    
    public String toString (){
        String str =
                "Bola : \n" +
                "Radius = " + radius + " cm \n" +
                "Diameter = " + calcDiameter() + " cm \n" +
                "Luas = " + calcArea() + " cm \n" +
                "Volume = " + calcVolume() + " cm \n";
        return str;
                
    }
    
    static void test(){
        BallNext c = new BallNext(5);
        System.out.println(c);
    }
    public static void main(String[] args) {
        test();
    }
}
