/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleanexpresion;

/**
 *
 * @author Acer
 */
public class BooleanExpresion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean a=true ;
    boolean b=false ;
    
    boolean expr1=a || b ;
    boolean expr2=a&&b ;
    
    System.out.print ( "a||b=" ) ;
    System.out.println ( expr1 ) ;
    System.out.print ( "a&&b=" ) ;
    System.out.println ( expr2 ) ;
    }
    
}
