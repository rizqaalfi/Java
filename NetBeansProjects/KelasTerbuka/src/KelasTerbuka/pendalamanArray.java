
package KelasTerbuka;
  import java.util.Arrays;

public class pendalamanArray {
    public static void main (String [] args){
    
        int[] arrayAng1 = {1,2,3,4,5};
        int[] arrayAng2 = new int [4];
        
        //Location
        System.out.println(arrayAng1);
        System.out.println(arrayAng2);
        
        System.out.println("");
        
        //nilai Array
        System.out.println(Arrays.toString(arrayAng1));
        System.out.println(Arrays.toString(arrayAng2));
        
        System.out.println("");

        //nilai Array setelah pindah lokasi
        arrayAng2 = arrayAng1;
        System.out.println(Arrays.toString(arrayAng1));
        System.out.println(Arrays.toString(arrayAng2));
        
        System.out.println("");

        
        //setelah pemindahan lokasi maka aan tertuju pada satu lokasi
        arrayAng1[0]= 192;
        System.out.println(Arrays.toString(arrayAng1));
        System.out.println(Arrays.toString(arrayAng2));
        
        System.out.println("");

        
        //mengambil fungsi
        ubahArray(arrayAng1);
        System.out.println(Arrays.toString(arrayAng1));
        System.out.println(Arrays.toString(arrayAng2));
        

    }
    //method yang argumentnya adalh reference bukan value
    //pass by Reference
    private static void ubahArray(int[] dataArray){
    
        dataArray[1]= 645;
        System.out.println("ini adalah data dalam for");
        for (int data: dataArray){
            
            System.out.println( data);
        }
        
        System.out.println("");

    }
}
