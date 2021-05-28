/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @Author Rizqa Alfiani
 */
public class ternaryOprator {
    public static void main (String []args){
       Scanner input = new Scanner(System.in);
       
       int hasil_y ;
        //oprator ternary 
        //digunakan untuk menyingkat penggunaan if statement
       System.out.println ("masukkan nilai :");
       int x = input.nextInt();
       
  // vareiabel x = ekspresi ? statement true : Statement false;
  
   hasil_y = (x>=10) ? (x*x) : (x/2);
   System.out.println (" hasilnya adalah " + hasil_y);
    
    }
}
