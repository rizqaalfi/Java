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
public class nomer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        int a;
        int sum = 65;
        System.out.print("masukkan a : ");
        a = input.nextInt();
        
        if (a<sum){
        System.out.println ("Maaf anda harus mencoba lagi");
        }
    }
    
}
