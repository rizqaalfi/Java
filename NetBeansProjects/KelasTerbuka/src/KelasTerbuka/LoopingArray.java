/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;

/**
 *
 * @author Acer
 */
public class LoopingArray {
    public static void main (String [] args ) {
    
        int [] arrayAngka = { 12,13,14,15,16,17,18,19,20,21};
        
        System.out.println("menampilkan dengan Looping Standard");
        for (int i=0 ; i<10; i++){
            System.out.println("index ke-" + i + "adalah " + arrayAngka[i]);
        }
        
        System.out.println("menampilkan dengan properti length");
        //properti length otomatis akan menghitung jumlah data di dalam array
          for (int i=0 ; i<arrayAngka.length; i++){
            System.out.println("index ke-" + i + "adalah " + arrayAngka[i]);
        }
          
        System.out.println("menampilkan dengan Looping for Each");
        for (int angka : arrayAngka){
            System.out.println("nilainya adalah " + angka);
            
            //looping ini menunjukan bahwa sistem akan otomatis mengambil nilai
            //pada data array yang sudah ada
            // Looping ini di gunakan saat index tidak di butuhkan. 
        }  
    }
}
