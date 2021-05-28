/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement.nestedIf;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class nestedIf {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        
        if (i<=10){
            if (i<5)
                System.out.println("i is smaller than 5");
            if  (i<3)
                System.out.println("i is smaller than 3 too");
            else
                System.out.println("i is grater than 5");
            
            }
        if (i>10){
           System.out.print ("nothing procces");
        
        }
            
        
     
    }
    
}
