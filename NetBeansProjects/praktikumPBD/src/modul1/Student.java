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
public class Student extends person{
        public Student(){
            //super();
            //super("SomeName","SomeAddress");
            //super.name= "name";
           
            System.out.println("inside Student : Constructor");
        
        }
       public String getName(){
           System.out.println("student name :" + name);
           return name;
       }
  
        public static void main(String[] args) {
      Student anna = new Student();
      
   }
   }
        
