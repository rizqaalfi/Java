/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
import java.util.Scanner;
/**
 *
 * 8 maret 2020
 */
public class latihan4 {
   private static void pindah (int disk, char a1,char bantu ,char a2){
       if (disk == 0) {
           return;
       }
       else{
           pindah(disk-1,a1,a2,bantu);
         System.out.println("pindah disk " + disk + " dari pasak " + a1 
                 + " ke pasak " + a2);
      pindah(disk-1,bantu,a1,a2);

   }
}
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Jumlah Disk :");
        int n = masuk.nextInt();
        pindah(n,'A','B','C');
               
    }
}