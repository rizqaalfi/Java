/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;
 import java.util.Scanner;
/**
 *
 * 25 feb 2020
 */
public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String[][]warna =
        {
            {"Warna Biru", "Warna kesukaan kamu Biru, biasanya termasuk tipe "
                + "\npemurung,selalu menyenangkan dan selalu bertindak pasif dalam"
                + "\nsegala hal. Selalu mengharapkan kedamaian dan ketenangan."
                + "\nKamu memiliki kesulitan dalam pegaulan. Demikian pula dalam "
                + "\nbercinta karena kamu sering sekali menyembunyikan perasaan"},
            {"Warna Hitam", "Kamu termasuk orang yang sangat lincah dalam hal-hal"
                + "\n tertentu saja. Jika berada di lingkungan yang tidak disukai,"
                + "\n maka kamu akan menjadi murung.Kamu selalu tampil menarik,rapi,"
                + "\n cukup banyak lawan jenis berusaha mengejar dan merebut cinta kamu"},
            {"Warna Merah", "Kamu sangat berwibawa dan juga senang melindungi orang yang lemah."
                + "\nWalau sering kali bergaul dan bercanda tapi kamubisa menahan "
                + "\ndiri. Banyak orang mengatakan cinta, tapi kamu selau berpikir"
                + "\n dan berpikir lagi.Kamu termasuk tipe yang sulit jatuh cinta"},
            {"Warna Hijau", "Jika warna favoritemu warna hijau, maka kamu adalah"
                + "\n tipe yang sangat romantis, menyukai keindahan, menyenagi alam"
                + "\n dan udara yang sejuk. Kamu adalah seorang yang selalu memegang"
                + "\n prinsip. Dalam hal bercintakamu mengidam idamkan calon teman"
                + "\n hidup yang penuh toleransi dan dapat dipercaya"},
            {"Warna Kuning", "Kesukaan kamu warna kuning menandakanbahwa kamu "
                + "\nmemiliki sifat optimis.Kamu tipe periang dan senang bergaul, "
                + "\ntidak memliki penampilan yang loyo. Sifat tolong menolong selalu"
                + "\n ada dalam diri kamu, kerena menolong merupakansuatu kewajiban"
                + "\nmutlak bagi kamu. Kamu orang yang tidak pernah meremehkan"
                + "\n siapapun juga,walsupun seorang itu dungu atau bloon"},
            {"Warna Putih", "kamu adalah orang yang dilahirkn ke dunia dengan "
                + "\nsempurna,ika menyukai warna putih, banyak orang mengagumi kamu "
                + "\nkarena sifat anggun,sifat idealis karena moral kamu sangat "
                + "\ntinggi. Tak pernah angkuh, senang menolong siapa saja yang "
                + "\nmemutuhkan bantua kamu"},
            {"Warna Ungu", "warna ungu adalah pribadi dengan tipe yang luar biasa."
                + "\n Selau optimis, dalam kamu tidak perah ragu-ragu. apa yang "
                + "\ndikerjakan kamu adlah yang terbaik. kamu pandai benar dalam "
                + "\nmengikuti perkembangan jaman. Dalam bercinta, hanya merekalah"
                + "\nyang kuat mental yang bisa mendekati dan menjadi kekasihmu"}
               };
        
        
        System.out.print("Warna yang anda sukai :");
        String a = input.next();
        
        if ("Biru".equals(a)){
            System.out.println(warna[0][1]);
        }
        if ("Hitam".equals(a)){
            System.out.println(warna[1][1]);
        }
        if ("Merah".equals(a)){
            System.out.println(warna[2][1]);
        }
        if ("Hijau".equals(a)){
            System.out.println(warna[3][1]);
        }
        if ("Kuning".equals(a)){
            System.out.println(warna[4][1]);
        }
        if ("Putih".equals(a)){
            System.out.println(warna[5][1]);
        }
        if ("Ungu".equals(a)){
            System.out.println(warna[6][1]);
        }
        else {
            System.out.println("warna yang anda masukkan tidak sesuai"
                    + " atau ada kesalahan kerakter penulisan");
        }
        
        
        
    }
 
}
