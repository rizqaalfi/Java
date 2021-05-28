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
public class TestBreak5 {
    public static void main(String[] args) {
        loopA: for(int x =0;x<2;x++) {
            System.out.println("Loop A Ke " + x);
        }
        loop1: for(int x=1;x<3;x++) {
            System.out.println("Perulangan ke " + x);
            loop2: for(int y=0;y<5;y++) {
                 if (y==2){
                     break loop1;
                 }
                System.out.println("Nilai y : " + y);
            }
        }
        System.out.println("Akhir program");
    }
}
