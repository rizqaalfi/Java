/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siproject;


import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class SIproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int seconds, h, m, s;
       Scanner input = new Scanner (System.in);
       seconds = input.nextInt();
       h= seconds/3600;
       m=(seconds%3600)/60;
       s = (seconds%3600)%60;
       
       System.out.println("Hasil konverensi dari : " +seconds + "detik adalah");
       System.out.println(h+ "jam" + m+ "menit" +s + "detik");
       
       
    }
    
}
