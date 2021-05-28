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
public class BorderLayoutDemo extends Frame{
    public BorderLayoutDemo(){
    }
    public static void main(String[]args){
    BorderLayoutDemo bld = new BorderLayoutDemo();
    bld.setLayout (new BorderLayout(20,20));
    bld.add(new Button("NORTH"), BorderLayout.NORTH);
    bld.add(new Button("SOUTH"), BorderLayout.SOUTH);
    bld.add(new Button("EAST"), BorderLayout.EAST);
    bld.add(new Button("WEST"), BorderLayout.WEST);
    bld.add(new Button("CENTER"), BorderLayout.CENTER);
    bld.setSize(400,400);
    bld.setVisible(true);
    }
}
