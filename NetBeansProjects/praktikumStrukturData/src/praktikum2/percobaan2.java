/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 * Fibbonaci
 * 2 maret 2020
 */
public class percobaan2 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println("f" + i + "=" + fibbo(i));  
        }
    }
    public static int fibbo (int x){
        if (x<=0||x<=1){
        return x;}
        else {
        return fibbo(x-2) + fibbo (x-1);}
    
    }
    
}
