 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsorting;
/**
 *
 * @author Acer
 */
public class mergeSort {

    
    public static void main(String[] args) {
       
        
        int n[] ={1,4,6,3,63,34,6,45,3,4};
        System.out.print("sebelum diurutkan =");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ",");
        }
        
        inisialisasiMS(n,0,n.length-1);
        System.out.print("setelah diurutkan =");
        for (int i = 0; i <n.length; i++) {
            System.out.println(n[i] + ",");
        }
    }
    
    private static void inisialisasiMS ( int n[], int l , int h ){
        int low = 1;
        int high = h;
        if (low >= high){
            return;
        }
        int middle =(low + high )/2;
        inisialisasiMS(n, low,middle);
        inisialisasiMS(n,middle+1, high );
        int endLow = middle;
        int startHigh = middle+1;
        while ((l<=endLow) && (startHigh<= high)){
            if (n[low] <n[startHigh]){
            low++;
            
            }
            else {
            int temp = n[startHigh];
            for (int k = startHigh-1; k>=low;k--){
                n [k+1]=n[k];
                
            }
            n[low]= temp;
            low++;
            endLow++;
            startHigh++;
            }
        
        }
        

}
}
