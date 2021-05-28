
package KelasTerbuka;
    import java.lang.StringBuilder;
/**
 * memudahkan pengembangan string
 */
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hallo");
        printdata(builder);
        
        //append (menambahkan)
        builder.append(" semuanya");
        printdata (builder);
        
        builder.append(" warga surabaya");
        printdata (builder);
        
        //insert
        builder.insert(20," kota");
        printdata (builder);
        
        //delete
        builder.delete(20,25);
        printdata(builder);
        
        //merbah character
        builder.setCharAt(15, 'W');
        printdata (builder);
        
        //replace
        builder.replace(21, 29, "Bandung");
        printdata(builder);
        
        //casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address =" + Integer.toHexString(addressString));
        //setelah memjad string baru bisa melakukan operasi string
        
    }
    private static void printdata (StringBuilder data){
    System.out.println("data =" + data);
        System.out.println("panjang =" + data.length());
        System.out.println("capasity =" + data.capacity());
        //capasity otomatis di tambah 16 dari huruf yang di inputkan
        
        int addressBuilder = System.identityHashCode(data);
        System.out.println("address = " + Integer.toHexString(addressBuilder) + "\n");
        
    }
}
