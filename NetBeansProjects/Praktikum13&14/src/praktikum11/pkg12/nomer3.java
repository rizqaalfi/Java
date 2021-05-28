/*
2 desember 2019
 */
package praktikum11.pkg12;
    import java.util.Scanner;

public class nomer3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        for (int i = 0; i < 7; i++) {
        System.out.print("input a =");
        int a = input.nextInt();
        System.out.print("input b =");
        int b = input.nextInt();
        System.out.print("input c =");
        int c = input.nextInt();
        
        if (a!=b && a!=c &&b!=c){
            if (a>b){
                if (b>c){
                    System.out.println("a,b,c");}
                else if(c>b && a>c){
                    System.out.println("a,c,b");}
            }
            if (b>a){
                if (a>c){
                    System.out.println("b,a,c");}
                else if(b>c && c>a){
                    System.out.println("b,c,a");}
            }
            if (c>b){
                if (b>a){
                    System.out.println("c,b,a");}
                else if(a>b && c>a){
                    System.out.println("c,a,b");}
            }
        }
        else {
            System.out.println("terdapat angka yang sama");}
       
        }
       
    }
}
