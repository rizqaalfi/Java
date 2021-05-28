/*d 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * Rizqa Alfiani
 * E31191919
 */
public class SelectionSort {
    static void urut( int Arr[]){
        for (int i = 0; i < Arr.length; i++) {
            int  min = i;
            //cari bilangan 1,2,3 dst yg terkecil
            for (int j = i+1; j < Arr.length; j++) {
                if (Arr[j]<Arr[i]){
                    min = j;
                }
            }
            //loncat ke nilai terkecil dengan posisi i
            int temp = Arr[i];
            Arr[i]= Arr[min];
            Arr[min]= temp;
        }
    }
}
