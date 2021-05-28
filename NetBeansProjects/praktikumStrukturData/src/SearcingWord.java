/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SearcingWord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] kalimat = {
            "Deskripsi Java adalah bahasa pemrograman yang dapat "
                + "dijalankan di berbagai komputer termasuk telepon genggam",
            "Bahasa ini awalnya dibuat oleh James Gosling saat masih "
                + "bergabung di Sun Microsystems saat ini merupakan bagian dari "
                + "Oracle dan dirilis tahun 1995",
            "Salah satu penggunaan terbesar Java adalah dalam pembuatan "
                 + "aplikasi native untuk Android",
            "Selain itu Java pun menjadi pondasi bagi berbagai bahasa "
                + "pemrograman seperti Kotlin, Scala, Clojure, Groovy, JRuby, "
                + "Jython",
            "Tipe data dasar di Java antara lain int, float, double, "
                + "String, Boolean, dan lainya"
        };

        System.out.print("Kata yang dicari :");
        String text = in.next();
        boolean status = false;
        for (int i = 0; i < kalimat.length; i++) {
            String arrSplit[] = kalimat[i].split("\\s");
            for (int j = 0; j < arrSplit.length; j++) {
                if (Arrays.asList(arrSplit[j]).contains(text)) {
                    status = true;
                    break; 
                }
            }
            if (status == true) {
                System.out.println("Data ada pada index " + i + 
                        " yg berisi kalimat \"" + kalimat[i] + " \"\n");
                break; //break dihapus juka ingin mencari kesemua index
            }
        }
        if (status == false) {
            System.out.println("Data tidak ditemukan");
        }
    }
}