/*
 * 3 desember 2019
 */
package praktikum3des;
    import java.util.Scanner;
/**
 * Nama : Rizqa Alfiani
 * NIM : E31191919
 */
public class Praktikum3des {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int maks = 0;
        int jumlah = 0;
        int rata;
        int angkaTengah= 0;
       
        
        System.out.println(" ini adalah 10 angka yang di input");
        for (int i = 0; i < 10; i++) {
        System.out.print("input nilai = " );
        int nilai = input.nextInt();
            
        if ( nilai > maks){
            maks = nilai;
        }
        else { maks = maks; }
        
        jumlah = jumlah + nilai;
        
        if (i==4 || i==5){
        angkaTengah = nilai;
          
        }
        
        
        }
        rata = jumlah/10;
        
        System.out.println("nilai maksimun adalah "+ maks);
        System.out.println("rata-rata nilai tersebut adalah " + rata);
        System.out.println("nilai tengahnya adalah " + angkaTengah);
           
           
        
            
        
        
        
        
    }
    
    
}
