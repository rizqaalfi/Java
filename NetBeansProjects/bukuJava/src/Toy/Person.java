/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 249
 * Latihan OOP Java
 */
public class Person {
    String Name;
    String address;
    String address2;
    String city;
    int age;
    
    public Person(){
        Name ="";
        address = "";
        address2 = "";
        city = "";
        age = 0;
    }
    
    public Person(String Name, String address, String address2, String city,
            int age)  {
        this.Name = Name;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.age = age;
        
    }   
    
    public void setName ( String Name){
        this.Name = Name;
    }
    
    public void setAddress( String address){
        this.address = address;
    }
    
    public void setAddress2 ( String address2){
        this.address2 = address2;
    }
    
    public void setCity( String city){
        this.city = city;
    }
    
    public void setAge ( int age){
        this.age = age;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getAddress2(){
        return address2;
    }
    
    public String getCity(){
        return city;
    }
    
    public int getAge(){
        return age;
    }
    
    public String toString(){
         String str =
                 "Nama : " + Name + "\n" +
                 "Alamat 1 : " + address + "\n" +
                 "Alamat 2 : " + address2 + "\n" +
                 "Kota : " + city + "\n" +
                 "Umur : " + age;
         return str;
    }
    
    static void test(){
        Person x = new Person("Rizqa Alfiani", "Jln. Slamet Riyadi 48",
                "Jln. Pangandaran 4", "Jember", 20);
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        test();
    }
}
