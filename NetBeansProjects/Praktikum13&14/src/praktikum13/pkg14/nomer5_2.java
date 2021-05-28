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
public class nomer5_2 {
    public static void main (String [] args){
    Scanner input = new Scanner (System.in);
      
    int a, b,hasil;
   
    System.out.print("input a :");
    a = input.nextInt();
    System.out.print("input b :");
    b = input.nextInt();
    System.out.print ("masukkan operator ke : ");
    String operator = input.next();

    switch (operator){
    
        case "1" :
            hasil = a+ b;
            System.out.printf ("%d + %d = %d ", a,b,hasil);
            break;
        case "2" :
            hasil = a- b;
            System.out.printf ("%d - %d = %d ", a,b,hasil);
            break;
        case "3" :
            hasil = a/ b;
            System.out.printf ("%d / %d = %d ", a,b,hasil);
            break;
        case "4" :
            hasil = a* b;
            System.out.printf ("%d * %d = %d ", a,b,hasil);
            break;
                    
    }
}
}