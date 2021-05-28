/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6dan7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * mencari data dari kanan ke kiri
 * mash gagal
 * 
 */
public class searchTextNama {
     private static void Sequential (String[]text){
       int x= text.length-1;
         //System.out.println("data dari kanan");
       for (int i = 0; i <text.length; i++) {
           //String data1 = text[x];
          // System.out.println(data1);
           x--;  
       }   
    } 
private static void cari (String[]text){
     Scanner in = new Scanner(System.in);
       System.out.print("Kata yang dicari :");
        String dicari = in.next();
        boolean status = false;
        for (int i = 0; i < text.length; i++) {
            String arrSplit[] = text[i].split("\\s");
            for (int j = 0; j < arrSplit.length; j++) {
                if (Arrays.asList(arrSplit[j]).contains(dicari)) {
                    status = true;
                    break; 
                }
            }
            if (status == true) {
                System.out.println("Data ada pada index " + i + 
                        " yg berisi kalimat \"" + text[i] + " \"\n");
                break; //break dihapus juka ingin mencari kesemua index
            }
        }
        if (status == false) {
            System.out.println("Data tidak ditemukan");
        }
     
     }
   public static void main(String[] args) {
       String[] text = {
           "Deskripsi java adalah bahasa pemrograman yang dapat dijalankan di"
               + "berbagai komputer termasuk telepon genggam",
           "Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung"
               + "di Sun Microsystem saat ini merupakan bagian dari oracle dan"
               + "dirilis tahun 1995",
           "Salah satu penggunaanterbesar java adalah dalam pembuatan aplikasi"
               + "native untuk android",
           "Selain itu Java pun menjadi pondasi bagi berbagai bahasa pemrograman"
               + "seperti Kotlin, Scala, Clojure, Groovy, JRuby, Jython",
           "Tipe data dasar di Java antara lain int, float, double,String, Boolean"
               + "dan lainnya"
       
       }; 
       
       
       
       
   
   }
}
