/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum13.pkg14;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Nomer2 {
    public static void main (String [] args){
    
        Scanner input = new Scanner (System.in);
        
        int A,B,C,D,E ;
        
        
        
        System.out.print("input A =");
        A= input.nextInt();
        System.out.print("input B =");
        B= input.nextInt();
        System.out.print("input C =");
        C= input.nextInt();
        System.out.print("input D =");
        D= input.nextInt();
        System.out.print("input E =");
        E = input.nextInt();
    
     if (A>B && A>C && A>D && A>E){
     System.out.println ("A adalah bilangan terbesar");}   
     else if (B>A && B>C && B>D && B>E){
     System.out.println ("B adalah bilangan terbesar");}
     else if (C>B && C>A && C>D && C>E){
     System.out.println ("C adalah bilangan terbesar");}
     else if (D>B && D>C && D>A && D>E){
     System.out.println ("D adalah bilangan terbesar");}
     else if (E>B && E>C && E>D && E>A){
     System.out.println ("E adalah bilangan terbesar");}
        
        }
    }

