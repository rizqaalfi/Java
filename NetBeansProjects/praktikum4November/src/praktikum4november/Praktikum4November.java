/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4november;

/**
 *
 * @author Acer
 */
public class Praktikum4November {
 
    /**
     * 
     */
    public static void main(String[] args) {
        
        //latihan 1
     System.out.print ("Total credit (in US dollar):\t");
     System.out.println (100+150);
     
     System.out.print ("Total debit ( in US dolar) :\t");
     System.out.println (50+25+100);
     
     System.out.println("Balance: ");
  
        
        //latihan 2
     int credit;
     int debit;
     
     credit = 100+150;
     System.out.print("Total credit (in US dollars) :\t");
     System.out.println(credit);
     
     debit = 50+25+100;
     System.out.print ("Total debit ( in US dollars) :\t");
     System.out.println(debit);
     
     System.out.print("balance :");
     System.out.println(credit-debit);
     
        //latihan 3
    double width = 0.5, height =  1.0, depth = 0.2;
    
    System.out.print ("Volume of the box (in cubic meter):");
    System.out.println (width*height*depth);
    
        //latihan 4
    double myfavoritereal = 3.141592;
    int myfavoritenet = (int) 2.71;
    //type error because integer just display integer
    
           //latihan 5
    double a,b,c ;
    a = Math.sqrt(3.0);
    b = 2.0;
    c =-3.0;
    
    double delta =b*b-4.0*a*c;
    double root1,root2;
    
    root1 = (-b-Math.sqrt(delta))/(2.0*a);
    root2 = (-b+Math.sqrt(delta))/(2.0*a);
    
    System.out.print(root1);
    System.out.println(root2);
    System.out.println ("Let us check the roots :");
    System.out.println (a*root1*root1+b*root1+c);
    System.out.println (a*root2*root2+b*root2+c);
    
        //latihan 6
    int d= 1, e= 2;
   
    System.out.print("d="); 
    System.out.print (d);
    System.out.print ("e=");
    System.out.println(e);
    
    System.out.println("d=" + d + "e=" + e);
    
    String S1  = "Lecture in", S2="Java";
    String s = S1+S2; 
    System.out.println (s);
    
    
    
    
    
    
        
    
     
    }
    
}
