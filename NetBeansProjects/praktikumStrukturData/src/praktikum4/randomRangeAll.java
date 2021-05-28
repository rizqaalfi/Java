/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

import javax.swing.JOptionPane;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class randomRangeAll {
    private static int getRandomNumberInRange(int min, int max) {
            if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
		}

		return (int)(Math.random() *max )+ min;
	}
    public static void main(String[] args) {
        String ukuran = JOptionPane.showInputDialog(null, "Ukuran Array");
       
        //pesan tempat untuk array ukuran n (tipe integer)
        int n = Integer.parseInt(ukuran);
           
        System.out.println("sebelum dirutkan = ");
	int All[]= new int[n];
        for (int i = 0; i <n; i++) {
            All[i]= getRandomNumberInRange(1, 1000);
            System.out.print(All[i] + " ");
            
        }
        System.out.println("\n\nData setelah di urutkan dg Selection= ");
        SelectionSort.urut(All);
        Tampil.printArray(All);
        
        System.out.println("\nData setelah di urutkan dg Insertion= ");
        InsertionSort.urut(All);
        Tampil.printArray(All);

        System.out.println("\nData setelah di urutkan dg Bubble= ");
        BubbleSort.urut(All);
        Tampil.printArray(All);


	}
	

}
