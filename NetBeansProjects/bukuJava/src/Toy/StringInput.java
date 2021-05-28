/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;
import javax.swing.*;
/**
 *
 * @author Rizqa Alfiani
 * page 76 dan 78
 * Pembacaan masukan string JOptionpane dan Konversi type
 */
public class StringInput {
    public static void main(String[] args) {
        
       String name = JOptionPane.showInputDialog("What's your name?");
        System.out.println(name);
       
        
        // konversi type int dan double
        
        String input = JOptionPane.showInputDialog(" How old are you ?");
        int old = Integer.parseInt(input);
        System.out.println(old);
      
        
        String input2 = JOptionPane.showInputDialog(" How your body's Height?");
        double height = Double.parseDouble(input2);
        System.out.println(height);
        System.exit(0);
    }
}
