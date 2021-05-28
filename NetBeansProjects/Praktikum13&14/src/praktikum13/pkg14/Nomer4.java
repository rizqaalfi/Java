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
public class Nomer4 {
    public static void main (String [] args){
    Scanner input= new Scanner(System.in);
    
    int nilai;
    
    System.out.print("input nilai : ");
    nilai = input.nextInt();
    
    if (nilai<=40){
    System.out.println ("E");}
   if (nilai >40){
        if (nilai <55){
        System.out.println ("D");
       
        }}
    if (nilai >55){
        if (nilai <60){
        System.out.println ("C");
        
        }}
   if (nilai >60){
        if (nilai <80){
        System.out.println ("B");
        
        }}
   if (nilai >80){
        if (nilai <100){
        System.out.println ("A");
        
        }}
    
    
    
        }
}
