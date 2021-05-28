/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * latihan10
 */
public class Demo4{
    public static void main(String[] args) {
        Mahasiswa arr8[]= {new Mahasiswa ("02","Budi"), new Mahasiswa
        ("03","Candra"),new Mahasiswa
                ("01","Andi"), new Mahasiswa("04","Udin")};
        InsertionDemo3.insertionSort(arr8);
        InsertionDemo3.tampil(arr8);
    }
}
