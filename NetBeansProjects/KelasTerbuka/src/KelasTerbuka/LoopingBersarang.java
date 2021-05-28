/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * segitiga dan kotak
 */
public class LoopingBersarang {
    public static void main (String [] args ){
        System.out.println("program pertama");
        
        for (int i = 0; i<10 ; i++){
            System.out.print("looping ke-" + i);
            for (int j = 0; j<10; j++){
                System.out.print("* ");
            
            }
            System.out.print("\n");
        }
        System.out.println(" ");
        
        System.out.println("program kedua");
        
    for (int i = 0; i<10 ; i++){
            
            for (int j = 0; j<10; j++){
                System.out.print("* ");
            
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        System.out.println("program ketiga");
        
    for (int i = 0; i<10 ; i++){
            
            for (int j = 0; j<10; j++){
                System.out.print("* ");
                if (i==j){
                    break;
                }
            
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        System.out.println("program keempat");
        
        for (int i = 0; i<10 ; i++){
            
            for (int j = 0; j<10; j++){
                System.out.print("* ");
                if (i+j==9){
                    break;
                }
            
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        
        System.out.println("program kelima");
         for (int i = 0; i<11 ; i++){
            
            for (int j = 0; j<11; j++){
                System.out.print("* ");
                if (i==j){
                    break;
                }else if (i+j==10){
                    break;
            }
            
            }
            System.out.print("\n");
            
            
        }
        // gagal buat wajik, coba lagi ya guys
         System.out.print("\n");
        
         
         System.out.println("program keenam belah ketupat");
         for (int i = 1; i<=4 ; i++){
            
            for (int j =4 ; j>=i; j--){
                System.out.print(" ");
            }
             for (int k = 1; k <=i; k++) {
                 
                 System.out.print("*"); 
             }
             for (int l = 1; l <=i-1; l++) {
                 System.out.print("*");
             }
            System.out.print("\n");
        }
         for (int i = 1; i <=5; i++) {
             for (int j = 1; j <=i; j++) {
                 System.out.print(" ");
             }
             for (int z = 5; z>=i; z--) {
                 System.out.print("*");
             }
             for (int k = 4; k>=i; k--) {
                 System.out.print("*");
             }
             System.out.println("");
        }
       
        
    }
}
