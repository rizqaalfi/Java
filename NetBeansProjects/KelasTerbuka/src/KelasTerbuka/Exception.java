/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;
import java.io.FileInputStream;
import java.io.IOException;
 import java.util.Scanner;
/**
 *
 * try, catch, Finally
 */
public class Exception {
    public static void main(String[] args) {
         int [] Array = {0,1,2,3,4};
         
         Scanner input = new Scanner (System.in);
         FileInputStream fileInput = null;
         System.out.print("nilai ke :");
         int index = input.nextInt();
         
         
         //exeption handling (try, catch finally)
         //jika keluar dari bound(melebihi kapasitas angka, maka akan ada pemberitahuan exception
         //dan masih bisa melanjutkan untuk mengcompile sintax selanjutnya
         
        System.out.println("Handling Out of Bounds"); 
        try {
            System.out.printf("index ke- %d adalah %d \n", index, Array[index]);
         } catch ( ArrayIndexOutOfBoundsException e){
             System.err.println(e);}
         
         //rumtime error jika file tidak ada
         
         System.out.println("Handling IO not Found");
         try {
            fileInput=  new FileInputStream("input.txt");
         } catch (IOException e){
             System.err.println(e);}
         
         //menggabungkan 2 Exception
         //memilih antara 2 cacth, file tetap akan di eksekusi dari sintax yang paling atas.
         System.out.println("Menggabungkan dua buah Exception");
         try {
            System.out.printf("index ke- %d adalah %d \n", index, Array[index]);
            fileInput = new FileInputStream ("input.txt");
         }catch ( ArrayIndexOutOfBoundsException e) {
            System.err.println("Array yang and masukkan melebihi data");
         }catch( IOException e){
             System.out.println("file tidak ditemukan");
         }
         
         System.out.println("Menambahkan finally");
         try {
            System.out.printf("index ke- %d adalah %d \n", index, Array[index]);
         }catch ( ArrayIndexOutOfBoundsException e) {
            System.err.println("Array yang and masukkan melebihi data");
         }finally{
             System.out.println("Finally");
         }
         //finally akan di jalankan setelah try and cacth dilakukan
         
         System.out.println("\nini dalah akhir dari program");
    }
}
