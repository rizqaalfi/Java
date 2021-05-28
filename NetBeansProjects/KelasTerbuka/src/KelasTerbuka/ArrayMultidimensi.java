
package KelasTerbuka;
    import java.util.Arrays;

public class ArrayMultidimensi {
    public static void main(String[] args) {
        
        //membuat Array 2 Dimensi dengan assignment
        
        int [][] array2D = {
                            {2,3}, 
                            {4,5}
                            };
        //tidak bisa langsung di tampilkan (hanya menampilkan lokasi)
        System.out.println(array2D);
        //harus menggunakan Arrays.deepToString(....)
        System.out.println(Arrays.deepToString(array2D));
        
        
        //membuat Array 2 Dimensi dengan deklarasi
        //int [baris][kolom]
        
        int [][] arrayAng = new int[5][4];
        
        System.out.println("cara biasa");
        printArray1 (arrayAng);
        
        //menggunakan looping manual
        System.out.println("looping manual");
        printArray2 (arrayAng);
        
        //looping dengan for each
        System.out.println("looping for each");
        printArray3 (arrayAng);
        
        //array manual pembuktian
      
        int [][] array4 = {
            {2,3,4,54,6,3},
            {23,4,5,2,4,35},
            {3,445,2,5,5,3}
           };
        
        System.out.println("looping biasa");
        printArray1 (array4);
        System.out.println("looping manual");
        printArray2 (array4);
        System.out.println("looping for each");
        printArray3 (array4);
        
        //di java memperbolehkan kolomya berbeda jumlahnya
        int [][] arrayRagged = {
            {2,3,4,54},
            {23,35},
            {3,2,5,5,3}
           };
        
        System.out.println("looping biasa");
        printArray1 (arrayRagged);
        System.out.println("looping manual");
        printArray2 (arrayRagged);
        System.out.println("looping for each");
        printArray3 (arrayRagged);
    }
        
    
    
    private static void printArray1 (int [][] dataArray ){
    for (int i = 0; i <dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
    
    private static void printArray2 (int [][] dataArray){
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray[i].length; j++) {
                System.out.print(dataArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    private static void printArray3 (int [][] dataArray){
        for (int [] baris : dataArray){
            for (int angka : baris){
                System.out.print(angka + " ");
            }
            System.out.println("");
        }
    }
    
    
}
