/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasTerbuka;
import java.util.Scanner;
/**
 *
 * Latihan fungsi, menghitung dan menggambar
 */
public class LatihanFungsiDll {
    public static void main (String [] args){
    //jika ingin terus berulang maka di bawah ini letakkan pada statement while (true){}
        Scanner input = new Scanner (System.in);
        System.out.print("panjang =");
        int pjg = input.nextInt();
        System.out.print("lebar =");
        int lbr = input.nextInt();
           
        //mengambil fungsi di bawahnya
        System.out.println("ini adalah hasil dari void main");
        gambar(pjg, lbr);
        System.out.println("luas = " + luas (pjg,lbr) );
        System.out.println ("keliling =" + keliling (pjg, lbr) );
        //dibawah ini untuk menanggil
        tampilkanMereka(pjg,lbr);
        
    }
   
    
    private static void tampilkanMereka(int pjg, int lbr){
        System.out.println("ini adalah hasil dari void tampilkanMereka");
        gambar(pjg, lbr);
        System.out.println("luas = " + luas (pjg,lbr) );
        System.out.println ("keliling =" + keliling (pjg, lbr) );
    }
    
    private static void gambar (int pjg, int lbr){
        
        for (int i=0; i<lbr; i++ ){
            for (int j=0; j<pjg; j++ ){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    
    }
    
    private static int luas (int pjg, int lbr){
        int hasil = pjg*lbr;
        return hasil;
    
    }
    
    private static int keliling (int pjg, int lbr){
        //didalam fungsi ini sebenarnya masih bisa menampilkan sesuatu
        System.out.printf("keliling ni adalah hasil perhitungan panjang %d dan lebar %d \n", pjg, lbr);
        int hasil= (pjg+lbr) * 2;
        return hasil;
                
    
    }
}
