/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Arrays;
import java.util.Scanner;
/**
 * BinarySearch
 * 7 maret 2020
 */
public class latihan3 {
    public static void main(String[] args) {
        int [] ex = {2,5,8,10,14,32,35,41,67,88,90,101,109};
        
        
        System.out.println("data :" + Arrays.toString(ex));
        Scanner input= new Scanner(System.in);
        System.out.print("data yang di cari :");
        int n = input.nextInt();
        int angka = BinarySearch(ex,0,ex.length,n);
        System.out.println("data berada pada index ke-" + angka);
        
    }
    
    
    static int BinarySearch( int [] ex, int low ,int high, int cari){
        
        if (high<low) {
           return 0;
        }
        int mid =((low+high)/2);
        
        if ( ex[mid]==cari){
            return mid;
              
        }
        else{
        
        if (ex[mid] < cari) {
            return BinarySearch(ex, mid+1,high, cari);
        }
        else{
        return BinarySearch(ex, low,mid-1,cari);
        }
        } 
}  
}