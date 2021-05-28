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
public class TestSwitch5 {
    public static void main(String[] args) {
        int bulan, year;
        bulan = 1;
        year = 2002;
        switch(bulan) {
            case 1: switch(year) {
                        case 2002 :
                            System.out.println("Bulan 1 tahun 2002");
                            break;
                        case 2003 : //...
                    }
            case 2: //...
            default: //default...
        }
    }
}
