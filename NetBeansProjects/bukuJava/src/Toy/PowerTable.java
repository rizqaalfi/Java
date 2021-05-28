/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 89, 90
 * program kuadrat( proiritas oprator )
 */
public class PowerTable {
   private int numberRow ;
   
   public PowerTable(){
       
   }
   
   public PowerTable(int numberRow){
       this.numberRow = numberRow;
   }
   
   public void setNumber(int numberRow){
       this.numberRow = numberRow;
   }
   
   public int getNumber(int numberRow){
       return numberRow;
   }
   
   public void printTable(){
       System.out.println("Number Square Cube");
       for (int i = 0; i < numberRow; i++) {
           System.out.println(i +"  " + (i*i)+ "    " + (i*i*i));
       }
   }
   
   static void test(){
        PowerTable v = new PowerTable(30);
        v.printTable();
   
   }
    public static void main(String[] args) {
        test();
    }
     
   
}
