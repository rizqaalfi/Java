/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6dan7;

/**
 *
 * pengurutan dari belakang
 */
public class seachAngka {
   private static void Sequential (int[]angka, int cari){
       int x= angka.length-1;
       for (int i = 0; i <angka.length; i++) {
           int data_1 = angka[x];
           //System.out.println(data_1);
           if (cari==data_1) {
                System.out.println("data ditemukan pada index ke-" + x);
            }
           x--;
       }
       
     
       
       
    } 
   public static void main(String[] args) {
        int[]angka={4,10,2,3,5,7,1,110,124};
        int data= 10;
        
        Sequential(angka,data);
    }
}
