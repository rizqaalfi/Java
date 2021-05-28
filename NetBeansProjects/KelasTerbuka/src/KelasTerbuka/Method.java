/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasTerbuka;

/**
 *
 * Method atau fungsi
 * logika f(x)= (x*2)+x
 */
public class Method {
    public static void main (String [] args){
    
        int x,y;
     x = 4;
     y = hitung(x);
    System.out.println ("x= " + x + " y= " + y);
    
    x = 9;
     y = hitung(x);
    System.out.println ("x= " + x + " y= " + y);
    
    x = 5;
     y = hitung(x);
    System.out.println ("x= " + x + " y= " + y);
  }  
    
   private static int hitung (int h)
   //berada diluar public static void
   //jika ingin merubah rumus, maka tingal merubah fungsi dibawah
   {
    int hasil;
    hasil = (h*2)+h;
    
    return hasil;
    
    }
}
