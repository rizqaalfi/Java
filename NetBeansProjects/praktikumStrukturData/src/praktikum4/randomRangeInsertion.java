/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class randomRangeInsertion {
    public static void main(String[] args) {
        String ukuran = JOptionPane.showInputDialog(null, "Ukuran Array");
       
        //pesan tempat untuk array ukuran n (tipe integer)
        int n = Integer.parseInt(ukuran);
           
        System.out.print("sebelum dirutkan = ");
	int a[]= new int[n];
        for (int i = 0; i <n; i++) {
            a[i]= getRandomNumberInRange(1, 1000);
            System.out.print(a[i] + " ");
            
        }
        System.out.print("\ndata setelah di urutkan = ");
        InsertionSort.urut(a);
        Tampil.printArray(a);

	}
	private static int getRandomNumberInRange(int min, int max) {
            if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}

}
