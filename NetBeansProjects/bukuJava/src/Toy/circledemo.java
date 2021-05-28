/*
 *2 desember 2019
 */
package Toy;

/*
* @author Rizqa Alfiani
* Page 43
* Penggunaan konstanta dengan final
*/

public class circledemo {
    public static final double PHI = 3.14;
    //final digunakan agar angkanya tidak berubah sampai bawah
   
    public static void main(String[] args) {
        test();
    }
    
    static void test(){
        double radius = 100;
        System.out.println("kelling lingkaran adalah " + calckeliling(radius));
        System.out.println("luas lingkaran adalah " + calcluas(radius));
        
    }
    
    static double calckeliling(double r){
        return (2*PHI*r);
    }  
    
    static double calcluas (double r){
        return (PHI*r*r);
    }
}

    
