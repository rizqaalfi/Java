/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * Rizqa Alfiani
 */
class Operator4{
    public static void main(String[] args) {
    int x,y;
    x = 5;
    if(x!=0 & (x/2)>=5){
        System.out.println("TRUE 1 : " + x);
        System.out.println("TRUE 1 : ");
    }
    else {
        System.out.println("FALSE 1");
    }
    }
}

class Operator6{
    public static void main(String[] args) {
        int x,y;
        x = 5;
        if(x!=0 & (x/2)>=5) {
            System.out.println("TRUE 2 : " + x);
            System.out.println("TRUE 2 : ");
        }
        else {
            System.out.println("FALSE 2");
        }
    }
}

class Operator7{
    public static void main(String[] args) {
        int x,y;
        x=10;
        y=5;
        if(x>y & x++ > 10) {
            System.out.println("TRUE 3 : " + x);
            System.out.println("TRUE 3 : " + y);
            System.out.println("TRUE 3 : ");
        }
        else {
            System.out.println("FALSE 3");
        }
    }
}

class Operator8{
    public static void main(String[] args) {
        int x,y;
        x=10;
        y=5;
        if(x>y & ++x>10) {
            System.out.println("TRUE 3 x : " + x);
            System.out.println("TRUE 3 y : " + y);
            System.out.println("TRUE 3 : ");
        }
        else {
            System.out.println("FALSE 3");
        }
    }
}