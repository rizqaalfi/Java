/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanlab;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class DeretAngka156 {
    public static void main (String [] args){
    
        System.out.println("deret pertama -1");
        int a= 10;
        while (a>0) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println("\n");
        
        System.out.println("deret kedua +2 ganjil");
        int b = 1;
        
        while ( b<=19){
            System.out.print( b +" ");
            b = b+2;
        }   
        System.out.println("\n"); 
        
        System.out.println("detet ketiga +2 genap");
        
         int x = 2;
         while (x <= 20){
            if (x%2==0){
                System.out.print(x + " ");      
         }
           x++;
         }
    System.out.println("\n"); 
    
        System.out.println("deret keempat + + 1");
    int y=11;
    int i=2;
    
    while (y<=65){
        
           System.out.print(y + " ");
           y = y+i;
           i++; 
        
      
        
    }
    
    
    
    
    
  } 
}
