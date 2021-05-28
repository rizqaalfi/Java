/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

/**
 * 6 maret 2020
 * menghitung pangkat
 */
public class percobaan5 {
    public static int pangkatRekursif(int x, int y){
        if (y==0) {
            return 1;
            }
        else return x*pangkatRekursif(x,y-1);
    }
    public static void main(String[] args) {
        System.out.println("Bilangan x pangkat y :");
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan x:");
        int x= input.nextInt();
        System.out.print("Bilangan y :");
        int y= input.nextInt();
        
        System.out.println(x + " dipangkatkan" + y + "=" + pangkatRekursif(x,y));
    }
}
