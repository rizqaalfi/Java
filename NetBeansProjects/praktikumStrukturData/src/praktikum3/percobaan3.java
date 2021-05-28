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
public class percobaan3 {
    public static void insertionSort(double[]A) {
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
    public static void tampil( double data[]){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
        
    }
    public static void main(String[] args) {
        double A[] = {10.3,6.2,8.4,3.6,1.1};
        percobaan3.tampil(A);
        percobaan3.insertionSort(A);
        percobaan3.tampil(A);
    } 
}
