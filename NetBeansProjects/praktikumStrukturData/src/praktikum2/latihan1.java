/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
import java.util.Scanner;
/**
 * 7 maret 2020
 */
public class latihan1 {
    static long faktorial(int n){
        long z=1;
        int i=1;
        
        while(i<=n){
        z=z*i;
        i++;
        }
        return z;
    }
    public static void main(String[] args) {
        int a,k,l;
        
        Scanner input= new Scanner(System.in);
        System.out.print("masukkan nilai :");
        a= input.nextInt();
        
        for (k = 0; k < a; k++) {
            for (l = 0; l < a-k-1; l++) {
                System.out.print(" ");
            }
            for (l = 0; l <= k; l++) {
                System.out.print(faktorial(k)/(faktorial(l)*faktorial(k-l))+ " "); 
            }
            System.out.println();
        }
    }
}
