/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;
  import java.util.Arrays;
/**
 *
 *Array adalah kumpulan data primitif 
 * tipe data yang digunakan harus sama
 *
 */
public class ArrayAwal {
    public static void main (String [] args){
    
        //Assignment
        //typedata [] nama = {komponen-komponen};
        
        System.out.println("ini adalah Array assignment");
        //           intdex =  0 , 1, 2, 3
        int[] arrayInteger = { 12, 3 ,4 ,6};
        
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);
        
        //deklarasi
        //typedata [] nama = new typedata [jumlah Array];
        
        System.out.println("ini adalah deklarasi Array");
        float[] arrayfloat = new float [5];
        
        arrayfloat [3]= 210.9f;
        
        System.out.println(arrayfloat [0]);
        System.out.println(arrayfloat [1]);
        System.out.println(arrayfloat [3]);

        System.out.println("pemanggilan library Array");
        //memanggil semua nilai yang ada dalam data array
        //menggunakan import java.util.Arrays
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString (arrayfloat));
    }
}
