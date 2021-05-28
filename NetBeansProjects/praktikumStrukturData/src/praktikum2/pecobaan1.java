/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
import java.util.Scanner;
/**
 * Faktorial
 * 2 maret 2020
 */
public class pecobaan1 {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.print("s =");
        int n = input.nextInt();
        System.out.println("Hasil =" + Faktorial(n));
        
    }
    
    public static int Faktorial(int x){
        if (x==1){
        return x;}
        else {
            return x*Faktorial(x-1);
        }
        
    }
}
