/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 126
 * Latihan OOP
 * Algoritma belum nyambung
 */
public class postMan {
    private static boolean onOff[] = new boolean[150];
    final static int adjust = 1;
    
    public postMan (){
        initOnOff();
        doAnyThing();
    }
    
    static void initOnOff(){
        System.out.println(" Inisialisasi ");
        for ( int i = 1-adjust ; i<150 ; i++) onOff[i] = false;
    }

   static void doAnyThing(){
       System.out.println(" Do AnyThing : Please Wait !");
       for (int i = 1-adjust; i < 150; i++) {
           System.out.println("Pass : " + i);
           for (int j = i; j < 150; j+= i+adjust) {
               onOff[j] = !onOff[j];
           }
       }
   }
   
   public static void reportResult(){
       System.out.println("Hasil : ");
       for (int i = 1-adjust; i < 150; i++) {
          if ( onOff[i]) System.out.println(" | " + (i+adjust)); 
       }
   }
   
   static void test(){
       postMan.initOnOff();
       postMan.doAnyThing();
       reportResult();
   }
    public static void main(String[] args) {
      
        test();
        
    }
}
