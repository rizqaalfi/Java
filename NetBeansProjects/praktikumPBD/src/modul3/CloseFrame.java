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
public class CloseFrame extends Frame implements WindowListener {
    Label label;
    CloseFrame(String title){
        super(title);
        label = new Label("Close the Frame");
        this.addWindowListener(this);
    }
    void launchFrame(){
        setSize(300,300);
        setVisible(true);
}
    public void windowActivated(WindowEvent e){
    }
    public void windowClosed(WindowEvent e){
    }
    public void windowClosing(WindowEvent e){
        setVisible(false);
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e){
    }
    public void windowDeiconified(WindowEvent e){
    }
    public void windowIconified(WindowEvent e){
    }
    public void windowOpened(WindowEvent e){
    }
    public static void main(String[] args){
        CloseFrame cf =new CloseFrame("Close Window Exaple");
        cf.launchFrame();
    }

}
