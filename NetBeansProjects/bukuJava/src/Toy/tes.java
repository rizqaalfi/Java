/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;



/**
 *
 * @author Acer
 * 
 */
public class tes {
    public static void main(String[] args) {
        
        // bilangan pecahan
        double x = 1.0/2;
        System.out.println(x);
        // untuk menghasilkan bilangan pecahan, maka salah satu dari angka pembagian
        // baik pembilang atau penyebutnya harus memiliki nilai double ex. 2.0
        
        // Substring
        String r = "Hallo, Apa Kabar Semua";
        String r1 = r.substring(0, 8);
        // angka pertama untuk permulaam dan angka kedua untuk huruf yang tidak akan dicetak
        System.out.println(r1);
       
       // membandingkan String
       String e = "Hallo, apa kabar semua";
        if (r.equals(e)) {
            System.out.println(" Kalimat Sama ");
        }else {
            System.out.println(" Kalimat tidak sama ");
        }
        
        if (r.equalsIgnoreCase(e)) {
            System.out.println(" Menurut ignore kalimat sama");
        }else{
            System.out.println(" Menurut ignore Tidak sama");
        }
        
        System.out.println("Hai ... Kamila. apa kabar");
        
        
  }
}
