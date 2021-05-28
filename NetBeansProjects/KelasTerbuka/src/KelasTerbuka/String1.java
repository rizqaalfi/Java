//in belum selesai sek capek
package KelasTerbuka;
import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        
       java.lang.String kataString = "Hallo";
       char [] kataChar = {'h','a','l','l','o'};
        //string merupakan kumpulan dari beberapa char yang komponennya 
        //bisa di ambil sebagai char
        
    printAddress("kataString" , kataString );
    
        //menampilkan
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        
        //akses komponen
        System.out.println("aksed komp String =" + kataString.charAt(3));
        System.out.println("akses komp dari char = " +kataChar[1]);
        
        //merubah komponen
        kataChar[0] = 'c';
        System.out.println(kataChar);
        //komponen dalan string tidak dapat dirubah. why?
        //karena string di java bersifat immutable
        
        //busa merubah secara tidak langsung dengan substring
        //substring bertujuan mengambil komponen antara ..sd ..
        // ex. 1-5 yang diambil hanya 1-4
        kataString = "M" + kataString.substring(1,5) + "t";
        System.out.println(kataString);
        
        //cara kedua membuat objek string
        String kata2 = new String ("hallo Rizqa. Apa kabar?");
        System.out.println(kata2);
        
        //menambah kata
        kata2 += " Masih ingat dengan ku?";
        System.out.println(kata2);
        
        //melihat address pada data string
        
        String str1 = "Hallo";
    printAddress("kataString" , str1 );
    //address ini akan kembali pada address di atasnya karena karena kata 
    //yang di gunakan sama (reusable) karena berada di memory String pool
    
        String str2 = "Mallot";
        printAddress("kataString" , str2 );
        printAddress("kataString" , kataString );
    // membuat string dengan method baru, maka akan di letakkan di memory lain,
    //bukan di string pool
       
        
    }
    
    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama +" = " + data + "\t ||addres= " + Integer.toHexString(address));
    
    }
}
