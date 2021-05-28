/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * rizqa Alfiani
 * switch case hampir sama dengan if else,bedanya si switch case itu ekspresinya berupa
 * satuan, string dan enum
 * 
 */
public class switchCase {
   
    public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    
    System.out.print ("masukkan nama : ");
    String nama = input.next();
    
    //ekspresinya berupa satuan(int, long, byte, short), string atau enum.
    switch (nama){
        case "rizqa":
            System.out.println ("ya, saya rizqa");
            System.out.println ("Siap laksanakan tugas");
            break;
        case "Alfiani":
            System.out.println ("okkay, siap");
            break;
        default :
            //default berperan sebagai else dalam if
            //namun bedanya di atas default harus ada break agar tidak dijalankan
            //untuk memberhentikan suatu statement
            System.out.println ( nama + " tidak hadir pak");
    }
   
    //pada switch case setiap statement nama yang di panggil harus di hentikan
    //dengan menggunakan break
    
    }
    
    }

