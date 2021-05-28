/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandirumah;
import java.util.Scanner;
/**
 *
 * @RizqaAlfiani
 * masih gagal heee.. coba lagi :'( 
 * 
 * Alhamdulillah..
 * hari ini tanggal 28 nov 2019, setelah sekian kali gagal
 * akhirnya bisa.
 * terimaksaih ya Allah. :)
 */
public class soalRemidi {

   
    public static void main (String []args){
     Scanner input = new Scanner (System.in);
    
    
     String pembeli  ;
     int harga;
   

    
    
    System.out.print ("banyak yang di fc =");
    int K = input.nextInt();
    System.out.print ("status pembeli=");
    pembeli = input.next();
     
       
    
    //equals untuk sama dengan dalam penggunaan string
    switch (pembeli ){ 
        case "pelanggan" :
            harga = 75;
    
    System.out.println  ( "harga perlembar = " +harga );
    System.out.println ("harga keseluaruhan =" + harga*K );
            break;
       case "bukanpelanggan" :
      if ( K >= 100){ 
          harga = 85;
          
       System.out.println  ( "harga perlemmbar = " +harga );
       System.out.println ("harga keseluaruhan =" + harga*K );
      }
      
      if ( K < 100 ){ 
          harga = 100;
      System.out.println  ( "harga perlemmbar = " +harga );
      System.out.println ("harga keseluaruhan =" + harga*K );
    }
        break;
      
    
    
     
    
           
            }
    }

   
    }
    

