/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
import java.util.Scanner;
/**
 * menghitung pangkat
 * 2 maret 2020
 */
public class pecobaan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("bilangan x pangkat y");
        System.out.print("input x :");
        int x= input.nextInt();
        System.out.print("input y :");
        int y= input.nextInt();
        System.out.println(x +" pangkat " + y + "=" + pangkat(x,y));
        
    }
    public static int pangkat (int x, int y){
        if (y==0){
        return 1;}
        else {
        return x* pangkat(x,y-1);}
    }
    
}
