/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;

/**
 * Overload method dimaksudkan untuk menggunakan 
 * angka yang sama dengan argumen yg berbeda
 * 
 */
public class OverloadMethod {
    public static void main (String [] args){
    
        double hasil;
        hasil = tambah (12,  13.5f , 17.67);
        printAngka (hasil);
        //fungsi tadi bisa digunakan pada statement apa saja, asal argumennya sesuai
        
     printAngka (14.7f)  ; 
     printAngka (15);
      // sistem akan otomatis memilih argumen yang di maksud meski namanya sama
    }
    
    private static void printAngka (int angkaInt){
        System.out.println("ini adalah angkaint - " + angkaInt);
    }
    private static void printAngka (float angkaFloat){
        System.out.println("ini adalah angkaFloat -" + angkaFloat);
    }
    private static void printAngka (double angkaDouble){
        System.out.println("ini adalah angkaDouble -" + angkaDouble);
    }
    private static double tambah (int angka1, float angka2, double angka3){
        return angka1 + angka2 + angka3 ;
    }
}
