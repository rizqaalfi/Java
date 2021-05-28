/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * 2 maret 2020
 */
public class latihan2 {
    private static void huruf(String a, int n){
        if (n==0) {
            System.out.print(a + " ");
        }
        else {
            for (int i = 97; i < 100; i++) {
                huruf(a + (char)i, n-1);
                
            }
            
        }
    }
    public static void main(String[] args) {
        huruf("",3);
    }
}
