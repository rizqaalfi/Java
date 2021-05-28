/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author Acer
 */
public class InsertionDemo {
    // latihan1
    public static void insertionSort(Integer[]A) {
        for (int i = 0; i < A.length; i++) {
            int key =A[i];
            int j= i-1;
            while((j>= 0) && (A[j]>key)){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
    }
    
    //latihan2
    public static void insertionSort(Double[]A) {
        for (int i = 0; i < A.length; i++) {
            double key =A[i];
            int j= i-1;
            while((j>= 0) && (A[j]>key)){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
    }
    //latihan3
     public static <T>void tampil( T data[]){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
     }   
}
