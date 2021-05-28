/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class IfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i ;
      
      Scanner input = new Scanner (System.in);
      System.out.print ("i =");
      i = input.nextInt();
             
      if (i<=15)
          System.out.println("yes that number is less than 15");
       else
          System.out.println ("i is grater than 15");
    }
    
}
