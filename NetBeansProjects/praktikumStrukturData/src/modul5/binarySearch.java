/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author Rizqa Alfiani
 * Sorting dengan bubblesort dan searching dengan binarySearch
 */
public class binarySearch {
    
    public static void main(String[] args) {
        int [] angka = {1,110,2,51,18,102,3};
        BubbleSort(angka);
        
        System.out.println("Angka setelah diurutkan");
        for (int i = 0; i <angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        
        int cari=2;
        int hasil= binarySearch(angka,cari,0,angka.length-1);
        
        if (hasil>=0) {
            System.out.println("Angka ketemu di index ke-" + hasil);
        }else{
            System.out.println("tidah ada");}
        
    }
    
    static int binarySearch(int []angka, int cari, int i, int j){
        int tengah;
        while(i<=j){
            tengah = (i+j)/2;
            if (cari==angka[tengah]) {
                return tengah;
            }else if(cari<angka[tengah]) j= tengah-1;
            else i= tengah +1;
            
        }
        return -1;
    }
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
}