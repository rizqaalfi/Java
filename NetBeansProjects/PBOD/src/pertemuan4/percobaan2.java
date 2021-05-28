/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * Rizqa Alfiani
 */
class Operator2{
    public static void main(String[] args) {
        int x = 10;
        int y;
        y = ++x;
        System.out.println("Nilai x dari ++x : "+x);
        System.out.println("Nilai y dari ++x : "+y);

        x=10;
        y = x++;
        System.out.println("Nilai x dari x++ : "+x);
        System.out.println("Nilai y dari x++ : "+y);
    }
}
