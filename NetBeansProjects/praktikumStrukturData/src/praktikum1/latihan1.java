/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.util.Arrays;

/**
 *
 * 25 feb 2020
 */
public class latihan1 {
    public static void main(String[] args) {
        int angka[] = {23,6,47,35,2,14};
        
        // a. urutan data Array
        Arrays.sort(angka);
        System.out.println("urutannya adalah "
                +Arrays.toString(angka) + "\n");
        
        //b. rata rata Array
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah = jumlah +angka[i];
        }
        int rata2 = jumlah/angka.length;
        System.out.println("nilai rata ratanya adalah " + rata2 + "\n");
        
        
         //data min dan max dari Array
         int max = 0;
         for (int i = 0; i < angka.length; i++) {
           
             if (angka[i]> max){
            max = angka[i]; }
        }
        System.out.println("nilai maximumnya adalah "
                + max + "\n");
        
        int min = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i]< min){
            min = angka[i+1];}
            
        }
        System.out.println("nilai minimumnya adalah " 
                + min + "\n");
        
        //bilangan ganjil
        int [] angka2 = new int[3];
        int j=0;
        for (int i = 0; i < angka.length; i++) {
            
          if (angka[i]%2!=0)  {
              angka2[j] = angka[i];
          j++; }
         
        }
        
        System.out.println("bilangan ganjilnya adalah " 
                + Arrays.toString(angka2) + "\n");
        
        // bilagan prima
        int [] angka3 = new int [3];
        int t =0;
        for (int i = 0; i < angka.length; i++) {
            if(angka[i]==2){
            angka3[t] = angka[i];
            t++;}
            else if (angka[i]%2!=0&&angka[i]%3!=0&&angka[i]%5!=0&&angka[i]%7!=0)
            {angka3[t] = angka[i];
            t++;   }
         }
        
         System.out.println( "Bilangan primanya adalah " 
                 +Arrays.toString(angka3)+ "\n");
        
    }
}
