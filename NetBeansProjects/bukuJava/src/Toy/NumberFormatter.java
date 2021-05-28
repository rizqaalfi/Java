/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author Rizqa Alfiani
 * page 79, 80
 * format keluaran pada java.text
 */
public class NumberFormatter {
    public static void main(String[] args) {
        format();
        System.out.println("\n");
        formatKorea();

    }
        
   static void format (){
        double x = 1000.0/3;
        NumberFormat number = NumberFormat.getNumberInstance();
        NumberFormat Currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
    
        String nmb = number.format(x);
        String crr = Currency.format(x);
        String prt = percent.format(x);
        
        System.out.println("Format Number " + nmb);
        System.out.println("Format Currency " + crr);
        System.out.println("Format Percent " + prt);
   
   } 
   static void formatKorea(){
       double x = 1000.0/3;
        NumberFormat number = NumberFormat.getNumberInstance(Locale.KOREA);
        NumberFormat Currency = NumberFormat.getCurrencyInstance(Locale.KOREA);
        NumberFormat percent = NumberFormat.getPercentInstance(Locale.KOREA);
    
        String nmb = number.format(x);
        String crr = Currency.format(x);
        String prt = percent.format(x);
        
        System.out.println("Format Number " + nmb);
        System.out.println("Format Currency " + crr);
        System.out.println("Format Percent " + prt);
   }
    
}
