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
class Person {
    private String firstName;
    private String lastName;
    private int height;
    private double weight;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName= lastName;
    }
    
    public void setHeight(int height){
        this.height= height;
    }
    
    public void setWeight(double weight){
        this.weight= weight;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public String getlastName(){
        return lastName;
    }
    
     public int getHeight(){
        return height;
    }
     
      public double getWeight(){
        return weight;
    }

    
}