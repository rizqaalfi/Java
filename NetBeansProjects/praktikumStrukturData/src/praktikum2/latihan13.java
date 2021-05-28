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
public class latihan13 {
    public static int mystery(int a, int b){
        if (a==b) {
            System.out.println(a);
        }
        else{
        int m1= (a+b)/2;
        int m2 = (a+b +1)/2;
        mystery(a,m1);
            System.out.println("v");
        mystery(m2,b);
            System.out.println("x");
        }
        return 0;
}
    public static void main(String[] args) {
        mystery(0,8);
    }
    
}
