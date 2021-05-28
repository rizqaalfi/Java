/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy.KelasObjek;

/**
 *
 * @author Rizqa Alfiani
 * latihan OOP 
 * implementasi interface cloneable -> clone()
 */
public class complexProtected {
   private double re;
   private double im;
   
   public complexProtected( ){
       this.re = 0.0;
       this.im= 0.0;
   }
   
   public complexProtected( double re, double im){
       this.re = 0.0;
       this.im= 0.0;
   }
   
   public void setRe ( double re){
       this.re=re;
   }
   
   public void setIm ( double im){
       this.im= im;
   }
   
   public double getRe(){
       return re;
   }
   
   public double getIm(){
       return im;
   }
   
   public complexProtected cloneComplex(){
       
       try {
           return  (complexProtected) super.clone();
       }
       catch ( CloneNotSupportedException e){
           System.out.println(e.getMessage());
       }
       
       return this;
   }
   
   static void test (){
       complexProtected x = new complexProtected();
       complexProtected x2;
       
       x.setRe(10.0);
       x.setIm(50.0);
       
       //cloning terhadap x
       x2 = x.cloneComplex();
       
       System.out.println("x : " + x.getRe() + " dan " + x.getIm());
       System.out.println("x2 : " + x2.getRe() + " dan " + x2.getIm());
       
   }
   
    public static void main(String[] args) {
        test();
    }
}
