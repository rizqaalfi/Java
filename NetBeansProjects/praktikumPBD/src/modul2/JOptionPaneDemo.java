/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Acer
 */
public class JOptionPaneDemo {
    JOptionPane optionPane;
    public JOptionPaneDemo(){
    }
    void launchFrame(){
    optionPane = new JOptionPane();
    String name =optionPane.showInputDialog("Hi, what`s your name?");
    optionPane.showMessageDialog(null,"Nice to meet you," + name + ".",
            "Greeting..", optionPane.PLAIN_MESSAGE);
    System.exit(0);
    }
    public static void main(String[] args) {
        new JOptionPaneDemo().launchFrame();
    }
}
