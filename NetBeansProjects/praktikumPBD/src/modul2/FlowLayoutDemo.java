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
public class FlowLayoutDemo extends Frame {
    public FlowLayoutDemo(){
    }
    public static void main(String[] args) {
        FlowLayoutDemo fld = new FlowLayoutDemo();
        fld.setLayout( new FlowLayout( FlowLayout.RIGHT,10,10));
        fld.add(new Button("ONE"));
        fld.add(new Button("TWO"));
        fld.add(new Button("THREE"));
        fld.setSize(100,100);
        fld.setVisible(true);
    }
}
