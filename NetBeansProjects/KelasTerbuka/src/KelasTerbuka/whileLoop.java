/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class whileLoop {
    public static void main (String [] args){
        
    //     while (kondisi){
    //     aksi }
       
    //       kondisi berupa boolean true/false
     
      int a =0;
      boolean kondisi = true;
      
      while (kondisi){
          System.out.println ("while Loop ke-" + a);
          a++;
          
          if (a>= 12){
          kondisi= false; 
          }
      
      }
      
    
    
    }
}
