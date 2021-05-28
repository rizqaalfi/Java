/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalmathematics;

/**
 *
 * @author Acer
 */
public class FuncionalMathematics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        double x=Math.E;
        double fx=Math.log(x) ;
        
        System.out.print( "Is this precisely 1 or are there numerical errors? ") ;
        System.out.println ( fx ) ;
        
        double y = Math.PI/15.0;
        double fy = Math.sin(y)*Math.sin(y)+Math.cos(y)*Math.cos(y);
        System.out.print("What about this Trignometric Equality (should be 1)?");
        System.out.println (fy);
        
        
        
      
      
    }
    
}
