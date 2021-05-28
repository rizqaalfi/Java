/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;
    import java.util.Arrays;
/**
 *
 * @author Acer
 */
public class ArrayMultiDimensi {
    public static void main(String[] args) {
        
        int Arr2D [][] = new int [4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            //baris
            for (int j = 0; j < 5; j++) {
                //kolom
                Arr2D [i][j] = k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Arr2D[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
