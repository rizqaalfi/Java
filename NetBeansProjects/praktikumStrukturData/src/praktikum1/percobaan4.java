/*
 * 24 feb 2020
 */
package praktikum1;

import java.util.Arrays;

public class percobaan4 {
    
    //mengetahui apakah 2 array sama atau tidak
    public static void main(String[] args) {
       int [] ar1 ={1,2,3,4,5,6}; 
       int [] ar2= {1,2,3,4,5,6};
       int [] ar3= {1,2,3,4};
       
        System.out.println("Is array 1 equal to array 2?" + Arrays.equals (ar1,ar2));
        System.out.println("Is array 2 equal to array 3?" + Arrays.equals (ar1,ar3));
       
    }
}
