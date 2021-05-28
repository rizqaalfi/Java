/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11.pkg12;
    import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("wujud air dalam suhu tertentu\n");
       
     
        for (int i = 0; i < 5; i++) {
            
            System.out.print("input suhu =");
        int T = input.nextInt();
        
  
        if (T<0){
            System.out.println("beku");}
        else if (T==0){
            System.out.println("beku-cair");}
        else if (T>0){
            if (T<100){
                System.out.println("cair");}
            else if (T==100){
                System.out.println("cair-uap");}
            else if (T>100){
                System.out.println("uap");}
        }
        }
            
    }
   
}
