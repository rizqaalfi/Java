/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasTerbuka;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author Acer
 */
public class contohException {
    public static void main(String[] args) throws FileNotFoundException {
       //throws berarti melempar ke method, jadi tidak memerlukan try catch
       //untuk mengatasi errornya
       
       FileInputStream FileInputStream = new FileInputStream("input.txt");
       
        
    }
}
