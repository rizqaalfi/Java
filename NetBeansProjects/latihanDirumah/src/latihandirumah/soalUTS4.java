/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandirumah;
  import java.util.Scanner;
/**
 *
 * soal
 * buat program menamilkan bilangan genap antara 10 hingga 20 kecuali 14 dan 18
 */
public class soalUTS4 {
    public static void main (String [] args){
     Scanner input = new Scanner (System.in);
     int  a = 11; //a=11 karena yg di minta antara 10-20 sehingga 11 untuk proses pertama
     // dan untuk N nya bernilai 10 untuk mencapai angka 20
     int j = 0;
     
     for (int n= input.nextInt(); n>1; n--) //n>1 digunakan untuk yang antara sehingga prosesnya berkurang 1 kali
             {
     if (a%2==0){
     System.out.println ( a + "melewati tahap mod 2" );
     if (a !=14){
          System.out.println ( a + "melewati tahap negasi 14" );
         
     if (a != 18){
         System.out.println ( a + "melewati tahap negasi 18" );
         j=j+a; 
         System.out.println("jumlahnya =" + j);
     }
    
     
         
         }
    
     
     
     } 
   
           a= a+1;
    
    
    
    }
     System.out.println ("setelah lolos tahap akhir jumlah nya" +j);
}
    }
