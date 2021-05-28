/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class AnalisisSelectionSortSlide {
    public static void main(String[] args) {
        int angka[]= {27,80,8,46,16,12,50,4,6,2};
        int min,temp,index;
        
        for (int i = 0; i <angka.length; i++) {
            min = angka[i];
            index=i;
            for (int j = i+1; j < angka.length; j++) {
                if (angka[j]<min) {
                    min=angka[j];
                    index=j;
                }
            }
            temp=angka[i];
            angka[i]=angka[index];
            angka[index]=temp;
        }
        
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
}
