/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;

/**
 *
 * @author Rizqa Alfiani
 * page 141
 * latihan OOP Java
 * tax = pajak
 * gross = gaji
 * taxRate = persenPajak
 * 5E7 = 50jt
 */
public class TaxForSalary {
    private double gross = 0.0;
    private double taxRate =0.0;
    private double net = 0.0;
    private double tax = 0.0;
    
    public TaxForSalary (double gross, double taxRate){
      this.gross = gross;
      this.taxRate =taxRate;
      calc();
    }
    private void calc(){
        tax = taxRate*gross;
        net = gross-tax;
    }
    
    public double getTaxRate(){
        return taxRate;
    }
    public double getTax(){
        return tax;
    }
    public double getGross(){
        return gross;
    }
    public double getNet(){
        return net;
    }
    
    public String toString(){
        String str =
                "Penghasilan Kotor = " + gross + "\n" +
                "Rate Pajak = " + taxRate + "\n" +
                "Pajak Penghasilan = " + tax + "\n" +
                "Panghasilan Bersih = " + net + "\n";
        return str;
    }
    
    static void test(){
        TaxForSalary x = new TaxForSalary(5E7, 0.25);
        System.out.println(x);
                
    }
    public static void main(String[] args) {
        test();
    }
}
