/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasTerbuka;

/**
 *
 * 
 */
public class MethodVoid {
    public static void main (String [] args){
    
        System.out.println(" ini nilainya simple " + simple());
        
        SelamatPagi ( " rizqa " );
        fungsiVoid ( " iya " );
        
        
    
    }
   // void artinya hampa
    // dimana menjalankan fungsi atau method tanpa kembalian
   private static void SelamatPagi(String nama){
        System.out.println("Selamat Pagi" + nama );
    }
    private static void fungsiVoid(String input){
        System.out.println( input);
    }
    //fungsi atau method dengan kembalian
    //sehingga menggunakan return untuk mengampalikan niainya
    private static float simple(){
        return 10.0f;
    }
}
