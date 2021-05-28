/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
* kombinasi 2 karakter 
* 2 maret 2020
*/
public class percobaan4 {
    public static void main(String[] args) {
      Char("", 2);  
    }
    
    public static void Char (String a , int n){
    if (n==0) {
        System.out.print(a + " ");
    }
    else {
        for (int i = 97; i < 99; i++) {
            Char(a +(char)i,n-1);
            //(char)i => untuk mengkonfersi angka menjadi huruf
        }
}
        
    }
}
