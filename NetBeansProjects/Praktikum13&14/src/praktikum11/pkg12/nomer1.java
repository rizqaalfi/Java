/*
 * 2 december 2019
 */
package praktikum11.pkg12;
     import java.util.Scanner;
/**
 *
 * Rizqa Alfiani
 */
public class nomer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Harga termurah Sabun Cuci CapKODOK\n");
        System.out.print("harga toko a =");
        int a = input.nextInt();
        System.out.print("harga toko b =");
        int b = input.nextInt();
        
        if (a<=b){
            System.out.println("Harga sabun di toko a termurah");
        }
        else {
            System.out.println("harga sabun di toko b termurah");
        }
        
    }
}
