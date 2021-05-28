/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
import java.util.Scanner;
/**
 * rekursi bil prima dan bukan prima
 * 2 maret2020
 */
public class percobaan3 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.print("input bilangan :");
        int num = input.nextInt();
        
        if (cekbil(num)){
            System.out.println("bilangan prima");
        }
        else {
            System.out.println("bukan bilangan prima");}
    }
    
    private static int printNilai(int number, int index){
        if (index== 1){
        return 1;}
        else
            if (number% index == 0){
            return 1 + printNilai(number,--index);}
            else {
            return 0 + printNilai(number, --index);}
    }
    
    private static boolean cekbil(int num){
        if (num>1){
        return (printNilai(num,num)==2);}
        else {
        return false;}
    }
}
