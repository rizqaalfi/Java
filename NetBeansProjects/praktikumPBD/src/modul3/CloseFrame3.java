/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author RIZQA ALFIANI
 */
class CloseFrame3 extends Frame {
    Label label;
    CloseFrame3(String title){
        super (title);
        label = new Label("Close the frame");
        this.addWindowListener(new CFListener());
    }
    void launchFrame(){
        setSize(300,300);
        setVisible(true);
    }
    class CFListener extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            dispose();
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        CloseFrame cf = new CloseFrame("Close Window Exaple");
        cf.launchFrame();
    }
}
