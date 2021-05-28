/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4nov2;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Praktikum4nov2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int val;
        
        System.out.print("Enter int =");
        val = input.nextInt();
        System.out.print("i read the following value :");
        System.out.println (val);
        
       //latihan 8
       
    float valf;
    System.out.print ("enter a single-prescision real :");
    valf = input.nextFloat();
    System.out.print ("i read the following value :");
    System.out.println (valf);
    
    double vald;
    System.out.print ("enter a double precision :");
    vald = input.nextDouble();
    System.out.print ("i read the following value:");
    System.out.print(vald);
    
    
    
    }
    
}
