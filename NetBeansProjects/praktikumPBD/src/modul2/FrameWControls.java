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
public class FrameWControls extends Frame {
    public FrameWControls(){
    }
    
    public static void main(String[] args) {
        FrameWControls fwc = new FrameWControls();
        fwc.setLayout(new FlowLayout());
        fwc.setSize(600,600);
        fwc.add( new Button("Test Me!"));
        fwc.add( new Label("Label"));
        fwc.add(new TextField());
        CheckboxGroup cbg = new CheckboxGroup();
        fwc.add(new Checkbox ("chk1",cbg,true));
        fwc.add(new Checkbox ("chk2",cbg,false));
        fwc.add(new Checkbox ("chk3",cbg, false));
        List list = new List(3, false);
        list.add("MTV");
        list.add("V");
        fwc.add(list);
        Choice chooser = new Choice();
        chooser.add("Avril");
        chooser.add("Monica");
        chooser.add("Britney");
        fwc.add(chooser);
        fwc.add(new Scrollbar());
        fwc.setVisible(true);
    }
}
