/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;
import java.awt.*;
/**
 *
 * @author Acer
 */
public class GridLayoutDemo extends Frame{
    public GridLayoutDemo(){
    }
    public static void main(String[]args){
    GridLayoutDemo gld = new GridLayoutDemo();
    gld.setLayout( new GridLayout(2,3,4,4));
    gld.add( new Button("ONE"));
    gld.add( new Button("TWO"));
    gld.add( new Button("THREE"));
    gld.add( new Button("FOUR"));
    gld.add( new Button("FIVE"));
    gld.setSize(200,200);
    gld.setVisible(true);
    }
}
