/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 178
 * cheking prime number and practice for Java OOP
 */
public class primetoy {
    
    private int number;
    private boolean fPrime = true;
    
    public primetoy (int number){
        this.number = number;
        doPrimeTest();
    }
    
    public int getNumber (){
        return number;
    }
    
    public boolean isPrime(){
        return fPrime;
    }
    
    public String toString (){
        String str = "";
        if (fPrime) str += number + " adalah bilangan prime";
        else str += number + " bukan bilangan prime";
        return str;
    }
    
    private void doPrimeTest(){
        for (int i = 2; i < Math.floor(Math.sqrt(number)); i++) {
            if (number % i ==0) {
                fPrime = false;
                return;
            }
        }
    }
    
    static void test(){
        System.out.println( new primetoy (19));
        System.out.println( new primetoy(20));
        System.out.println(new primetoy(24));
    }
    public static void main(String[] args) {
        test();
    }
}
