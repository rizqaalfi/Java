/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;
    import java.util.Scanner;
    
//Scanner berada pada package java.until
/**
 *
 * @author Acer
 */
public class scannerUtil {
    public static void main (String [] args) {
    String nama, alamat, lembaga = null;
    int gaji, usia;
  
    /* format scanner
    Scanner (...) = new Scanner (System.in)
    */
    
    Scanner input = new Scanner (System.in);
    
    System.out.print ("nama =");
    nama = input.nextLine();
     //(...) = (...).nextLine()
     //untuk memanggil fungsi scanner di atasnya
     
    System.out.print ("alamat =");
    alamat = input.nextLine();
    System.out.println("lembaga =" + lembaga);
    lembaga = input.next();
    System.out.print ("gaji =");
    gaji = input.nextInt ();
    System.out.print ("usia =");
    usia = input.nextInt ();
    
    
   System.out.println("nama =" + nama );
   System.out.println ("usia =" + usia + "tahun" );
   System.out.println ("alamat =" + alamat );
   System.out.println ("gaji =" + "Rp." + gaji + ",-" );
            
    /* untuk menanggil si scanner hanya dibedakan pada metode pemanggilannya
    sesuai dengan inisialisasi yang di tulis user
    
    * nextByte : membaca inputan yang bersifat byte
    * nextShort() : 
    * nextInt() :
    * nextLong() :
    * nextFloat() :
    * nextDouble() :
    * next() : membaca suatu string yang berakhiran spasi
    * nextLine() ; membaca suatu string yang berakhiran enter
    */
    }
}
