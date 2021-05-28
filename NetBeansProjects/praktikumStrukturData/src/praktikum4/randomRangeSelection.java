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
public class randomRangeSelection {
    public static void main(String[] args) {
        String ukuran = JOptionPane.showInputDialog(null, "Ukuran Array");
       
        //pesan tempat untuk array ukuran n (tipe integer)
        int n = Integer.parseInt(ukuran);
           
        System.out.print("sebelum dirutkan = ");
	int x[]= new int[n];
        for (int i = 0; i <n; i++) {
            x[i]= getRandomNumberInRange(1, 1000);
            System.out.print(x[i] + " ");
            
        }
        System.out.print("\n data setelah di urutkan = ");
        SelectionSort.urut(x);
        Tampil.printArray(x);

	}
	private static int getRandomNumberInRange(int min, int max) {
            if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}

}
