/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanlab;

/**
 *
 * @author Acer
 */
public class deretAngka2 {
    public static void main (String []args ){
        int a = 1;
        int j;
        
        for (int i =1; i<= 10; i++){
            
        j = ((int) Math.pow ((-1),(a+1)))*a ;
            System.out.print (j + " ");
        a++;
        }
        System.out.println("\n");
        
        int c = 11;
        int d = 2;
        
        for (int i =1; i<= 5; i++){
            System.out.print( c + " ");
             System.out.print( d + " ");
            c = c+2;
            d = d+2;
        
        }
        System.out.println("\n");
        
        int b = 1 ;
        int w = 10;
        
        for (int i =1; i<= 5; i++){
            System.out.print( b + " ");
             System.out.print( w + " ");
            b = b+1;
            w = w-1;
       } 
        System.out.println("\n");
    }
}
