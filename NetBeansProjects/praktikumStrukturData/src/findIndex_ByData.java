/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizqa Alfiani
 * ini masih salah pencarian indexnya
 * 16 sep 2020
 */
public class findIndex_ByData {
    public static int data(int[] a , int b ,int c){
            if (c<0) {
               return -1; 
            }
            else if (a[c]==b) {
                return c;
            }else{
            return data(a,b,c-1);
            }
    }
    public static int Cari(int[]a, int b){
    return data (a,b,a.length-1);
    }
    public static void main(String[] args) {
        int[] data={2,5,8,10,14,32,35,41,67,88,90,101,109};
        System.out.println("=== mencari index pada data ===");
        System.out.println("\n data yang dicari = 10");
        
        System.out.print("print data : \n");
        
        for (int i = 0; i < data.length; i++) {
            
            System.out.println(" " + data[i]);
           
        }
        
        for (int i = 0; i < data.length; i++) {
            int nilai= Cari(data,35);
            if (nilai>=0) {
                System.out.println("nilai di temukan pda index ke " + nilai);
                break;
            }
            else{
                System.out.println("tidak ditemukan");}
        }
    }
}

