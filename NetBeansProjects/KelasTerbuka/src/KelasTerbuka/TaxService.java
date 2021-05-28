/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;

/**
 *
 * @author Rizqa Alfiani
 * page 144
 * latihan OOP Java
 */
public class TaxService {
    private double amount = 0.0;
    private double VatRate = 0.0;
    private double finalAmount = 0.0;
    private double vat = 0.0;
    
    public TaxService (double amount, double VatRate){
        this.amount = amount;
        this.VatRate = VatRate;
        
        calc();
    }
    
    private void calc(){
        vat = VatRate*amount;
        finalAmount = amount+vat;
    }
    
    public double getVatRate(){
        return VatRate;
    }
    public double getAmount(){
        return amount;
    }
    public double getVat(){
        return vat;
    }
    public double getFinalAmount(){
        return finalAmount;
    }
    
    public String toString(){
        String str =
                "Jumlah = " + amount + "\n"+
                "Rate PPn = " + VatRate + "\n" +
                "PPn = " + vat + "\n" +
                "Total Bayar = " + finalAmount ;
        return str;
    
    }
    static void test(){
        TaxService c = new TaxService(5E6, 0.05);
        System.out.println(c);
    }
    public static void main(String[] args) {
        test();
    }
}
