/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandirumah;
import java.util.Scanner;
/**
 *soal
 * hasil penjumlahan bilangan asli di bawah 10 yang merupakan kelipatan 3 atau 5
 * adalah  23 (3+ 5+6+ 9) hitung hasil penjumlahan bilangan asli keliapatan 3 atau 5 di bawah 1000
 */
public class soalKedua {
    public static void main (String [] args){
       Scanner input = new Scanner(System.in);
    int j = 0;
    int a = 1;
    
    
           
    for (int N= input.nextInt(); N>1;N--){
        if ( a%(5)==0) {
             j= j+a;
        System.out.println ("skrg di proses dg mod 5 hasil akhirnya" + j);
           } 
        if ( a%(3)==0) {
             j= j+a;
        System.out.println ("skrg di proses dg mod 3 hasil akhirnya" + j);
           } 
        
        a= a+1; 
                  
    }
     
        }
   
    }

