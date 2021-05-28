/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class InsertionSort {
    public static void urut(int []Arr) {
        for (int i = 0; i < Arr.length; i++) {
            int key =Arr[i];
            int j= i-1;
            while((j>= 0) && (Arr[j]>key)){
                Arr[j+1] = Arr[j];
                j--;
            }
            Arr[j+1] = key;
        }
    }
   
}
