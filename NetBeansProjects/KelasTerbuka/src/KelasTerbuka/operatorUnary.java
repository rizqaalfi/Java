/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Increment decrement
 * unary : operasi yang dilakukan pada satu variabel
 */
public class operatorUnary {
    public static void main (String [] args) {
    
        //unary + dan -
        int angka = 4;
        System.out.printf ("unary '-', %d menjadi %d \n", angka, -angka);
        System.out.printf ("unary '+', %d menjadi %d \n", angka, +angka);
       
        // unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println ("nilai dengan decrement mejadi" + angka2);
       
 
        int angka3 = 12;
        angka3--;
        angka3--;
        System.out.println ("nilai dengan 2x increment menjadi " + angka3);
        
        //prefix dan postfix
        
        int a = 12;
        System.out.printf ("nilai dengan '++' prefix menjadi = %d \n", ++a);
        // prefix itu, ditambah dulu baru di tampilkan
        int b = 12;
        System.out.printf ("nilai dengan '++' postfix menjadi = %d \n" , b++);
        
        /*postfix itu, ditampilkan dahulu barru di tambahkan
        jika dipanggil untuk yang kedua kalinya maka si postfix tadi akan di kerjakan
        pada penggilan yang kedua
        */
        
        int c = 5;
        System.out.printf ("nilai dengan '--' prefix menjadi = %d \n", c--);
        System.out.printf ("nilai dengan '--' prefix menjadi = %d \n", c);
        
       // unary boolean dengan tanda seru (!) utnuk negasi
       boolean ucup = true;
       System.out.println ( "nilai boolean =" + ucup );
       System.out.println ( "nilai boolean =" + !ucup );
       
       
       
        
            
    }
}
