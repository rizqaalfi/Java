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
public class BubbleSort {
  

    static void urut(int Arr[]){
     boolean swap= true;
     while (swap){
        swap = false;
        for (int i = 0; i < Arr.length-1; i++) {
            for (int j = 0; j < Arr.length-i-1; j++) {
                if (Arr[j] >  Arr[j+1]){
                     //tukar Arr[j+1] dan Arr[i]
                    int x = Arr[j];
                    Arr[j]= Arr[j+1];
                    Arr[j+1] = x;
                    swap= true;
                }
            }
           
        }
     }   
     
    
    }
}
   


