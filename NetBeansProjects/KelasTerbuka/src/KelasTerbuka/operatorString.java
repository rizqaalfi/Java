/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;
    import java.util.Scanner;
    import java.lang.String;
/**
 *
 * @author Acer
 */
public class operatorString {
    public static void main(String[] args) {
        String kal1 =  "Saya Suka Makan Pisang";
        
        //mengambil komponen string
        System.out.println(kal1.charAt(5));
        
        //substring
        String kata = kal1.substring(10, 15);
        System.out.println(kata);
        
        //cocatenation (concat)-> menyambungkan
        String kal2 = kata + " bakwan";
        System.out.println(kal2);
        
        //menimpa string yang ada (diletakkan di string pool)
        kata = kata + " cireng";
        System.out.println(kata);
        
        //concat dengan non String
        int jumlah = 20;
        String kal3 = kata + " " + jumlah; //casting
        System.out.println(kal3);
        
        //lowercase dan upper case
        System.out.println(kal1.toUpperCase());
        System.out.println(kal1.toLowerCase());
        
        //replace(membuat memori string pool yang baru)
        String kal4 = kal1.replace("Pisang", "Combro");
        System.out.println(kal1);
        System.out.println(kal4);
        
         //compare -> berdasarkan urutan alfabetis
         System.out.println("\n ini adalah hasil compare alfabetis");
        String motor1 = "Rimalaya";
        String motor2 = "Kawasaki";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));
        
        //equality(persamaan)
        String kataInput = "test"; //trpt di String pool
//      String kataInput = new String ("test"); //ini bukan string literal dan tdk berada di string pool
        String kataTest = "test"; //trpt di String pool
        
        System.out.print(" \n persamaan pada lokasi string pool = ");
        if (kataInput == kataTest){
            //mengecek memorinya
            System.out.print("sama");
        }
        else {
            System.out.print("tidak sama");}
        
        
        System.out.println("\n \n megambil input String dari user"); //bukan d string pool(trdpt di heap)
        Scanner input = new Scanner(System.in);
        
        System.out.print("ini adalah input user = ");
        kataInput = input.next();
        
         System.out.print(" \n persamaan isinya = ");
        if (kataInput.equals(kataTest)){
            //equals mengecek isinya, bukan memorinya(lokasi)
            System.out.print("sama");
        }
        else {
            System.out.print("tidak sama");}
        
        
       
        
    }
}
