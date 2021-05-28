/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class TestBreak1 {
    public static void main(String[] args) {
        System.out.println("Sebelum for");
        for(int a=0;a<10;a++) {
            if(a==4){
                break;
            }
            System.out.println("Nilai a : "+ a);
        }
        System.out.println("Setelah for");
    }
}
