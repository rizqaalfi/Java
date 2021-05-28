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
public class Employee extends person {
    public String getName(){
        System.out.println("Employee Name :" + name);
        return name;
    }
    public static void main(String [] args){
        
        person ref;
        Student StudentObject = new Student();
        Employee EmployeeObject = new Employee();
        
        ref = StudentObject;
        String temp = ref.getName();
        System.out.println(temp);
        ref = EmployeeObject;
        temp = ref.getName();
        System.out.println(temp);
        
    }
}
