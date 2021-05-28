/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class PersonTest {
    public static void main (String [] args){
        Person p = new Person();
        p.setFirstName("Fatmawati");
        p.setLastName("Aprilia");
        p.setHeight(155);
        p.setWeight(34.6);
        
        System.out.println ("FirstName : " +p.getFirstName());
        System.out.println("Last Name : " + p.getlastName());
        System.out.println("Weight : " + p.getWeight());
        System.out.println("Height : " + p.getHeight());
}
}
