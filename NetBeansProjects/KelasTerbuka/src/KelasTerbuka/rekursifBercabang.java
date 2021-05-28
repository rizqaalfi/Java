/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasTerbuka;
    import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class rekursifBercabang {
    public static void main (String[] args){
        //nilai fibonacci dihitung dari 0, 1,2, 3,4 dst
        //dengan niali fibonacci 0, 1,1,2,3,5,8 dst.
        //ex. nilai ke 4 dari fibonacci adalah 3
        
        //rekursif bercabang tidak efektif di gunakan untuk nilai-nalai yang besar
        //karena akan membutuhkan waktu lama dalam pengembaliannya.
        //spt yang di lakukan pada fibonacci yang prinsipnya dasar perhitungannya menggunakan 
        //2^n untuk setiap percabangannya, yang dimulai dari ^0
        
        
        Scanner input = new Scanner (System.in);
        System.out.print("input nilai -");
        int nilai= input.nextInt();
        int Nilai_fibo = fibonacci (nilai,"atas");
        System.out.println("nilai fibonacci ke- "+ nilai + " adalah " + Nilai_fibo);
    
    }
    private static int fibonacci(int n, String daun){
    
        System.out.print("daun-" + daun + "\t");
        System.out.println("fibo ke-" + n);
        if (n==1 ||n ==0){
        return n;
        }
        
        else {
        return fibonacci (n-1,"kiri") + fibonacci (n-2, "kanan");
                }
    }
}
