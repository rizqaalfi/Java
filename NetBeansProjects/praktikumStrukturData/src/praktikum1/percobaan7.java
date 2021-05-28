/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * 25 feb 2020
 */
public class percobaan7 {
    public static void main(String[] args) {
        
        int Array [][]= {
            {1,2}, {3}, {4,5,6}
        };
        
        for (int i = 0; i <Array.length ; i++) {
            System.out.println("row number " + i + " has " + Array[i].length + " columns"); 
        }
        
        for (int[]baris : Array) {
            for (int angka : baris) {
                System.out.println(angka + "");
            }
          
        }
    }
}
