/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 202
 * latihan OOP Java
 * 
 */
public class TempWater {
    private double temperature;
    
    public TempWater( double temperature){
        this.temperature = temperature;
    }
    
    public String getForm(){
        if(temperature < 0) return "es-Beku";
        if (temperature == 0) return "transisi Es dan Air";
        if (temperature >0 && temperature <100 ) return "Air-Cair";
        if ( temperature== 100) return " Transisi Cair-Uap";
        if (temperature > 100) return "Uap-Gas";
        return "";
    }
    
    public String toString(){
        String str =
                "Air bersuhu : " + temperature + "\n" +
                "Berbentuk : " + getForm();
        return str;
    }
    
    static void test(){
        TempWater x = new TempWater(-50);
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        test();
    }
        
}
