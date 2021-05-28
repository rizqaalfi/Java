/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 70
 * Unicode
 */
public class Char{
    public static void main(String[] args) {
      
        printDataChar();
    }
    
    private static void printDataChar (){
        char ch1, ch2, ch3;
        //88 adalah kode untuk x
        ch1 = 88;
        ch2 = 'Y';
        
        System.out.print("ch1 dan ch2 : " );
        System.out.println(ch1 + " " + ch2 + "\n");
        
        ch3 = 'X';
        System.out.println("ch3 adalah " + ch3);
        ch3++;
        System.out.println("setelah di increment menjadi " + ch3);
    }
}
