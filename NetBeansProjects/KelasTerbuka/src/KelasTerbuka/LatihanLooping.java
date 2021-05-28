
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class LatihanLooping {
    public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
     
    int N_awal, N_akhir;
            int total = 0;
   
    System.out.print("nilai awal=");
    N_awal= input.nextInt();
    System.out.print ("nilai akhir=");
    N_akhir = input.nextInt();
    
    while (N_awal <= N_akhir){
    total = total + N_awal;
        System.out.println ("jika di tambah" +N_awal + "menjadi" + total);
    N_awal++;
    
    }
    
    
    }
}
