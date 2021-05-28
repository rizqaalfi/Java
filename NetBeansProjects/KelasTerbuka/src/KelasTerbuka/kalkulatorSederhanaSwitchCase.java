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
public class kalkulatorSederhanaSwitchCase {
    public static void  main (String [] args) {
        Scanner input = new Scanner (System.in);
        
        float a,b, hasil;
        String operator;
        
        System.out.print("input a =");
        a = input.nextFloat();
        System.out.print("operator a=");
        operator = input.next();
        System.out.print("input b =");
        b = input.nextFloat();
        
        switch(operator){
            case "+" :
                hasil = a+b;
                System.out.println("hasil =" + hasil);
              break;
            case "-" :
                hasil = a-b;
                System.out.println("hasil =" + hasil);
              break;
            case "*" :
                hasil = a*b;
                System.out.println("hasil =" + hasil);
              break;
            case "/" :
                hasil = a/b;
                System.out.println("hasil =" + hasil);
              break;
              
            default :
                System.out.println ("operator" + operator + "tidak terdefinisi");
        }
    
    }
}
