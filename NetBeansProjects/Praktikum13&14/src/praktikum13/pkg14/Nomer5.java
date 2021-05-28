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
public class Nomer5 {
    public static void main (String [] args) {
    Scanner input= new Scanner (System.in);
    
        int a, b,hasil;
        char operator;
    System.out.print("input a :");
    a = input.nextInt();
    System.out.print("input operator :");
    operator = input.next().charAt(0);
    System.out.print("input b :");
    b = input.nextInt();
    
    if (operator == '+'){
       hasil = a+ b;
    System.out.printf ("%d + %d = %d ", a,b,hasil);
    }
     if (operator == '-'){
       hasil = a- b;
    System.out.printf ("%d - %d = %d ", a,b,hasil);
    }
      if (operator == '*'){
       hasil = a* b;
    System.out.printf ("%d * %d = %d ", a,b,hasil);
    }
       if (operator == '/'){
       hasil = a/ b;
    System.out.printf ("%d / %d = %d ", a,b,hasil);
    }
    }
}
