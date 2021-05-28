/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy.KelasObjek;

/**
 *
 * @author Rizqa Alfiani
 * page 303
 */
public class complex {
    private double re;
    private double im;
    
    public complex(){
        re = 0.0;
        im = 0.0;
    }
    
    public complex(double re, double im){
        this.im = im;
        this.re = re;
    }
    
    public complex( complex thec){
        re = thec.re;
        im= thec.im;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        complex x =  new complex();
        x.re = re;
        x.im = im;
        return x;
    }
    
    public String toString (){
        Double reDouble = new Double(re);
        Double imDouble = new Double(im);
        
        return (reDouble.toString() + imDouble.toString());
    }
    
    
    //Accessing Opration
    public void setRe( double newRe){
        re = newRe;
    }
    
    public void setIm ( double newIm){
        im = newIm;
    }
    
    public double getRe(){
        return re;
    }
    
    public double getIm(){
        return im;
    }
    
    //computing opration
    public void add( complex theComp){
        re = re+theComp.re;
        im = im + theComp.im;
    }
    
    public void sub( complex theComp){
        re = re - theComp.re;
        im = im - theComp.im;
    }
    
    static void test() {
        System.out.println("Aplikasi Aritmatika bilangan Komplex");
        complex t1 = new complex(2.0,3.0);
        complex t2 = new complex(1.0,1.0);
        
        System.out.println("Bilangan t1 : " + t1.toString());
        System.out.println("Bilangan t2 : " + t2.toString());
        
        System.out.println("Penjumlan bilangan t1 + t2");
        try{
            complex x = (complex) t1.clone();
            x.add(t2);
            
            System.out.println(x.toString());
        }
        catch ( Exception E){
            System.out.println(E.getMessage());
        }
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
