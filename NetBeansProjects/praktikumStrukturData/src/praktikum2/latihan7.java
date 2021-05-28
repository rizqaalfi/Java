/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
import java.util.Scanner;
/**
 *
 * 6 maret 2020
 */
public class latihan7 {
    private static boolean search(int [] x, int size, int n){
    if (size>0){
        if (x[size-1]==n) {
            return true;
        }
        else {
        return search(x, size-1,n);}
    }
    return false;
    }
    
    public static void main(String[] args) {
        int [] x = {2,46,4,3,6};
        
        Scanner input = new Scanner(System.in);
        System.out.print("data di cari : ");
        int n = input.nextInt();
        
        boolean cari = search(x,x.length,n );
        if (cari== true) {
            System.out.println("angka " + n + " ada dalam data");
        }
        else {
            System.out.println("angka " + n + " tidak ada dalam data");}
    }
}
