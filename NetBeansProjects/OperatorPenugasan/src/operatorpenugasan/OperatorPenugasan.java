/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorpenugasan;

/**
 *
 * @author Acer
 */
public class OperatorPenugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a, b;
      
      a=5;
      b=30;
      
      b+= a;
      System.out.println("Penambahan = " + b );
      
      b-= a;
      System.out.println("Pengurangan = " + b);
      
      b*= a;
      System.out.println("Perkalian = " + b);
      
      b/=a;
      System.out.println("Pembegian = " + b);
      
      b%=a;
      System.out.println("Hasil bagi = " + b);
      
    }
    
}
