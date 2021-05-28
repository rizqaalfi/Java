/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * 7 maret 2020
 */
public class latihan10 {
   public static boolean gcdlike(int p, int q) {
       System.out.println(p + "  " + q);
       if (q==0) {
           
           return(p==1);
       }
       
       return gcdlike(q,p%q);
}
    public static void main(String[] args) {
        gcdlike(3,4);
    }
}
