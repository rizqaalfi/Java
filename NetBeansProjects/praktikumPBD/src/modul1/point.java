/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

/**
 *
 * @author Acer
 */
public class point extends shape {
    
    static int x,y;
       
    public point(){
        x= 56;
        y= 7;
    }
   
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }
    public static void print(){
        System.out.println("point :" + x + "," + y);
    }
    public static void main (String [] args){
        point p = new point();
        p.print();
    }
}
