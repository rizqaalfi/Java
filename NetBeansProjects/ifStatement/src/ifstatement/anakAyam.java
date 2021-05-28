/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;
 import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class anakAyam {

  
   
    
   
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
      
        int a = input.nextInt();
        System.out.println("tek kotek kotek kotek, anak ayam turun berkotek");
        for (; a>1;a--){
          
            System.out.printf ("anak ayam turunlah %d, mati satu tinggallah %d \n",a, (a-1));    
        }    
        System.out.println("anak ayam turunlah 1, matu satu tinggalah induknya");
     
   
    }
}
