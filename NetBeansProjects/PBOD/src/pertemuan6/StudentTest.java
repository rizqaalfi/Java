/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 * Rizqa Alfiani
 * E31191919
 */
public class StudentTest {
    public static void main(String[] args) {
        Student x = new Student();
        x.setId(3119);
        x.setNama("Indah Trinara");
        x.setAddress("jl. Slamet Untung 4");
        x.setTeoriSource("PetaniCode");
        x.setPracticeSource("BKPM");
        
        System.out.println("id : " + x.getId());
        System.out.println("Nama : " + x.getNama());
        System.out.println("Address : " + x.getAddress());
        System.out.println("TeoriSource : " + x.getTeoriSource());
        System.out.println("PracticeSource : " + x.getPracticesource());
    }
    
}
