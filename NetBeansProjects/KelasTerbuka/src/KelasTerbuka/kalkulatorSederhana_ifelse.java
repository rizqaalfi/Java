/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class kalkulatorSederhana_ifelse {
    public static void main (String [] args){
        
       Scanner input = new Scanner (System.in) ;
        float a,b, hasil;
        char operator;
        
        System.out.print ("nilai a =");
        a= input.nextFloat();
        System.out.print ("nilai operator =");
        operator = input.next().charAt(0);
        //mengambil char dalam string .charAt (0) 
        //menunjukkan bahwa yang di ambil adalah kata pertama
        System.out.print ("nilai b =");
        b= input.nextFloat(); 
    
        
        System.out.println("input user =" + a + " " + operator + " " + b);
        
        //menangkap operatornya
        
        if (operator == '+') {
        hasil = a+ b;
        System.out.println ("hasil=" + hasil);
        }else if (operator == '-'){
             hasil = a- b;
             System.out.println ("hasil=" + hasil);
        }else if (operator == '*'){
             hasil = a*b;
             System.out.println ("hasil=" + hasil);
        }else if (operator == '/'){
            if (b== 0){
                hasil = a/b;
            System.out.println ("pembagi nol meghasilkan tak hingga");}
            else{
            hasil = a/ b;
            System.out.println ("hasil=" + hasil);}
        }else {
            System.out.println ("operator tidak di temukan");
        }
    }
}
