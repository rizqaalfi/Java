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
public class nomer2_2 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
    int n,data, N_maks;
    N_maks = 0;
    
        System.out.print("input n :");
        n = input.nextInt();
        
        
        for (int i =1; i<=n ; i++){
            System.out.printf ("data ke-%d :", i);
            data = input.nextInt();
            
            
            N_maks = (N_maks<data) ? data : N_maks;
          
        }
    
        System.out.println("nilai maks =" + N_maks);
    }
}
