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
public class CloseFrame2 extends Frame {
    Label label;
    CFListener w = new CFListener(this);
    
    CloseFrame2(String title){
        super(title);
        label = new Label ("Close the Frame");
        this.addWindowListener(w);
    }
    void launchFrame(){
        setSize(300,300);
        setVisible(true);
    }
}
   class CFListener extends WindowAdapter{
        CloseFrame2 ref;
        CFListener (CloseFrame2 ref){
        this.ref =ref;
        }  
        public void windowClosing (WindowEvent e){
        ref.dispose();
        System.exit(1);
    }
   
   public static void main(String[] args) {
        CloseFrame2 cf =new CloseFrame2("Close Window  Example");
        cf.launchFrame();
    }
}
