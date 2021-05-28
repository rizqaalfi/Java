/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class LoopingDeretFibbonaci {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        
        // menghitung bilangan Fibbonaci
        
     int a,b,c,n,j ;
     j = 0;
     
     System.out.print ("melihat nilai Fibbonaci ke -");
     n = input.nextInt();
     
     a = 0;
     b = 1;
     c = 1;
     
     for (int i =1; i<=n; i++ ){
        c = a+ b; 
        System.out.println("nilai fibbonaci ke -" + i + "adalah" + c); 
         a= b;
         b=c;
         
     
     }
            
             
    
    
    }
}
