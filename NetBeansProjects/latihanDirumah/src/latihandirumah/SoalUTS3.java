/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandirumah;
import java.util.Scanner;
/**
 *
 * pejumlahan bilangan genap antara 1-N
 */
public class SoalUTS3 {
    public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    int a = 1;
    int j= 0;
    
   for ( int n = input.nextInt(); n>1; n--){
     
         if (a%2== 0){
             j= j+ a;   
}
         a= a+1;
         System.out.printf ("jumlah bilangan genap antara 1 dan %d adalah %d \n",a,j);

         
       
       
   } 
   }
    
    
    
    }
