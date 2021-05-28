/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanlab;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class deretAngka3 {
    public static void main (String [] args) {
        
        System.out.println("program pertama ");
     int a = 1;
        for (int i =0; i<5; i++){
            for (int j =0; j<5; j++){
                
                System.out.print(a + " ");
                
                
                if (i==j){
                break;}
            }
            a++;
            System.out.print("\n");
        
        }
       
        System.out.println("program kedua");
        
        int b=1;
        for (int i =0; i<5; i++){
            
                for (int J =0; J<5; J++){
                System.out.print(b + " ");
                b++;
                     if (i== J){
                     break;
                     }   
                } 
              
            b= 1;
         System.out.println(" ");
        }
        
        System.out.println("program ketiga");
        
        int f=1;
        for (int i =0; i<5; i++){
            
                for (int J =0; J<5; J++){
                System.out.print(b + " ");
                b++;
                     if (i+ J == 4){
                     break;
                     }   
                } 
             
                
            b= 1;
         System.out.println(" ");
        }
        
        System.out.println("program keempat");
        
        int c=1;
        int p=0;
        for (int i =1; i<=5; i++){
            
                for (int J =0; J<=5; J++){
                System.out.print(c + " ");
                c++;
                      
                  
            }    
            p++;
            c = 1+ p;
           
         System.out.println(" ");
        }
        
        //masih gagal
        // coba lagi ya rizqa
        //alhamdulillah.. tgl 22 des
        System.out.println("program kelima");
        
        int m,h , perkalian;
        Scanner input = new Scanner (System.in);
        System.out.print("tabel perkalian : ");
        perkalian = input.nextInt();
        
        System.out.print("1 ");
        for (int x = 2; x <= perkalian ; x++) {
            System.out.print(x +" ");
            
        }
        System.out.println("");
        for (int x = 2; x <= perkalian; x++) {
            System.out.print(x +" "); 
            
            for (int y = 2; y <= perkalian ; y++) {
                System.out.print(y*x +" "); 
                
            }
            System.out.println("");
        }
        
        System.out.println("program keenam");
        
        int r,t , penjumlahan;
        
        System.out.print("tabel penjumlahan : ");
        penjumlahan = input.nextInt();
        
        System.out.print("2 ");
        for (int x = 3; x <= penjumlahan ; x++) {
            System.out.print(x +" ");
            
        }
        System.out.println("");
        for (int x = 3; x <= penjumlahan; x++) {
            System.out.print(x +" "); 
            
            for (int y = 3; y <= penjumlahan ; y++) {
                System.out.print((y+x) +" "); 
                
            }
            System.out.println("");
        }
        
        System.out.println("program penjumlahan 2");
        
        int M=2;
        int H=2;
       
        for (int i =1; i<=5; i++){
        
                for (int J =0; J<=5; J++){
                System.out.print(M + " ");
                M= M+1;
                        
                  
            }    
            M = 1+ H;
            H++;
         System.out.println(" ");
         
         
        }
    }
}
