/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;
     import java.util.Arrays;
/**
 *
 * @author Acer
 */
public class operasiArray {
    public static void main(String[] args) {
        
        int[] arrayAng1 = {1,2,3,3,4};
        
        //merubah array menjadi String
        System.out.println("\nmerubah Array menjadi String\n----------");
        printArray(arrayAng1);
        
        //mengkopi Array
        System.out.println("\nmegkopiArray\n----------");
        int[] arrayAng2 = new int [5];
        printArray(arrayAng1);
        printArray (arrayAng2);
        
        System.out.println("\nmengkopi dengan loop");
        for (int i = 0; i < arrayAng1.length; i++) {
            arrayAng2[i] = arrayAng1[i];
        }
        printArray(arrayAng1);
        System.out.println(arrayAng1);
        printArray(arrayAng2);
        System.out.println(arrayAng2);
        
        System.out.println("\nmengkopi dengan copyOf");
        int [] arrayAng3 = Arrays.copyOf(arrayAng1,5);
        //angka dibelakan koma bisa di ganti sesuai dg panjang yg di inginkan
        printArray(arrayAng1);
        System.out.println(arrayAng1);
        printArray(arrayAng3);
        System.out.println(arrayAng3);
        
        System.out.println("\nmengkopi dengan copyOfRange");
        int [] arrayAng4 = Arrays.copyOfRange(arrayAng1,3,5);
        //mengkopi dari index 3 - 5 dimana index terakhir tidak di hitung
        printArray(arrayAng1);
        System.out.println(arrayAng1);
        printArray(arrayAng4);
        System.out.println(arrayAng4);
        
        //Fill Array
        System.out.println("\nFill Array\n--------");
        int[] arrayAng5 = new int[10]; //bisa di isi angka berapa saja
        printArray (arrayAng5); //array awal
        Arrays.fill(arrayAng5,1); //mengisi arrayAng5 dg angka 1
        printArray (arrayAng5);
        
        //komparasi Array
        System.out.println("\nkomparasi Array\n----------");
        int [] arrayAng6 = {2,3,4,5,5,3,2};
        int [] arrayAng7 = {2,3,4,5,5,3,2};
        
        System.out.println("membandingkan atara 2 buah array");
        System.out.println(Arrays.equals(arrayAng6, arrayAng7));
        
        if (Arrays.equals(arrayAng6, arrayAng7)){
            System.out.println("array ini sama");}
        else {
            System.out.println("array ini beda");}
        
        //cari compare (mencari Array yg lebih besar)
        //cari mismatch (mencari index mana nilainya berbeda
        
        //sort Array
        System.out.println("\nsort Array\n --------- ");
        int [] arrayAng8 = {3,5,56,77,8,5,6,7,5,9};
        printArray (arrayAng8); //array awal
        Arrays.sort(arrayAng8);
        printArray (arrayAng8); //array setelah di sorting
        
        //search Array
        System.out.println("\nsearch Array\n------");
        
        int angka = 56;
        int posisi = Arrays.binarySearch(arrayAng8, angka);
        System.out.println("angka ->" + angka + "ada di index " + posisi );
    }
    
    
    private static void printArray (int[] dataArray){
        System.out.println("array ->" + Arrays.toString(dataArray));
    }
    
    //tugas
    /* 1. sorting terbalik/ tidak berurutan(dgn looping )
    * 2. melakukan oprasi dengan aritmatika (buat fungsi lalu gunakan copyOf)
    * 3. menggabungkan 2 buah Array( di tempelin) -> dengan fungsi.
     * menghasilkan array yang jumlahnya adalah gabungan dari 2 buah array
    */
}
