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
class Operator3{
    public static void main(String[] args) {
        int x,y;
        x = ~10;
        System.out.println("Nilai negasi x : "+x);

        x = 170 & 34;
        System.out.println("Nilai and : "+x);

        x = 170 | 34;
        System.out.println("Nilai or : "+x);
        
        x = 170 ^ 34;
        System.out.println("Nilai xor : "+x);
    
        x = 1170;
        y = x >> 1;
        System.out.println("Nilai geser kanan : "+x);

        x = -1170;
        y = x >> 1;
        System.out.println("Nilai geser kanan neg : "+x);
        
        x = 1170;
        y = x >>> 1;
        System.out.println("Nilai geser kanan 1 bit 0 : "+x);

        x = -1170;
        y = x >>> 1;
        System.out.println("Nilai geser kanan 1 bit 0 neg : "+x);

        x = 1170;
        y = x << 1;
        System.out.println("Nilai geser kiri : "+x);

        x = 1073742994;
        y = x << 1;
        System.out.println("Nilai geser kiri : "+x);
    }
}