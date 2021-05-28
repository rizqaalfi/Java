/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6dan7;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class SequentialSearch {
    private String [] allData = new String[]{"A", "B", "C", "D", "E", "F"};
    private void tampilkanData(){
        for (String Data : allData) {
            System.out.println(Data + " ");
        }
        System.out.println();
    }
    private void searching(String karakter){
        int x = 0;
        boolean ketemu = false;
        for (int i = x; i < allData.length; i++) {
            if (karakter.equals(allData[i])) {
                ketemu= true;
                x=i;
            }
        }
        if (ketemu) {
            System.out.println("Data berada pada urutan ke- " + (x+1)); 
        } else{
            System.out.println("Data tidak di temukan");
        }
    }
    public static void main(String[] args) {
        SequentialSearch obj = new SequentialSearch();
        
        // Untuk menampilkan data pada Array
        obj.tampilkanData();
        // melakukan pencarian data
        obj.searching("C");
    }
}
