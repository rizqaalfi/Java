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
public class latihan11 {
    public static String ex234(int n){
         System.out.println(n);
        if (n<=0) {
           
            return "";
        }
        
        return ex234(n-3) + n + ex234(n-2) + n;
}
    public static void main(String[] args) {
        ex234(6);
    }
}
