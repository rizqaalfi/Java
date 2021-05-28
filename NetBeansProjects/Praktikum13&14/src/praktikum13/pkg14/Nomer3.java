/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum13.pkg14;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Nomer3 {
    public static void main (String [] args){
    Scanner input = new Scanner (System.in);
        
    System.out.print ("input n : ");
   int  n = input.nextInt();
   int BIL = n;
   
        for (int i=0; i<n; i++) {
         if (BIL == 0){
        break;}    
         
        if (BIL==1|| BIL ==3 ||BIL ==5){
       System.out.print ("termasuk bilangan 1,3,5 jadi ");
         System.out.println ("YA");}
        
        else {System.out.println ("TIDAK") ;
        } 
       
 
        BIL--;
        }
    
    }
}
