/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy.KelasObjek;

/**
 *
 * @author Rizqa Alfiani
 * page 306
 */
public class complexwithEquals {
    private double re;
    private double im;

    public complexwithEquals( double re, double im) {
        this.re = re;
        this.im= im;
    }
    
    public boolean equals( Object o){
        if (o==null) // Cautions
            return false;
        if (o==this) // Reflective
            return true;
        
        if(!(o instanceof complexwithEquals))
            return false;
            
        complexwithEquals x = (complexwithEquals) o;
        
        //compare field by field
        if((re==x.re) && (im==x.im))
            return true;
        else
            return false;
    }
    
    static void test(){
        complexwithEquals t1 = new complexwithEquals(1.0, 2.0);
        complexwithEquals t2 = new complexwithEquals(1.0, 2.0);
        complexwithEquals t3 = new complexwithEquals(2.0, 1.0);
        
        if(t1.equals(t2))
            System.out.println("t1 sama dengan t2");
        else
            System.out.println("t1 tidak sama dengan t2");
        
        System.out.println("");
        
        if (t1.equals(t3))
            System.out.println("t1 sama dengan t3");
        else
            System.out.println("t1 tidak sama dengan t3");
    
    }
    
    public static void main(String[] args) {
        test();
    }
    
    
    
}
