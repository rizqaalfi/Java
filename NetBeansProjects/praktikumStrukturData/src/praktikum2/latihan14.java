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
public class latihan14 {
   public static int f(int n){
       if (n==0) {
           return 0;
       }
       if (n==1) {
           return 1;
       }
       if (n==2) {
           return 2;
       }
       return 2*f(n-2)+ f(n-3);
} 
    public static void main(String[] args) {
       int x = f(3);
        System.out.println(x);
    }
}
