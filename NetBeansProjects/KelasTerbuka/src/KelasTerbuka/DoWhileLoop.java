/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * rizqa Alfiani
 * do while loop mengerjakan aksi dulu baru Kondisi
 * jadi meskipun salah pasti akan di kerjakan setidaknya satu kali
 */
public class DoWhileLoop {
    public static void main (String [] args){
    
  // do { 
  //      aksi 
  // }while (kondisi)
   int a = 0;
   boolean kondisi = true;
  
   do {
       a++;
       System.out.println ("ini adalah whileLoop ke-" + a);
       if (a==10){
          kondisi = false;
       }
  
  } while ( kondisi);
 
}
}