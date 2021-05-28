/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy.Object;

/**
 *
 * @author Rizqa Alfiani
 * page 292
 * Latihan OOP Java
 * Materi urutan bilangan
 */
public class Sequence {
    
    public Sequence(){
    
    }
    
    static void test01(){
        naturalSequence t = new naturalSequence();
        System.out.println("Aplikasi Barisan Bilangan Asli");
        System.out.println("Item ke :" + t.getTH() + "Nilai item :" + t.item()); t.next();
        System.out.println("Item ke :" + t.getTH() + "Nilai item :" + t.item()); t.next();
        System.out.println("Item ke :" + t.getTH() + "Nilai item :" + t.item()); t.next();
        System.out.println("Item ke :" + t.getTH() + "Nilai item :" + t.item()); t.next();
           
        System.out.println("Nilai Item ke 1 :" + t.itemTH(0));
        System.out.println("Nilai Item ke 2 :" + t.itemTH(1));
        System.out.println("Nilai Item ke 3 :" + t.itemTH(2));
        System.out.println("Nilai Item ke 4 :" + t.itemTH(3));
        System.out.println("Nilai Item ke 5 :" + t.itemTH(4));
        System.out.println("Nilai Item ke 6 :" + t.itemTH(5));
        System.out.println("Nilai Item ke 7 :" + t.itemTH(6));
    }
    static void test02(){
        OddSequence t = new OddSequence();
        System.out.println("Aplikasi Barisan Bilangan ganjil");
        System.out.println("Item ke :" + t.getTH());
        System.out.println("Nilai item :" + t.item());
        System.out.println("Nilai Item ke 1 :" + t.itemTH(0));
        System.out.println("Nilai Item ke 2 :" + t.itemTH(1));
        System.out.println("Nilai Item ke 3 :" + t.itemTH(2));
        System.out.println("Nilai Item ke 4 :" + t.itemTH(3));
        System.out.println("Nilai Item ke 5 :" + t.itemTH(4));
        System.out.println("Nilai Item ke 6 :" + t.itemTH(5));
        System.out.println("Nilai Item ke 7 :" + t.itemTH(6));
    }
    
    static void test03(){
        EvenSquence t = new EvenSquence();
        System.out.println("Aplikasi Barisan Bilangan genap");
        System.out.println("Item ke :" + t.getTH());
        System.out.println("Nilai item :" + t.item());
        System.out.println("Nilai Item ke 1 :" + t.itemTH(0));
        System.out.println("Nilai Item ke 2 :" + t.itemTH(1));
        System.out.println("Nilai Item ke 3 :" + t.itemTH(2));
        System.out.println("Nilai Item ke 4 :" + t.itemTH(3));
        System.out.println("Nilai Item ke 5 :" + t.itemTH(4));
        System.out.println("Nilai Item ke 6 :" + t.itemTH(5));
        System.out.println("Nilai Item ke 7 :" + t.itemTH(6));
    }
    
    static void test04(){
        FibbonacciSequence t = new FibbonacciSequence();
        System.out.println("Aplikasi Barisan Bilangan Fibbonacci");
        System.out.println("Item ke :" + t.getTH());
        System.out.println("Nilai item :" + t.item());
        
        System.out.println("cara pertama");
        System.out.println("Nilai Item ke 1 :" + t.item()); t.next();
        System.out.println("Nilai Item ke 2 :" + t.item()); t.next();
        System.out.println("Nilai Item ke 3 :" + t.item()); t.next();
        System.out.println("Nilai Item ke 4 :" + t.item()); t.next();
        System.out.println("Nilai Item ke 5 :" + t.item()); t.next();
        System.out.println("Nilai Item ke 6 :" + t.item()); t.next();
        System.out.println("Nilai Item ke 7 :" + t.item()); t.next();
        
        System.out.println("cara kedua");
        t.reset(); // mengembalikan nilai item ( value = 1 )
        System.out.println("Nilai item :" + t.item());
        System.out.println("Nilai Item ke 1 :" + t.itemTH(0));
        System.out.println("Nilai Item ke 2 :" + t.itemTH(1));
        System.out.println("Nilai Item ke 3 :" + t.itemTH(2));
        System.out.println("Nilai Item ke 4 :" + t.itemTH(3));
        System.out.println("Nilai Item ke 5 :" + t.itemTH(4));
        System.out.println("Nilai Item ke 6 :" + t.itemTH(5));
        System.out.println("Nilai Item ke 7 :" + t.itemTH(6));
        
    }
    
    public static void main(String[] args) {
        test01();
        test02();
        test03();
        test04();
    }
    
    
    //Moyang
    //template for Sequence
   abstract class sequence{
       
       protected int th;
       public sequence(){
           th=0;
       }
       
       public void reset(){
           th=0;
       }
       
       public int getTH(){
           return th;
       }
       
   } 
   // turunan Sequence
   abstract class IntegerSquence extends sequence{
       
       protected int value;
       public IntegerSquence (){
           super(); //representasi kelas induk
           value = 1;
       }
       
       public void reset(){
           super.reset();
           value = 1;
       }
       
       public int item(){
           return value;
       }
       
       abstract public void next();
       
       public int itemTH( int Nr){
           reset();
           for ( int i=0; i<Nr; i++) next();
           return value;
       }
   }
   
 static class naturalSequence extends IntegerSquence{
       
       public naturalSequence (){
           super();
       }
       
       public void next(){
           value++;
           th++;
       }
      
   }
   
  static class OddSequence extends IntegerSquence{
       
       public OddSequence(){
           super();
       }
       
       public void next(){
           value+=2;
           th++;
       }
   }
   
   static class EvenSquence extends IntegerSquence {
       
       public EvenSquence(){
           super();
           value=2;
       }
       
       public void reset(){
           super.reset();
           value=2;
       }
       
       public void next(){
           value +=2;
           th++;    
       }
   }
   
  static  class FibbonacciSequence extends IntegerSquence{
       
       private int prevValue;
       
       public FibbonacciSequence(){
           super();
           prevValue =0;
       }
       
       public void reset(){
           super.reset();
           prevValue =0;
       }
       
       public int itemTH ( int Nr){
           prevValue =0;
           return super.itemTH(Nr);
       }
       
       public void next(){
           int temp = value;
           
           value += prevValue;
           prevValue = temp;
           th++;
       }
   }
   
  
   
   
}
