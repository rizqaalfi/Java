/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author RizqaAlfiani
 * page 96
 * bitwise negasi. merubah 0 menjadi 1 dan 1 menjadi 0
 * ex. 000010000 -> 111101111
 */
public class bitwiseComplement {
    public static void main(String[] args) {
        int x = 8;
        System.out.println("x = " + x);
        int y = ~x;
        System.out.println("y = " +y);
    }
}
