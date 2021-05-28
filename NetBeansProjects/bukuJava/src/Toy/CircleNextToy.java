/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Acer
 */
public class CircleNextToy {
    public static final double phi = 3.14;
    //contoh penggunaan final yang permanen
    static void test(){
        CircleNextToy t = new CircleNextToy();
        
        double r =100;
        System.out.println("keliling lingkaran dg r " + r + "adalah " + t.calcCircum(r));
        System.out.println("Luas lingkaran dg r = " + r + " adalah " + t.calcArea (r));
    }
    
    public double calcCircum ( double r){
        return (2*r*phi);
    }
    
    public double calcArea(double r){
        return (phi*r*r);
    }
    public static void main(String[] args) {
        test();
        
    }
}
