/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

public class person {
    protected String name;
    protected String address;
    /*
    default constructor
    */
    public person(){
        System.out.println("Inside person : Constructor");
        name="";
        address = "";
    }
    /*
    constructor dengan 2 parameter
    */
    public person(String name, String address){
        this.name = name;
        this.address= address;   
    }
    /*
    Methode accesor
    */
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;    
    }
    public void setAddress( String Add){
        this.address= Add;
    }

}  
    
    


   

       
   
     
    

