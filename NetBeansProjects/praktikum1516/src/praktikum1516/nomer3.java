/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1516;

/**
 * masih gagal coba lagi ya..
 * 
 */
public class nomer3 {
    public static void main (String [] args){
     float s =0;
     int i =1;
     int N = 10;
     
     while (i<=N){
     int p =(int) Math.pow((-1),(i+1));
     s = s + (p /i) ;
       i++;
         System.out.printf(" penjumlahan 1 sampai dengan (%d/%d) ", p,i);
         System.out.println("yaitu  =" + s);
    
     }
     
    }
}
