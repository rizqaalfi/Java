/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class RandomSelection {
     public static void random (){
        String ukuran = JOptionPane.showInputDialog(null, "Ukuran Array");
       
        //pesan tempat untuk array ukuran n (tipe integer)
        int n = Integer.parseInt(ukuran);
       
        //input array ukuran n - random integer
        int a[]=new int[n];
        for (int i=0; i<=n-1; i++ ){
            a[i]=(int) (Math.random()*10);
        }
        
        //display data array
        System.out.print("Data Sebelum diurutkan = ");
        
        for (int i=0;i<=n-1; i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.print("\nData setelah di urutkan=");
        SelectionSort.urut(a);
        Tampil.printArray(a);
    }
    
    public static void main(String[] args) {
        random();
    }
}
