/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

/**
 * binary search
 * 8 maret 2020
 */
public class latihan8 {
     private static boolean  search(int[] x, int start, int end, int n){
        
         if (end< start) {
            return false;
        }
        
        int mid = (start + end)/2;
         
        if (x[mid] == n) {
           // System.out.println(mid);
            return true;
        }
        else{
            if (x[mid] < n) {
                return search(x, mid+1, end, n);
            }
            else{
            return search (x, start, mid-1,n);
            }
        }
    }
    public static void main(String[] args) {
        
        int [] x = {2,4,6,9,21,79,131};
       
        Scanner input = new Scanner(System.in);
        System.out.print("data di cari : ");
        int n = input.nextInt();
        
        boolean cari = search(x,1,x.length,n );
        if (cari== true) {
            System.out.println("data bernilai " + cari +
                    "\n angka " + n + " ada dalam data");
        }
        else {
            System.out.println("data bernilai " + cari + 
                    "\n angka " + n + " tidak ada dalam data");}
        
       
    }
}
