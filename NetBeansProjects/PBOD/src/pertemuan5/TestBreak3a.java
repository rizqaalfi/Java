/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *Rizqa Alfiani
 * E31191919
 */
public class TestBreak3a {
    public static void main(String[] args) {
        boolean status=true;
        //boolean status=false;
        label1 : {
            System.out.println("Di dalam blok code label1");
            label2 : {
                if(status){
                    break label1;
                }
                System.out.println("Di dalam blok code label2");
            }
            System.out.println("Masih di dalam blok code label1");
        }
        System.out.println("Di luar blok code label1");
    }
}
