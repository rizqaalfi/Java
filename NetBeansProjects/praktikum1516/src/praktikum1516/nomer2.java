/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1516;

/**
 *
 * @author Acer
 */
public class nomer2 {
    public static void main (String [] args){
     int a = 1, j= 0;
     
     while (a<=100){
    if (a>=10){ 
        System.out.print("nilai a =");
        System.out.println(a);
        j = a+j;
       
        System.out.printf("jumlah nilai dari 10 sampai %d =",a );
        System.out.println(j); 
        a++;
     }
    else { a++;}
     }
   
    }
}
