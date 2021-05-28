/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * latihan7
 * 
 */
public class InsertionDemo3{
   
    public static <T extends Comparable> void insertionSort ( T []A) {
        for (int i = 0; i < A.length; i++) {
            T key = A[i];
            int j= i-1;
            while((j>= 0) && ( A[j].compareTo(key)>0)){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
    }
    public static <T>void tampil( T data[]){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("\n");
    }
}
