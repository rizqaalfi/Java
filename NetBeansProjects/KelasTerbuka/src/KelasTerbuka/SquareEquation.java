/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;

/**
 *
 * @author Rizqa Alfiani
 * page 146
 * Latihan OOP Java
 * Menggunakan rumus Matematika ( akar-akar bilangan riil )
 */
public class SquareEquation {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    
    private boolean fValid = false;
    
    public SquareEquation ( double a, double b, double c){
        this.a = a;
        this.b= b;
        this.c=c;
        
        calcX();
    }
    
    private double calcDiscriminant(){
        return b*b-4*a*c;
    }
    private void calcX(){
        double d = calcDiscriminant();
        if (d>0) {
            x1 = (-b+ Math.sqrt(d)/(2*a));
            x2 = (-b- Math.sqrt(d)/(2*a));
            
            fValid = true;
        }
    }
    
    public boolean isValid(){
        return fValid;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getX1(){
        return x1;
    }
    public double getX2(){
        return x2;
    }
    
    static void test(){
        SquareEquation s = new SquareEquation(1.0, 6.0, 2.0);
        if (s.isValid()) {
            System.out.println("Persamaan " + s.getA() + "x^2 + " + s.getB() + "x +" + s.getC()
            + "\n mempunyai akar = " + s.getX1() + " dan " + s.getX2());
        }else {
            System.out.println("Persamaan " + s.getA() + "x^2" + s.getB() + "x" + s.getC()
            + "\n tidak memiliki akar riil");
        }
    }
    
    public static void main(String[] args) {
        test();
    }
}
