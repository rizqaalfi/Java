/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @rizqaAlfiani
 * 28 November 2019
 */
public class nestedIf {
    public static void main (String [] args) {
    // nested if atau if bersarang adalah if di dalam if
    Scanner input = new Scanner (System.in);
    
    System.out.println ("input a=");
    int a = input.nextInt();
    System.out.println("input b=");
    int b = input.nextInt();
    
    if (a==5){
        if (b== 10){
        System.out.println("statement ini menunjukkan a=5 dan b=10");
        
        }else { System.out.println ("statement ini menunjukkan a= 5 dan b bukan 10");}
   
    }
    else { System.out.println( "statement ini menunjukkan a dan b salah");
    
}
    
    
    }
}
