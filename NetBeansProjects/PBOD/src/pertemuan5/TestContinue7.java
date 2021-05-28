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
public class TestContinue7 {
    public static void main(String[] args) {
        int x=10,y;
        label1: while(x-->0) {
            y=0;
            while(y++<10) {
                if(y > x) {
                    System.out.println();
                    continue label1;
                }
                System.out.print(x*y + " ");
            }
        }
    }
}
