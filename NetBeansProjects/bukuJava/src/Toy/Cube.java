/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 82
 * Latihan Pemrograman berorientasi objek
 */
public class Cube {
    
    private double side = 3.9;
    
    public Cube(){
    }
    
    public Cube (double side){
        this.side = side;
    }
    public void setSide( double side){
        this.side = side;
    }
    public double getSide (){
        return this.side;
    }
    
    public double getCircumference(){
        return calcCircumference();
    }
    public double getArea(){
        return calcArea();
    }
    public double getVolume(){
        return calcVolume();
    }
    
    public double calcCircumference(){
        return (12*this.side);
    }
    public double calcArea(){
        return (6*this.side*this.side);
    }
    public double calcVolume(){
        return (side*side*side);
    }
    
    static void test (){
        Cube c = new Cube();
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        test();
    }
    
    public String toString(){
        String str =
                "Kubus \n"+
                "Panjang Sisi = " + side + "\n" +
                "Keliling = " + calcCircumference() + "\n" +
                "Luas = " + calcArea() + "\n" +
                "Volume = " + calcVolume() + "\n";
        return str;
               
    }
}
