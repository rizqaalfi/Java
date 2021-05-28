/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * 7 maret 2020
 */
public class latihan12 {
    public static void collatz(int n){
        System.out.print(n + " ");
        if (n==1) {
            return;
        }
        if (n%2==0) {
            collatz(n/2);
        }
        else {
            collatz(3*n+1);
        }
        
}
    public static void main(String[] args) {
        collatz(7);
    }
}
