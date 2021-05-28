/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 124
 * Materi Kimia ( Avogadro (6,02 x 10e23) )
 * Latihan OOP
 */
public class Molecule {
    public static final double Avogadro = 6.02e23;
    public static final int Carbon = 12; //Ar
    public static final int Hydrogen = 1; //Ar
    
    private double Mass = 0.0;
    private double Jumlah_C = 0;
    private double Jumlah_H = 0;
    private double MassPerAvogadro = 0.0;
    private double molecule = 0.0;
    
    public Molecule ( double Mass, int Jumlah_C, int Jumlah_H){
        this.Mass = Mass;
        this.Jumlah_C = Jumlah_C;
        this.Jumlah_H = Jumlah_H;
        
        calcMolecule();
    }
    
    private void calcMolecule(){
        MassPerAvogadro = ( Jumlah_C * Carbon) + ( Jumlah_H * Hydrogen);
        molecule = ( Mass/ MassPerAvogadro) * Avogadro;
    }
    
    public String toString (){
        String str =
                " HidroCarbon \n" +
                " Rumus HidroCarbon dengan C " + Jumlah_C + " dan H " + Jumlah_H + "\n" +
                " Massa Per Avogadro = " + MassPerAvogadro +"\n" +
                " Massa = " + Mass + "\n" +
                " Jumlah Molekul = " + molecule ;
        return str;
       
    }
    
    static void test(){
        Molecule a = new Molecule( 16 ,1 ,4);
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        test();
    }
}
