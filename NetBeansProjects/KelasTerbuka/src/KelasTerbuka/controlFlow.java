/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Break, Continue, Return
 */
public class controlFlow {
    public static void main (String [] args){
     
        int a = 0;
    while (true) {
        a++;
        if (a==10){
             break;//ini adalah keyword untuk memaksa berhenti dari looping
        } else if (a==5) {
            continue;// ini adalal keyword untuk memaksa memulai loop dari awal
        }else if (a== 7){
             return; //ini adalah keyword yang berpasangan dengan main, maka bisa di letakkan di mana saja
        }               //dan akan memberhentikan program
    System.out.println ("Looping ke -" + a);

    }
    
    System.out.println ("akhir program");
    }
}
