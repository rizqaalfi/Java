/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 271
 * latihan OPP Java 
 * Materi GCD ( FPB )
 */
public class Math {
    public static int gcd ( int m, int n){
        int t;
        while ( m%n != 0){
            t = m;
            m = n;
            n = t%n;
        }
        return n;
    }
    
    static void test(){
        System.out.println("gcd (2,3)=" + gcd(2,3));
        System.out.println("gcd (12,6) =" + gcd(12,6));
    }
    
    public static void main(String[] args) {
        test();
    }
}
