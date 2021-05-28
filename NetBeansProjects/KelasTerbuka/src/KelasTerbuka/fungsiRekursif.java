/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasTerbuka;
import java.util.*;
/**
 *
 * @author Acer
 */
public class fungsiRekursif {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("input nilai : ");
        int nilai = input.nextInt();
        System.out.println("anda memasukkan " + nilai);
        
    printNilai(nilai);
    int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah =" + jumlah);
    int faktorial = hitungFaktorial(nilai);
        System.out.println("hasilFaktorial =" + faktorial);
    
    
    }
    private static void printNilai(int parameter){
        //rekursif berfungsi untuk memanggil ulang nilai yang ada di dalamnya
        //sedangkan return untuk membalikan nilai-nilai tersebut sehingga keluar dari pemanggilannga
        System.out.println("nilai : " + parameter);
       
        if (parameter== 0){
        return; }
        
        parameter--;
        printNilai(parameter);
    }
    
    private static int jumlahNilai(int parameter){
        System.out.println("parameter = " + parameter);
        
        if(parameter == 0){
        return parameter;
        }
        
        return parameter + jumlahNilai (parameter-1);
        
    }
    
    private static int hitungFaktorial(int parameter){
        System.out.println("parameter = " + parameter);
        
        if(parameter == 1){
            //melakukan return/pengenbalian ketika parameter = 1
        return parameter;
        }
        
        return parameter * hitungFaktorial (parameter-1);
        
    }
}
