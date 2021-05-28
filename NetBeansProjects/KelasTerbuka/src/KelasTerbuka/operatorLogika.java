/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class operatorLogika {
    public static void main (String [] args){
    
        /*operator logika : operasi yang bisa kita akikan dengan type data boolean
         *&& (AND)- dengan menggunakan operasi kali
         *||(OR)menggunakan operasi plus
         * ^ (XOR) - exclusive or : true jika ada 2 nilai berbeda. jika 2 2nya sama maka false (dilakukan pasa swich)
            # pada beberapa bahasa pemrograman, tanda tsb memiliki arti pangkat
         dapat melakukan operasi matematika dengan hasil boolean juga
        nilainya hanya 1 dan 0 yng berarti benar dan salah */
        
        boolean a, b,c ;
        
        System.out.println ("---OR---");
        a = true;
        b= false;
        c = a||b;
        System.out.println (a + "||" + b + "=" + c);
        
         boolean a1, b1,c1 ;
        
        System.out.println ("---AND---");
        a1 = true;
        b1= false;
        c1 = a1&&b1;
        System.out.println (a1 + "&&" + b1 + "=" + c1);
        
         boolean a2, b2,c2 ;
        
        System.out.println ("---XOR---");
        a2 = true;
        b2= false;
        c2 = a2^b2;
        System.out.println (a2 + "^" + b2 + "=" + c2);
        
        // NOT / negasi -> flipping (!)
         boolean x,y ;
        
        System.out.println ("---negasi (!)---");
        x = false;
        y= !x;
        
        System.out.println (x + "--> (!)" + "=" + y);
        
        
    }
}
