/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class tugas2 {
    public static void main(String[] args) {
       
        int num=100;
        for (int i = 2; i < num; i++) {
            boolean prima = true;
            for (int j = 2; j <i; j++) {
                if ( i%j==0 ) {
                    prima= false;
                }
 
            }
            if (prima== true) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
  
}
