/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;



/**
 *
 * @author Rizqa Alfiani
 * page 120
 */
public class CharInt {
   static void test(){
       String str = " ";
       
       for (int i = 0; i < 256; i++) {
           str += (char) i + " ";
           if(i%30==0) str += "\n";
           if (i%256 == 0) str += "\n\n";
      
       }
       
       System.out.println("Karakter dari 0 sampai 256 : ");
       System.out.println(str);
       
       str = "";
      for (int i = 65; i < 91; i++) {
           char ch = (char) i;
           str += ch + "    : " + (int) ch + "\n";
       }
      
       System.out.println(" \n \n Percobaan ke 2");
       System.out.println(str);
   }
   
    public static void main(String[] args) {
        test();
    }
 
}
