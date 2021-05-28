/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * latihan9
 * 
 */
public class Mahasiswa implements Comparable <Mahasiswa>{
    private String nrp;
    private String nama;

    public Mahasiswa( String nama, String nrp){
        this.nama = nama;
        this.nrp = nrp;
    }
    @Override
    public int compareTo(Mahasiswa o){
        return nrp.compareTo(o.nrp);
    
    }
    
    @Override
    public String toString(){
        return "Mahasiswa{"  + " nrp : " + nama  + " nama : " + nrp+ "}";
    
    }
}
