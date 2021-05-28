/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *Rizqa Alfiani
 * E31191919
 */
public class TestContinue6 {
    public static void main(String[] args) {
        int x=10;
        System.out.println("Sebelum while");
        while(x-->1) {
            if(x % 2 == 0){
                continue;
            }
            System.out.println("Nilai x : " + x);
        }
        System.out.println("Sesudah while");
    }
}
