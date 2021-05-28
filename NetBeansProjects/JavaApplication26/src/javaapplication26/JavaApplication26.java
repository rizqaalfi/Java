/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author Acer
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
      int a, b, c;
      
     for (a= 1, b= 2; b<1000; a++, b++);
            //no 1
            System.out.println("Nilainya = (" + a + ","+ b + ")");
            //no 2
            c= ((a*a)+(b*b)+1)/(a*b);
            System.out.print("hasil =" + c);
            System.out.println("");
    }
    
}
