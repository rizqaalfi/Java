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
class Student {
   private int id;
   private String nama;
   private String address;
   private String teoriSource;
   private String practiceSource;
   
   public void setId( int id){
       this.id = id;
   }
   
   public void setNama (String nama){
        this.nama= nama;
   }
   
   public void setAddress ( String address){
       this.address = address;
   }
   
   public void setTeoriSource( String teoriSource){
       this.teoriSource = teoriSource;
   }
   
   public void setPracticeSource (String practiceSource){
        this.practiceSource = practiceSource;
   }
   
   public int getId (){
       return this.id;
   }
   
   public String getNama(){
       return this.nama;
   }
   
   public String getAddress(){
       return this.address;
   }
   
   public String getTeoriSource(){
       return this.teoriSource;
   }
   
   public String getPracticesource(){
        return this.practiceSource;
   }
   
   

}
