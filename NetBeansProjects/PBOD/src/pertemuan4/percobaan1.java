/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
/**
 *Rizqa Alfiani
 */
class Operator1 {
    public static void main(String[] args) {
        int var = 1;
        int a,b,c;
        a = b = c = 99;
    
        int d,e,f;
        f = 99;
        e = f;
        d = e;
        System.out.println("Nilai var : " + var);
        System.out.println("Nilai a : " + a);
        System.out.println("Nilai b : " + b);
        System.out.println("Nilai c : " + c);
        System.out.println("Nilai f : " + f);
        System.out.println("Nilai e : " + e);
        System.out.println("Nilai d : " + d);
    
        int z;
        char Teks1 = 'a'; 
        // dalam Unicode karakter 'a' direpresentasikan dengan angka 97
        z = Teks1 * 10; 
        // z = 97 * 10;
        System.out.println("Nilai Teks1 : " + Teks1);
        System.out.println("Nilai z : " + z);
    }
}