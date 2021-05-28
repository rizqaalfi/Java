/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy.KelasObjek;

import java.util.Arrays;

/**
 *
 * @author Rizqa Alfiani
 * just for test
 */
public class testingMedian {
    public static void main(String[] args) {
        
        double v [] = {23,49,66,21,45};
        double f [] ={ 2,4,5,6,2};
        
        // alat bantu memindahkan
        double temp = 0.0;
        double temp2 = 0.0;
        
        // urutkan dulu
        for (int i = 0; i < v.length-1; i++) {
            for (int j = 0; j < v.length-1; j++) {
                if (v[j] > v[j+1]) {
                    temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                   
                    // mengikuti urutan valuenya
                    temp2 = f[j];
                    f[j] = f[j+1];
                    f[j+1] = temp2;
                }
            }
        }
       
       double median =0.0;
       double population = 0.0;
       
       // alat bantu
       double x = 0.0;
       double p = 0.0;
       double s = 0.0;
       
       
       for (int i = 0; i < v.length; i++) {
            population += f[i];
        }
        System.out.println("populasi : " + population);
       
       //jika populasi  ganjil
       if (population % 2 != 0) {
            x += (population+1)/2;
         // System.out.println( "x :" + x);
        
            for (int i = 0; i < v.length; i++) {
                p += f[i];
                if (p >= x) {
                    median += v[i];
                    break;
                }
            } 
        }
       //  jika populasi genap 
        else{
           x += population/2;
          // System.out.println("x : " + x);
           s += (population/2)+1;
          // System.out.println("s :" + s);
           
            for (int i = 0; i < v.length; i++) {
                p+= f[i];
                if (p>=x) {
                   median += v [i];                  
                  // System.out.println(" median1 :" + median);
                   break;
               } 
           }          
           // kembalikan p ke nilai awal
           p=0.0;
           
           for (int i = 0; i < v.length; i++) {
               p+= f[i];
               if (p>=s) {
                   median += v[i];
                  // System.out.println(" median2 :" + median);
                   break;
                }
            }
           
           median = median/2;
          // System.out.println(" median hasil :" + median);
          
        }
       
       
        System.out.println("== inilah hasil percobaanku hari ini.. wah"
                + "\n alhamdulillah ya..:D");
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(f));
        System.out.println("Median :" + median);
    }
}
