
package ujicoba;
    import java.util.Arrays;
/**
 * masih gagal.. coba lagi
 * semangat uhuuu
 * 
 */
public class perkalianArray {
    public static void main(String[] args) {
       int A1 [][] = {
           {1,2},
           {3,4}
       }; 
        int A2 [][] = {
           {1,2},
           {2,3}
       }; 
        
        int kali [][]= new int [2][2];
    
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                kali [i][j]=(( A1[i][j]*A2[i][j]) + ( A1[i][j]*A2[i][j+1]));
            }
           
        }
        System.out.println(Arrays.deepToString(kali));
    }
    
}
