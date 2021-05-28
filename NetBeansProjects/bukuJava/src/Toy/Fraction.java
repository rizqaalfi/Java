/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 274
 * Latian OPP Java 
 * bilangan rasional bentuk pecahan 
 * dengan menyatakan operasi penjumlahan, pengurangan, perkalian, pembagian
 * dengan num(numertor) = pembilang, dan denom (denominato) = penyebut
 */
public class Fraction {
    private int num;
    private int denom;
    
    // ditampilkan dengan bentuk paling sederhana
    public Fraction( int num, int denom){
       int t = Math.gcd(num, denom);
       this.num = num/t;
       this.denom = denom/t;
    }
    
    //komputasi
    public Fraction add( Fraction x){
        int tNum = ( num* x.denom) + ( x.num * denom );
        int tDenom = ( denom * x.denom);
        
        return ( new Fraction ( tNum, tDenom));
    }
    
    public Fraction minus ( Fraction x){
        int tNum = (num * x.denom) - ( x.num* denom);
        int tDenom = ( x.denom * denom);
        
        return ( new Fraction ( tNum, tDenom));
    }
    
    public Fraction kali ( Fraction x){
        int tNum = num * x.num;
        int tDenom = denom * x.denom;
        
        return ( new Fraction (tNum, tDenom));
    }
    
    public Fraction bagi ( Fraction x){
        int tNum = num* x.denom;
        int tDenom = denom * x.num;
        
        return ( new Fraction (tNum, tDenom));
    }
    
    public String toString(){
        return num + "/" + denom;
    }
    
    static void test(){
        Fraction a = new Fraction(2, 3);
        Fraction b = new Fraction(2,5);
        
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.println("Penjumlahannya " + a.add(b));
        System.out.println("Pengurangannya "  + a.minus(b));
        System.out.println("Perkaliannya "  + a.kali(b));
        System.out.println("Pembagiannya "  + a.bagi(b));
    }
    
    public static void main(String[] args) {
        test();
    }
}
