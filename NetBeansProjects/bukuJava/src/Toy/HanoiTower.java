/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

/**
 *
 * @author Rizqa Alfiani
 * page 190
 * Latihan OOP Java
 * menangkan logika matematika ->> belajar lagi
 * bejar java sebenarnya gampang hanya perlu latihan dan latih logika
 */
public class HanoiTower {
    private int nrOfdisk = 0;
    private char originPole = 'A';
    private char destPole = 'B';
    private char otherPole = 'C';
    private String str = "";
    
    public HanoiTower ( int nrOfdisk){
        this.nrOfdisk = nrOfdisk;
        transfer();
    }
    
    public String toString(){
        str =
                " Menara Hanoi dengan " + nrOfdisk + " pirngan \n"+
                " Asal : " + originPole + 
                " Tujuan : " + destPole +
                " Perantara : " + otherPole + "\n" + str;
        return str;
    }
    
    static void test (){
        System.out.println(new HanoiTower (3));
    }
    
    public static void main(String[] args) {
        test();
    }
    
    private void diskMove( char originPole, char destPole){
        str += "Pindahkan piringan dari " + originPole + 
                " ke " + destPole + "\n";
    }
    
    private void blockMove ( int nrOfdisk, char origiinPole, char destPole,
            char otherPole){
        if (nrOfdisk>0) {
            blockMove(nrOfdisk-1, origiinPole, otherPole, destPole);
            diskMove(originPole, destPole);
            blockMove(nrOfdisk-1, otherPole, destPole, originPole);
        }
    }
    
    private void transfer (){
        blockMove(nrOfdisk, originPole, destPole, otherPole);
    }
}
