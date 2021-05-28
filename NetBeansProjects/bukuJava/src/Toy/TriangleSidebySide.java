/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 219
 * Latian OOP Java
 * Membuat belah ketupat
 * masih gagal guys.. ni yang salah diriku apa bukunye :')
 */
public class TriangleSidebySide {
    private int number;
    
    public TriangleSidebySide(){
    
    }
    
    public TriangleSidebySide( int number){
        this.number = number;
    }
    
    public void setNumber( int number){
        this.number = number;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void printPattern(){
        for (int i = 0; i < number; i++) {
            // first Triangle
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <number+1; j++) System.out.print("*");
            
            //second Triangle
            for (int j = number-0; i<j; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < i+1; j++) System.out.print(" "); 
            for (int j = 0; j < i+1; j++) System.out.print(" "); 
            
            
            //third Triangle
            for (int j = 0; i < j; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number-i; j++) {
                System.out.print("*"); 
            }
            
            //forth Triangle
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
        TriangleSidebySide c = new TriangleSidebySide(5);
        c.printPattern();
    }
    
    public static void main(String[] args) {
        test();
    }
}
