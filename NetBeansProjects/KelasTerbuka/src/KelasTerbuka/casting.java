/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class casting {
    public static void main (String [] args){
    // belajar casting
    
   int a= 32;
   int b = 5;
   
   float l = a/b;
   
   System.out.printf ("%d/%d = %f \n",a ,b,l);
           
           /* jika bilagan yang akan di bagi sama-sama bernilai integer dan hasilnya bertipe float
           maka tidak menghsilkan nilai di belakan koma misal : 6.0000
          *solusinya, harus di casting atau salah satu dari a atau b harus di ganti menjadi float
*/
   
    int c = 32;
    float d = 5;
    
    float f = c/d;
    
    System.out.printf ("%d/%f = %f \n", c,d,f);
    
    //atau penggunaan casting
    
    int e = 32;
    int r = 5;
    
    float s = (float)e/ r;
    
    System.out.printf ("%d/%d = %f \n", e,r,s);
           
   }
}
