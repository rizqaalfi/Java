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
public class MouseEventsDemo extends Frame implements MouseListener,MouseMotionListener{
    TextField tf;
    public MouseEventsDemo(String title){
        super(title);
        tf = new TextField(60);
        addMouseListener(this);
    }
    public void launchFrame(){
        add(tf,BorderLayout.SOUTH);
        setSize(300,300);
        setVisible(true);
    
    }
    public void mouseClicked(MouseEvent me){
        String msg= "Mouse clicked";
        tf.setText(msg);
    }
    public void mouseEntered(MouseEvent me){
        String msg = "Mouse entered component";
        tf.setText(msg);
    }
    public void mouseExited(MouseEvent me){
        String msg =" Mouse Exited component";
        tf.setText(msg);
    }
    public void mousePressed(MouseEvent me){
        String msg = "Mouse Pressed";
        tf.setText(msg);
    }
    public void mouseReleased(MouseEvent me){
        String msg = "Mouse released";
        tf.setText(msg);
        }
    public void mouseDragged(MouseEvent me){
        String msg = "Mouse Dragged at" + me.getX()+ "," + me.getY();
        tf.setText(msg);
    }
    public void mouseMoved(MouseEvent me){
        String msg = "Mouse moved at " + me.getX()+ "," + me.getY();
        tf.setText(msg);
    }
    public static void main(String[] args){
    MouseEventsDemo med = new MouseEventsDemo("Mouse Events Demo");
    med.launchFrame();
    }
}

