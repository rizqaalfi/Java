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
public class latihan6 {
    private static int test( String s, int last){
        if (last<0) {
            return 0;
        }
        if (s.charAt(last)=='0') {
            
            return 2 * test(s, last-1);
        }
       
        return 1+2* test(s,last-1);
}
    public static void main(String[] args) {
        int Test = test("01101", 4);
        System.out.println(Test);
    }
}
