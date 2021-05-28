/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama, alamat;
        int usia, gaji;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println ("Pendataan Karyawan");
        System.out.print("Nama ; ");
        nama = keyboard.nextLine();
        System.out.print ("Alamat: ");
        alamat = keyboard.nextLine();
        
        System.out.print("usia; ");
        usia = keyboard.nextInt();
        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();
        
        System.out.println("--------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: "+ usia + "tahun");
        System.out.println("Gaji: Rp " + gaji + ",-");
        
        
        
        
                
    }
    
}
