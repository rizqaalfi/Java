/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class methodException {
    public static void main(String[] args) {
        
        int[]data = {0,1,2,3};
        Scanner input = new Scanner(System.in);
        System.out.print("data ke-");
        int index = input.nextInt();
        
        System.out.println("Exception biasa");
        try{
            System.out.printf ("data dari array ke-%d adalah %d\n\n", index, data[index]);
        }catch( ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        
        System.out.println("\nException dalam fungsi");
        int data1 = ambilData(data, index);
        System.out.printf ("data dari array ke-%d adalah %d\n\n", index, data1);
        
        System.out.println("\nException Throws by Method");
        int data2 =0;
        try{
            data2 = ambilData2(data, index);
        }catch( ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        
         System.out.printf ("data dari array ke-%d adalah %d\n\n", index, data2);
        
        System.out.println("Akhir program");
    }
    private static int ambilData2 (int [] array, int nmr) throws ArrayIndexOutOfBoundsException{
        int hasil = array[nmr];
        return hasil;
    }
    private static int ambilData(int[]array, int nmr){
        int hasil = 0;
        try{
           hasil = array[nmr];
        }catch( ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        return hasil;
    }
 
}
