/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 * 6 Maret 2020
 * praktikum
 */
public class buku {
    String pengarang;
    String judul;
    
    public static void main(String[] args) {
        buku a= new buku(); //memanggil kontruktor "()" tanpa parameter
        buku b= new buku();
        
        a.judul = "Pemrograma berorientasi objek";
        a.pengarang = "Indrajani, S. Kom";
        b.judul= "Pemrograman Visual";
        b.pengarang = "Ali Raihan S.Kom";
        System.out.println("Judul" + a.judul + ", pengarang :" + a.pengarang);
        System.out.println("Judul" + b.judul + ", pengarang :" + b.pengarang);
    }
}
