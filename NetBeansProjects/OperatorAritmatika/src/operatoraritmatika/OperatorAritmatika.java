/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoraritmatika;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a, b, c, d, e, f, g, h, i;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print ("a: ");
       a = input.nextInt();
       System.out.print("b: ");
       b = input.nextInt();
       
       c = a+b;
       System.out.println ("Hasil penjumlahan= " + c);
       
       
       d = a-b;
       System.out.println("Hasil pengurangan = " + d);
       
       System.out.print("e: ");
       e = input.nextInt();
       System.out.print("f: ");
       f= input.nextInt();
       
       g= e*f;
       System.out.println("Hasil perkalian = " + g );
       
       i = e/f;
       System.out.println("Hasil pembagian = " + i);
       
       
   
    }
    
}
