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
public class percobaan1 {
    public static void insertionSort(int[]A) {
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
    public static void tampil( int data[]){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int A[] = {10,6,8,3,1};
        percobaan1.tampil(A);
        percobaan1.insertionSort(A);
        percobaan1.tampil(A);
    }
}
