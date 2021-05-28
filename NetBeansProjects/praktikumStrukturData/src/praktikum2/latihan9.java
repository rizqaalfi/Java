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
public class latihan9 {
    public static int mystery( int a, int b){
         System.out.println(a + "  " + b);
        if (b==0) {
           
            return 0;
        }
        if (b%2==0) {
            
            return mystery(a+a, b/2);
        }
        
        return mystery(a+a, b/2)+a;
}
    public static void main(String[] args) {
        mystery(2,25);
        System.out.println("\n");
        mystery(3,11);
        
    }
}
