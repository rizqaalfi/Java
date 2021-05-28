/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si2;
/**
 * star symbol (*) to include all opsion
 * yellow lamp as a warning for large memory
 */
public class SI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n = 100000;
        menghitungSin(n);
        System.out.println(menghitungSin(n));
    
    
        
                
    }
    public static double menghitungSin(double n){
        
        double hitungSatu = 25/ (Math.pow(n, 2)-(4*n)+ 6);
        double hitungDua = n/3;
        double HasilAkhir = hitungSatu-hitungDua;
        return Math.sin(HasilAkhir);
    }
    
}
