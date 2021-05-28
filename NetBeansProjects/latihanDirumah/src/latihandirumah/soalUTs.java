/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandirumah;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class soalUTs {
    public static void main (String [] args){
     Scanner input = new Scanner (System.in);
     int x;
     
     System.out.print ("a->");
    int a = input.nextInt();
    System.out.print ("b->");
    int b = input.nextInt();
    
    if (a>5){
     x= a*b;
     System.out.printf("hasil perkalian %d*%d = %d",a,b,x);
    } else {
        System.out.println ("tidak ada proses");
            }
    
    
    }
}
