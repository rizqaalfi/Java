/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 217
 * Latihan OOP Java 
 * penggunaan for
 */
public class TrianglePattern {
    private int number;
    
    public TrianglePattern(){
    
    }
    
    public TrianglePattern( int number){
        this.number= number;
    }
    
    public void setNumber( int number){
        this.number= number;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void firstPattern(){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void secondPattern(){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void thirdPattern(){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void forthPattern(){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    static void test(){
        TrianglePattern c = new TrianglePattern(10);
        c.firstPattern();
        System.out.println();
        c.secondPattern();
        System.out.println("");
        c.thirdPattern();
        System.out.println("");
        c.forthPattern();
    }
    public static void main(String[] args) {
        test();
    }
}
