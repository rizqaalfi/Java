
package KelasTerbuka;
import java.util.Arrays;

public class pendalamanArrayMultidimensi {
    public static void main(String[] args) {
         int [][] array2d = {
             {2,3,4,5},
             {3,4,5,2}
    };
         //menampikan adress
         //java berorientasi pada objek dimana array yg jadi objeknya tsb
         System.out.println(array2d);
         System.out.println(Arrays.toString(array2d));
         System.out.println(array2d[0]);
         System.out.println(array2d[1]);
         
         //bukti bahwa array yg jadi objek
         
         char [] arraychar1 = {'a', 'b'};
         char [] arraychar2 = {'c', 'f', 'e'};
         
         char [][] arraychar2d = {
                arraychar1,
                arraychar2
         };
         
         System.out.println(arraychar2d);
         System.out.println(Integer.toHexString(System.identityHashCode(arraychar1)));
         System.out.println(Integer.toHexString(System.identityHashCode(arraychar2)));
         System.out.println(Arrays.toString(arraychar2d));
         System.out.println(Arrays.deepToString(arraychar2d));
    }
}
