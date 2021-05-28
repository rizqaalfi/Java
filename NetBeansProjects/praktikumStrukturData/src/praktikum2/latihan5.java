/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * 6 maret 2020
 */
public class latihan5 {
    public static void decToBi( int num){
        //System.out.println(num);
        if (num>0) {
            decToBi(num/2);
            //System.out.println(num);
            System.out.println(num %2);
        }
    }
    public static void main(String[] args) {
        decToBi(8);
    }
}
