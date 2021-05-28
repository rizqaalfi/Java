/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 54
 * program pengujian kelas Math dalam java
 */
public class MathExplore {
    public MathExplore(){
    }
    static void test(){
        testE();
        testPI();
        testAbs();
        
    }
    static void betterTest(){
        testIntAbs();
    }
    
    static void testE(){
        System.out.println("Testing untuk Math.E");
        System.out.println("Math.E = " + Math.E + "\n");
    }
    
    static void testPI (){
        System.out.println("Testing untuk Math.PI");
        System.out.println("Math.PI = " + Math.PI +"\n");
    }
    static void testAbs (){
        System.out.println("Testing untuk Math.abs()");
        System.out.println("Math.abs 1 = " + Math.abs(-23.7));
        System.out.println("Math.abs 2 = " + Math.abs(0.0));
        System.out.println("Math.abs 3 = " + Math.abs (23.7));
        System.out.println("Double.MIN_VALUE =" + Double.MIN_VALUE);
        System.out.println("Math.abs(Double.MIN_VALUE =)" + Math.abs(Double.MIN_VALUE));
        System.out.println("Math.abs (-Double.MIN_VALUE =)" + Math.abs(-Double.MIN_VALUE));
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Math.abs (Double.MAX_VALUE = " + Math.abs(Double.MAX_VALUE));
        System.out.println("Math.abs (-Double.MAX_VALUE =" + Math.abs(-Double.MAX_VALUE) + "\n");
    }
    static void testIntAbs(){
        System.out.println("cara pengujian yang lebih baik didukung automatisasi");
        System.out.println("testing untuk Math.abs pada bilangan bualat");
        if ( Math.abs(-23) != 23) System.out.println("Math (-23) Error :: Hasil harus 23");
        else System.out.println("Math.abs(-23) :: Correct");
        if ( Math.abs(0) != 0) System.out.println("Math (0) Error :: Hasil harus 0");
        else System.out.println("Math(0) :: Correct");
        if ( Math.abs (23) != 23) System.out.println(" Math.abs (23) Error :: Hasil harus 23");
        else System.out.println("Math(23) :: Correct");
        
        System.out.println(" Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println(" Math.abs (Integer.MIN_VALUE =" + Math.abs(Integer.MIN_VALUE));
        System.out.println("Integer.MAX_VALUE =" + Integer.MAX_VALUE);
        System.out.println(" Math.abs(Integer.MAX_VALUE =" + Math.abs(Integer.MAX_VALUE));
        
        if (Math.abs(Integer.MIN_VALUE) != (-Integer.MIN_VALUE)) System.out.println("Math.abs(Integer.MIN_VALUE) :: Error");
        else System.out.println("Math.abs(Integer.MIN_VALUE :: Correct)");
        if (Math.abs(Integer.MIN_VALUE) < 0) System.out.println("Math.abs(Integer.MIN_VALUE) Error :: Hasil harus > 0");
        else System.out.println("Math.abs( Integer.MIN_VALUE) :: Correct");
        if ( Math.abs(Integer.MAX_VALUE) != Integer.MAX_VALUE ) System.out.println("Math.abs(Integer.MAX_VALUE) :: Error");
        else System.out.println("Math.abs(Integer.MAX_VALUE) :: Correct");
        
        System.out.println("\n\n Perhatian");
        System.out.println("1. Pengujian menunjukkan hasil yang tidak sesuai dangan metematika \n"
                + "2. Pada kondiisi batas sangat sulit di prediksi, untuk itu kita harus mengacu pada dokomentasi bahasa \n"
                + "3. Pengujian otomatis kadang tidak dapat menemukan secara benar karena di batasi juga \n"
                + "oleh kempuan bahasa itu sendiri bila kesalahan adalah pada spesifikasi bahasa itu sendiri \n"
                + "4. Pengujian otomatis akan benar ditangan yang ahli, pengujian dapat di tambah sbb \n"
                + " Berdasarkan kenyataan bahwa hasil fungsi abs tidak boleh kurang dari nol : \n"
                + " *. Di java, Math.abs(Integer.MIN_VALUE) Justru menghasilkan bilangan negative \n"
                + " *. Melanggar rumus matematika di mana hasil fungsi absolut selalu bernilai positif \n"
                + " *. Hasil ini dapat di telusiri karena representasi int adalah two's complement \n"
                + " *. Ini menggunakan versi 1.4 \n \n");
        
        
    }
    static void fullTest (){
        testAcos();
        testCeil();
        testExp();
        testFloor();
        testLog();
        testMax();
        testMin();
        testPow();
        testSin();
        testSqrt();
        testTan();
    }
    static void testTan (){
        System.out.println("Math.tan() = " + Math.tan(6));
   }
    static void testSqrt (){
        System.out.println("Math.sqrt() =" + Math.sqrt(4) );
    }
    static void testSin() {
        System.out.println("Math.sin () =" + Math.sin(3));
    }
    static void testPow (){
        System.out.println("Math.pow () =" + Math.pow(3, 2));
    }
    static void testMin(){
        System.out.println("Math.min () =" + Math.min (0.2, 0.9));
    }
    static void testMax (){
        System.out.println("Math.max () =" + Math.max(0.2, 0.9));
    }
    static void testLog (){
        System.out.println("Math.log () =" + Math.log(0.9));
    }
    static void testFloor(){
        System.out.println("Math.floor() =" + Math.floor(0.9));
    }
    
     static void testExp(){
        System.out.println("Math.exp () =" + Math.exp(0.9));
    }
    static void testCeil(){
        System.out.println("Math.ceil () =" + Math.ceil(0.9));
    }
    static void testAcos(){
        System.out.println("Math.acos() =" + Math.acos(0.9));
    }
    
   
    
    public static void main(String[] args) {
        test();
        betterTest();
        fullTest();
    }
}
