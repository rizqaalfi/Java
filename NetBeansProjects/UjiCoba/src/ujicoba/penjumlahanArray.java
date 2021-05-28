/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UjiCoba;
 import java.util.Arrays;
/**
 *
 * silahkan di ccuba lagi ywa...
 * cmungutt
 * tanggal 21 januari berhasih di terpecahkan
 * Alhamdulillah...
 */
public class penjumlahanArray {
    public static void main(String[] args) {
       
        int A1 [][] = {
          {1,2,4,4},
          {3,45,6,3},
          {2,3,4,5}
        };
        int A2 [][] = {
          {1,2,5,6},
          {3,9,6,3},
          {2,3,1,5}
        };
        
        System.out.println("hasil manual");
       int [][]hasiljumlah = Jumlah(A1,A2);
        PrintArray(hasiljumlah);
        
        System.out.println("hasil deepToString");
        Jumlah2(A1,A2);
        
      
        
            
    }
    private static int [][] Jumlah (int [][] A1,int [][] A2){
        int baris = A1.length;
        int kolom = A1[0].length;
        
        int [][] jumlah = new int [baris][kolom];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                jumlah [i][j] = A1 [i][j] + A2 [i][j];
            }
           
        }
        
         
        return jumlah;
    }
    private static void PrintArray (int [][] DataArray){
     int baris = DataArray.length;
     int kolom = DataArray[0].length;
    
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(DataArray[i][j]);
                
                if (j <= baris-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println(""); 
        }
        
    }
    private static void Jumlah2 (int [][] A1,int [][] A2) {
        int baris = A1.length;
        int kolom = A1[0].length;
        
        int [][] jumlah = new int [baris][kolom];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                jumlah [i][j] = A1 [i][j] + A2 [i][j];
            }
           
        }
        
        System.out.println(Arrays.deepToString(jumlah));
}
    
}
