/*
 * 24 feb 2020
 * mengurutkan data Array menggunakan paket sort, ini adalah cara praktis
 */
package praktikum1;

import java.util.Arrays;

public class SortArray_common {
    
    //mengurutkan data Arrays
    
    public static void main(String[] args) {
       int num[] = {23,55,45,67,54}; 
       int l = num.length;
      
       
        System.out.print("Given number : \n");
        for (int k = 0; k < l; k++) {
            System.out.println(" " + num[k]);
        }
        
        System.out.println("\n");
        System.out.print("Accending number : \n");
        
        Arrays.sort(num);
        for (int k = 0; k < l; k++) {
            System.out.println(" " + num[k]);  
        }
       
    }
}
