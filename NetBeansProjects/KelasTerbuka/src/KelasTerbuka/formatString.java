
package KelasTerbuka;

import java.util.Formatter;

/**
 *
 * @author Acer
 */
public class formatString {
    public static void main(String[] args) {
        
        String nama = "Udin";
        int umur = 17;
        
        System.out.printf("nama saya adallah %s dan saya berumur %d tahun", nama, umur);
        
        //convertion : f= floating point , c = character dll
        //structure format : %[argumen_index$][flags][width][.precision]convertion
        
        //[argumen_index$]
        //meminimalisir argumen yang digunakan
        System.out.println("\n [argumen_index$]");
        
        System.out.printf("%1$s, wahai %1$s kemana saja kamu %1$s yang umurnya %2$d", nama, umur);
        
        //[flags]
        //menampilkan tanda plus minus pada hasil dgn meletakkan operator + setelah %
        System.out.println("\n [flags]");
        int int1 = 5;
        int int2= 8;
        int hasil = int1 + int2;
        System.out.printf("%d + %d = %d", int1,int2,hasil);
        System.out.printf("\n%d + %d = %+d", int1,int2,hasil);
        
        //width
        System.out.printf("\n [width]");
        int int3 = 1000;
        System.out.println("Integer");
        System.out.printf("%d\n", int3);
        System.out.printf("%5d\n", int3); //width ( total slot 5)
        System.out.printf("%-5d\n", int3); //rata kiri
        System.out.printf("%+6d\n", int3); //flags akan mengambil slot dalam format
        System.out.printf("%+-6d\n", int3); //flags bisa di gabungkan
        System.out.printf("%10d\n", int3);
        System.out.printf("% 10d\n", int3);
        System.out.printf("%010d\n", int3); //flags= "0", artinya akan di tambah leading 0 di depan
        System.out.printf("%+010d\n", int3);
        System.out.printf("%,10d\n", int3); //flags = "," menandakn delimeter per seribu
        int int4 = 1000000000;
        System.out.printf("%-,15d\n", int4);
        
        System.out.println("\nfloating point");
        float fl1 = 1.453f;
        System.out.printf("%f\n", fl1); //selalu mengambil 6 decimal di belakang koma
        System.out.printf("%+9f\n", fl1);
        
        //[.precision]
        System.out.println("\n [.precision]");
        float fl2 = 15.3546f;
        System.out.printf("%f\n", fl2);
        System.out.printf("%.1f\n", fl2); //mengambil .(angka) di belakang koma
        System.out.printf("%8.2f\n", fl2); //gabungan dengan width
        System.out.printf("%+08.2f\n", fl2); // gabungan dengan width dan flags
        
        // contoh
        String nama2 = "ucup";
        float ipk = 3.834365473f;
        
         //structure format : %[argumen_index$][flags][width][.precision]convertion
        System.out.printf("ipk %1$s berapa?\n %1$s : saya dapet %2$+5.2f \n", nama2,ipk);
        
        //save format ke dalam string
        String info = "nama :" + nama2 + " , ipk :" + ipk;
        System.out.println( " biasa -> " + info);
        
        String info_format = String.format("nama : %s, IPK = %2$+5.2f" ,nama2, ipk);
        System.out.println("String format -> " +info_format);
        
        //save format ke dalam String Builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter (builder_info);
        
        formatBuilder.format("nama : %s, IPK = %2$+5.2f" ,nama2, ipk);
        System.out.println(" String builder -> " +builder_info);
        
        
    }
}
