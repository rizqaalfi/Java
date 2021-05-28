/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy.KelasObjek;

/**
 * @author Rizqa Alfiani
 * page 309
 */
public class complexDefaulttoString {
    private double re;
    private double im;
    
    public complexDefaulttoString(){
        re = 0.0;
        im = 0.0;
    }
    
    public complexDefaulttoString ( double re, double im){
        this.re = re;
        this.im = im;
    }
    
    static void test(){
        complexDefaulttoString t = new complexDefaulttoString(0.5,-0.5);
        System.out.println(t);
    }
    
    public String toString (){
        double tempIm;
        if (im>=0) return re + " + " + im + "i";
        tempIm = -im;
        return re + " - " + tempIm + "i";
    }
    
    public static void main(String[] args) {
        test();
    }
}
