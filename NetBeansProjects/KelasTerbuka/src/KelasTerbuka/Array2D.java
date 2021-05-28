/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;
import java.util.Arrays;
/**
 *
 * digunakan untuk matriks
 * contoh dibawah adalah penjumlahan dan perkalian matrix
 * belum berhasil cobalagi rizqa..
 * semangat
 */
public class Array2D {
    public static void main(String[] args) {
      int [][] matrixA = {
          {1,2,4,5},
          {4,5,45,5},
          {2,3,45,5}
         
      };
      int [][] matrixB = {
          {11,12,34,5},
          {13,14,45,32},
          {1,2,3,5}
          
      };
      
      int [][] matrixC = {
          {1,2},
          {3,4},
          
         
      };
      int [][] matrixD = {
          {11,12},
          {13,14},
          
      };
      
      printArray (matrixA);
      printArray (matrixB);
      
      //pada penjumlahan baris dan kolomnya harus sama
      int [][] hasilTambah = tambah (matrixA,matrixB);
        
        printArray (hasilTambah);
     
        
        //perkalian matrix
       
        int [][] hasilKali = kali (matrixC,matrixD);
        printArray (hasilKali);
       
    }
    private static int [][] kali (int [][]matrix1,int [][]matrix2){
        int barisC = matrix1.length;
        int kolomC = matrix1[0].length;
        int barisD = matrix2.length;
        int kolomD = matrix2[0].length;
        int [][] hasil =new int [barisC][kolomD];
        int buffer;
        for (int i = 0; i < barisC; i++) { 
            for (int j = 0; j < kolomD; j++) {
               buffer = 0; 
                for (int k = 0; k < kolomC; k++) {
                    buffer += matrix1[i][k]*matrix2[k][j];
                }
              hasil [i][j] = buffer;  
            }
        }
       return hasil; 
    
    }
    private static int [][] tambah (int [][]matrix1,int [][]matrix2){
      int barisA = matrix1.length;
      int kolomA = matrix1[0].length;
      int hasil [][] = new int [barisA][kolomA];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                hasil [i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
        return hasil;
    
    }
    private static void printArray( int [][] dataArray){
     int baris  = dataArray.length;
     int kolom = dataArray[0].length;
     
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray [i][j]);
                
                if (j <(kolom-1)){
                    System.out.print(",");}
                else {
                    System.out.print("]");}
            }
            
            System.out.print("\n");
        }
        System.out.println("");
    }
}
