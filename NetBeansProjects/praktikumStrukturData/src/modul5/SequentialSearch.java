/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 * mengecek data satu satu atau sequen
 * @author Rizqa Alfiani
 * 
 */
public class SequentialSearch {
    static int Sequential(int[]angka, int data){
        for (int i = 0; i < angka.length; i++) {
            if (data==angka[i]) {
                return i;
            }
        }
        return -1;
        //return -1 karena array itu index mulainya 0
    }
    public static void main(String[] args) {
        int[]angka={4,10,2,3,5,7,1,110,124};
        int data= 5;
        
        
        System.out.println("angka " + data + " terdapat pada index ke -" + Sequential(angka,data));
    }
}
