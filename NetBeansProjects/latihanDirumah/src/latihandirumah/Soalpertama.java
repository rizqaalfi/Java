/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandirumah;
import java.util.Scanner;


/**
 *
 * @author Acer
 */
public class Soalpertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
        int j = 0;
        int a = 1;
       
      for ( int N=input.nextInt() ; N >0  ; N--){
              j= j+ a*a;
               
        System.out.printf ( "hasil dari penjumlahan kuadrat %d bilangan pertama adalah %d\n", a,j);
              a = a+1; 
       
            
              
              
         
              
       
      
     
        }      
    }
       
      
    
    
    
    
    
}
