/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6dan7;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class BinarySearch {
    static void BubbleSort(int[] angka){
        for (int i = 0; i < angka.length-1; i++) {
            for (int j = 0; j < angka.length-i-1; j++) {
                if (angka[j]> angka[j+1]) {
                    int temp = angka[j];
                    angka[j]= angka[j+1];
                    angka[j+1]= temp;
                }
            }
        }
    }
    static int binarySearch(int[] angka, int cari, int i, int j){
        int tengah;
        while(i<=j){
            tengah = (i+j)/2;
            if (cari== angka[tengah]) {
                return tengah;
            }
            else
                if(cari<angka[tengah]){
                    j= tengah-1;
                }
            else{
               i= tengah+1;
            }
          
        }
      return -1;
    }
    public static void main( String args[]) {
       int[]angka = {4,1,7,3,10,5,13,2,6,18};
       BubbleSort(angka);
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]);
            if (i==angka.length-2){
            break;}
            System.out.print(",");
        }
        
        int cari= 1;
        System.out.println("");
        System.out.println("_____________");
        System.out.println("Angka yang dicari =" + cari);
        int hasil = binarySearch(angka, cari, 0, angka.length-1);
        if (hasil>=0) {
            System.out.println("Angka ketemu, pada index ke -" + hasil);
            
        }else{
            System.out.println("Angka yang di cari tidak ketemu");
        
        }
    }
    
    
}
