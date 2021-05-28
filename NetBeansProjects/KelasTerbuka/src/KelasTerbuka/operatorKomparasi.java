/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class operatorKomparasi {
   public static void main (String [] agrs ) {
   // operator komparsi akan menghsilkan nilai dalam bentuk boolean
   
   int a,b ;
   a= 12;
   b= 11;
   System.out.printf ("%d apakah sama dengan %d ? %s \n", a,b,(a==b));
   // %s melambangakan sting yang akan menjawab true atau false
   
    //bisa juga langsung menggunakkan operator boolean
     
   int a1,b1 ;
   boolean hasilKomparasi;
   
   a1 = 12;
   b1= 11;
   hasilKomparasi = (a1==b1);
   System.out.printf ("%d apakah sama dengan %d ? %s \n", a1,b1,hasilKomparasi);
   
   //operator equal atau persamaan
   int a2,b2 ;
   boolean hasilKomparasi1;
   
   a2 = 12;
   b2= 11;
   hasilKomparasi1 = (a2==b2);
   System.out.printf ("%d == %d --> %s \n", a2,b2,hasilKomparasi1);
   
   
   //operator not equal atau pertidakpersamaan
   int a3,b3 ;
   boolean hasilKomparasi2;
   
   a3 = 12;
   b3= 11;
   hasilKomparasi2 = (a3 != b3);
   System.out.printf ("%d != %d --> %s \n", a3,b3,hasilKomparasi2);
   
   //operator less then atau kurang dari
   int a4,b4 ;
   boolean hasilKomparasi3;
   
   a4 = 12;
   b4= 11;
   hasilKomparasi3 = (a4 < b4);
   System.out.printf ("%d < %d --> %s \n", a4,b4,hasilKomparasi3);
   
    
   //operator greater then atau lebih dari
   int a5,b5 ;
   boolean hasilKomparasi4;
   
   a5 = 12;
   b5= 11;
   hasilKomparasi4 = (a4 > b4);
   System.out.printf ("%d > %d --> %s \n", a5,b5,hasilKomparasi4);
   
   //berlaku untuk operator lain seperti <=, >=
   }
}
