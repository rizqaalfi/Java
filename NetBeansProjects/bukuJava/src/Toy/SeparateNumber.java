/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 188
 * Latihan OOP Java
 */
public class SeparateNumber {
   private int number;
   
   public SeparateNumber (int number){
       this.number = number;
   }
   
   public int getNumber(){
       return number;
   }
   
   public String toString(){
       String str = number + " dapat di pisahkan menjadi " + separate();
       return str;
   }
   
   static void test(){
       System.out.println(new SeparateNumber(34545657));
       System.out.println(new SeparateNumber(0));
   }
   
    public static void main(String[] args) {
        test();
    }
    
    private String separate(){
        String t = "" + number;
        String str = "";
        
        for (int i = 0; i < t.length() ; i++) {
            str += t.substring(i, i+1) + "\t";
        }
        
        return str;
    }
}
