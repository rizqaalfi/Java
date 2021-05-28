/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/** 9,7,5,3,1
 *
 * 7 maret 2020
 */
public class latihan15 {
    public static int square(int n){
        if (n==0) {
            return 0;
        }
        return square(n-1) + 2*n-1;
}
    public static int cube(int n){
        if (n==0) {
            return 0;
        }
        return cube(n-1)+3*(square(n))-3*n+1;
    }
    public static void main(String[] args) {
        int kotak = square(5);
        System.out.println("luas kotak = " +kotak);
        
        int kubus = cube(5);
        System.out.println("volume kubus = " +kubus);
        
        int kubus2 = cube(123);
        System.out.println("volume kubus2 = " + kubus2);
    }
}
