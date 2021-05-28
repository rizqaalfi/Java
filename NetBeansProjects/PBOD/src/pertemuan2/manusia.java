/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 * 6 maret 2020
 * Latihan
 */
public class manusia {
    
    double berat, tinggi;
    int usia;
   
    public static void main(String[] args) {
        manusia Ani = new manusia();
        manusia Ana = new manusia();
        
        Ani.berat= 45.7;
        Ani.tinggi = 167.8;
        Ani.usia= 19;
        
         
        Ana.berat= 46.7;
        Ana.tinggi = 147.1;
        Ana.usia= 29;
        
        System.out.println("data Ana");
        System.out.println("tinggi :" + Ana.tinggi + "cm \n" + "Berat :"
                + Ana.berat + " kg \n" + "Usia :" + Ana.usia + "tahun \n");
        
        System.out.println("data Ani");
        System.out.println("tinggi :" + Ani.tinggi + "cm \n" + "Berat :"
                + Ani.berat +"kg \n" + "Usia :" + Ani.usia + "tahun");
        
    }
    
}
