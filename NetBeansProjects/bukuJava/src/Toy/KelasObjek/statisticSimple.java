/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy.KelasObjek;



/**
 *
 * @author Rizqa Alfiani
 * page 313
 * Alhamdulillah.. berhasil buat program median dan modus sendiri gaisss.. :D
 * 
 */
public class statisticSimple {
    private double []value;
    private double []frequency;
    private long population =0;
    
    private double average =0.0;
    private double std = 0.0;
    private double sum=0.0;
    private double variance = 0.0;
    private double median =0.0;
    private double modus =0.0;
    private double mean =0.0;
    
    public statisticSimple ( double[]value, double []frequency){
        this.value = value;
        this.frequency = frequency;
        calc();
    }
    
    public double getAverage(){
        return average;
    }
    
    public double getstd(){
        return std;
    }
    
    public double getSum(){
        return sum;
    }
    
    public double getVariance(){
        return variance;
    }
    
    public double getMedian(){
        return median;
    }
    
    public double getModus(){
        return modus;
    }
    
    public double getMean(){
        return mean;
    }
    
    private void calc(){
        calc_SumAverage();
        calc_stdVariance();
        calc_Median();
        calc_Modus();
        
        
    }
    
    private void calc_SumAverage(){
        for (int i = 0; i < value.length; i++) {
            sum+= (value[i] * frequency[i]);
            population += frequency[i];
        }
        
        average= sum/population;
    }
    
    private void calc_stdVariance(){
        double sumOfSquare =0.0;
        for (int i = 0; i < value.length; i++) {
            sumOfSquare += (value[i]-average) * (value[i]-average);
        }
        
        variance = sumOfSquare/value.length;
        std = Math.sqrt(sumOfSquare/value.length);
    }
    
   
    private void calc_Modus(){
        double max =0.0;
        
        for (int i = 0; i < value.length; i++) {
            if (max<frequency[i]) {
                max = frequency[i];
            }else{
                continue;
            }
        }
        for (int i = 0; i < value.length; i++) {
            if (max==frequency[i]) {
                modus += value[i];
                break;
            }else{
                continue;
            }
        }
        
    }
    
    private void calc_Median(){
       
        double temp = 0.0;
        double temp2 = 0.0;
        
        for (int i = 0; i < value.length-1; i++) {
            for (int j = 0; j < value.length-1; j++) {
                if (value[j] > value[j+1]) {
                    temp = value[j];
                    value[j] = value[j+1];
                    value[j+1] = temp;
                    
                    temp2 = frequency[j];
                    frequency[j] = frequency[j+1];
                    frequency[j+1] = temp2;
                }
            }
        }
        
       double x = 0.0;
       double p = 0.0;
       double s = 0.0;
      
       //jika populasi  ganjil
       if (population % 2 != 0) {
            x += (population+1)/2;
         
            for (int i = 0; i < value.length; i++) {
                p += frequency[i];
                if (p >= x) {
                    median += value[i];
                    break;
                }
            } 
        }
       //  jika populasi genap 
        else{
           x += population/2;
           s += (population/2)+1;
    
            for (int i = 0; i < value.length; i++) {
                p+= frequency[i];
                if (p>=x) {
                   median += value [i];                  
                   break;
               } 
           }          
           // kembalikan p ke nilai awal
           p=0.0;
           
           for (int i = 0; i < value.length; i++) {
               p+= frequency[i];
               if (p>=s) {
                   median += value[i];
                   break;
                }
            }          
           median = median/2;         
        }      
    }
    
    public String toString (){
        String data = " Data \n" + "Value    Frequency \n";
        
        for (int i = 0; i < value.length; i++) {
            data += value[i] + "    " + frequency[i] + "\n";  
        }
        data += "\n";
        
        String str = data +
                "Hasil  : " + "\n"+
                "Total  : " + sum +"\n" +
                "Populasi   : " + population + "\n" +
                "Rata-rata  : " + average + "\n" +
                "std deviasi    : " + std + "\n" +
                "Variasi : " + variance + "\n" +
                "Median : " + median + "\n" +
                "Modus : " + modus;
        
        return str;             
    }
    
    static void test(){
        double [] value = {23,45,34,35,56};
        double [] frequency= {3,4,3,2,5};
        
        statisticSimple x = new statisticSimple(value, frequency);
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        test();
        
    }
}
