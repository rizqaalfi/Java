/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizqa Alfiani
 */
public class operatorBitwise {
    public static void main ( String [] args){
     //operator bitwise --> melakukan operasi pada nilai bit
     //8 bit = 1 byte
     // jika 0 maka tidak di hitung
     
     byte a= 0;
     String a_bits;
     
     
     // a_bits = String.format : membuat string dengan format tertentu dengan kelas helpernya string
    
     a_bits = String.format ("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
     System.out.printf ("%s = %d \n", a_bits,a); 
   /*sebenarnya tujuannya sama dengan printf, bedanya printf diprintkan di consol
     *sedangkan String.format di save di a-bits nya
     * replace (' ', '0') digunakan untuk mengganti sring yang kosong menjadi 0 
     */
     
   
    System.out.println ("---->SiftLeft (<<)"); 
    //siftleft artinya menggeser ke kiri sebanyak bilangan yang disebuatkan
    byte x=3 ;
    byte b;
    // byte b menunjukkan hasilnya;        
    String x_bits, b_bits;
    
   
    x_bits = String.format ("%8s", Integer.toBinaryString(x)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", x_bits,x); 
    
     b = (byte)( x<<3 ); 
    //nilai b harus di casting ke dalam bentuk byte
    b_bits = String.format ("%8s", Integer.toBinaryString(b)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", b_bits,b); 
    
    
    System.out.println ("---->SiftRight (>>)");
    byte y = 4;
    byte c;      
    String c_bits, y_bits;
    
    y_bits = String.format ("%8s", Integer.toBinaryString(y)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", y_bits,y);
    
    c = (byte)( y>>2 );
    c_bits = String.format ("%8s", Integer.toBinaryString(c)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", c_bits,c); 
    
    
     System.out.println ("---->Bitwise OR, AND dan XOR ");
     // untuk bitwise tandanya hanya | beda dengan logika
    byte q = 24 ;
    byte d,e,f, g ;      
    String q_bits, d_bits, e_bits, f_bits, g_bits;
    
    q_bits = String.format ("%8s", Integer.toBinaryString(q)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", q_bits,q);
    
    d = 12;
    d_bits = String.format ("%8s", Integer.toBinaryString(d)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", d_bits,d); 
    
    //operator OR pada bitwise
    e = (byte)(q|d);
    e_bits = String.format ("%8s", Integer.toBinaryString(e)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", e_bits,e); 
    
    //operator AND pada bitwise
    f = (byte)(q&d);
    f_bits = String.format ("%8s", Integer.toBinaryString(f)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", f_bits,f); 
    
    //operator XOR pada bitwise
    g = (byte)(q^d);
    g_bits = String.format ("%8s", Integer.toBinaryString(g)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", g_bits,g); 
    
    //operator NOT/negasi
    
    System.out.println ("inilah operator negasi");
    byte a1 = 24;
    byte b1 ;
    String a1_bits, b1_bits;
    b1 = (byte)(~a1);
    a1_bits = String.format ("%8s", Integer.toBinaryString(a1)).replace( ' ', '0');
    System.out.printf ("%s = %d \n", a1_bits,a1); 
    b1_bits = String.format ("%8s", Integer.toBinaryString(b1).substring(24));
                        //menggunakan substring untuk menganbil angka yang dibelakan saja
    System.out.printf ("%s = %d \n", b1_bits,b1); 
    }
    
    
}
