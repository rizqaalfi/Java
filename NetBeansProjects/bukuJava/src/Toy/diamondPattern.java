/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author rizqa Alfiani
 * page 221
 * Laitihan OOP Java 
 * for-loop
 */
public class diamondPattern {
    private int number;
    
    public diamondPattern(){
    
    }
    
    public diamondPattern( int number){
        this.number = number;
    }
    
    public void setNumber ( int number){
        this.number = number;
    }
    
    public int getNumber (){
        return number;
    }
    
    static void test(){
        diamondPattern x = new diamondPattern(8);
        x.printDiamond();
    }
    
    public static void main(String[] args) {
        test();
    }
    
    void printDiamond(){
        for (int i = 0; i < number/2+1; i++) {
            for (int j = 0; j < (number/2-i); j++) System.out.print(" ");
            for (int j = 0; j < 2*i+1; j++) System.out.print("*");
            System.out.println();
            
        }
        
        for (int i = number/2-1; i >=0; i--) {
           for (int j = 0; j < (number/2-i); j++) System.out.print(" ");
            for (int j = 0; j < 2*i+1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
