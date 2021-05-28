/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 102-104
 * operator dan latihan java
 */
public class RupiahDistribution {
    private long amount = 0;
    private long rp100rb = 0;
    private long rp50rb = 0;
    private long rp20rb = 0;
    private long rp10rb = 0;
    private long rp5rb = 0;
    private long rp1rb = 0;
    private long rp500 = 0;
    private long rp200 = 0;
    private long rp100 = 0;
    private long rp50 = 0;
    
    public RupiahDistribution(){
    
    }
    
    public RupiahDistribution( long amount){
        this.amount = amount;
        distributeAmount();
    }
    
    public void setAmount (){
        this.amount = amount;
        distributeAmount();
    }
    
    private void distributeAmount(){
        long t = amount;
        
        rp100rb = t/100000;
        t-= (rp100rb*100000);
        
        rp50rb = t/50000;
        t-= (rp50rb*50000);
        
        rp20rb = t/20000;
        t -= (rp20rb*20000);
        
        rp10rb = t/20000;
        t -= (rp10rb*10000);
        
        rp5rb = t/5000;
        t-= (rp5rb*5000);
        
        rp1rb = t/1000;
        t-= (rp1rb*1000);
        
        rp500 = t/500;
        t-= (rp500*500);
        
        rp200 = t/200;
        t-= (rp200*200);
        
        rp100 = t/100;
        t-= (rp100*100);
        
        rp50 = t/50;
        t-=(rp50*50);
    }
    
    public long getAmount(){
        return amount;
    }
    public long get100k(){
        return rp100rb;
    }
    public long get50k (){
        return rp50rb;
    }
    public long get20k(){
        return rp20rb;
    }
    public long get10k (){
        return rp10rb;
    }
    public long get5k (){
        return rp5rb;
    }
    public long get1k(){
        return rp1rb;
    }
    public long get500(){
        return rp500;
    }
    public long get200(){
        return rp200;
    }
    public long get100(){
        return rp100;
    }
    public long get50(){
       return rp50;
    }
    
    public String toString(){
        String str = 
                "Total Uang = " + amount + "\n" +
                "Rp. 100.000,- = " + rp100rb + " buah \n" +
                "Rp. 50.000,- = " + rp50rb + " buah \n" +
                "Rp. 20.000,- = " + rp20rb + " buah \n" +
                "Rp. 10.000,- = " + rp10rb + " buah \n" +
                "Rp. 5.000,- = " + rp5rb + " buah \n" +
                "Rp. 1.000,- = " + rp1rb + " buah \n" +
                "Rp. 500,- = " + rp500 + " buah \n" +
                "Rp. 200,- = " + rp200 + " buah \n" +
                "Rp. 100,- = " + rp100 + " buah \n" +
                "Rp. 50,- = " + rp50 + " buah \n";
        
        return str;
                
    }
    static void test(){
        RupiahDistribution  x = new RupiahDistribution (465037538);
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        test();
    }
}
