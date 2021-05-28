
package KelasTerbuka;

import java.util.Arrays;

public class latihanArray {
    public static void main(String[] args) {
        
        // mengurutkan array dengan looping biasa
        int max = 0;
        int [] array = { 3,4,5,2,8,34,56};
        
        for (int i = 0; i < array.length; i++) {
            if (array [i]> max) {
            max = array[i];
            }
            else {
            max = max;}
            
            System.out.print(max + " ");
        }
        System.out.println("\n");
        
        
        
        int [] arrayAng1 = {1,4,5,6,6,3,2,5,6,3,5,6};
        int [] arrayAng2 = {2,3,3,5,3,3,5,4,7,3,3,4};
        
        //menjumlahkan 2 buah array
        //bisa juga menggunakan operator lain
        
        int [] arrayHasil = jumlahArray (arrayAng1,arrayAng2);
        printArray (arrayHasil, "hasil");
        
        //menggabungkan 2 buah array
        int [] arrayHasil2 = new int [arrayAng1.length + arrayAng2.length];
        
        for (int i = 0; i < arrayAng1.length; i++) {
            arrayHasil2[i]= arrayAng1 [i];
        }
        for (int i = 0; i < arrayAng2.length; i++) {
            arrayHasil2 [i + arrayAng1.length] = arrayAng2[i];
        }
        printArray (arrayHasil2, "hasil2");
        
        //sorting reverse (mengurutkan tapi terbalik)
        //disorting dulu
        printArray(arrayAng1, "sorted");
        reverse (arrayAng1);
        printArray (arrayAng1, "reverse");
        
        //  reverse 2
        printArray(arrayAng2, "sorted2");
        reverse2 (arrayAng2);
        printArray (arrayAng2, "reverse2");
        
    }
    //menukarkan tempat
    //sama seperi cara menukar gelas kopi dan teh yng membutuhkan ruang ke 3 sbg tempat
    private static void reverse2 (int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;
            for (int i = 0; i < dataArray.length/2; i++) {
                buffer = dataArray[i];
                dataArray [i]= dataArray [(dataArray.length-1)-i];
                dataArray [(dataArray.length-1)-i]=buffer;
        }
    
    }
    private static void reverse (int [] dataArray){
        Arrays.sort(dataArray);
        int [] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
            for (int i = 0; i <dataArray.length; i++) {
                dataArray [i] = arrayBuffer [(arrayBuffer.length-1)-i];
        }
    }
    
    private static void printArray (int [] dataArray, String message){
    
        System.out.println(message + " = " + Arrays.toString(dataArray));
        
    }
    
    private static int [] jumlahArray (int []array1, int[] array2){
    //                        panjangnya sama dengan arrayAng1
        int [] arrayHasil = new int [array1.length];
        for (int i = 0; i < array1.length ; i++) {
           arrayHasil[i] = array1 [i] + array2 [i];
           
        }
        return arrayHasil;
    
    }
    
    
}
