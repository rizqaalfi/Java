/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circledemo;

/**
 *
 * @author Rizqa Alfiani
 */
public class CircleDemo {
    public static final double PHI = 3.14;
    
    static void Test (){
        
        CircleDemo t = new CircleDemo ();
        
        double radius = 100;
        System.out.println ("keliling lingkaran berjari-jari " + radius + "adalah" + CircleDemo.calcCircumference (radius));
        System.out.println ("luas lingkaran barjari-jari "+ radius + "adalah" +CircleDemo.calcArea (radius));
        
    }
           
    /**
     * calcCircumferece dan clacArea dapat di ganti dengan nama apa saja, format penggunaan untuk memanggil
     * nama kelas. nama kostanta
     * Nama Test diganti apa saja  dan harus di akhiri oleh tanda kurung ()
     * @param args
     */
    public static void main(String[] args) {
      Test ();
    }   
    static double calcCircumference (double r){
        return (2*PHI*r);
    }
    /* return digunakan untuk mengembalikan
    */
    
    static double calcArea (double r){
        return (PHI*r*r);
    }
   
  

   
}
