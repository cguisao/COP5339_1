/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5_Different_Approach;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author carlo
 */
public class main {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JTextField textField_1 = new JTextField(50);
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(720, 330));
        frame.setLayout(new GridLayout(1, 2));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.add(textField_1);
        
        Subject subject = new Subject();
        
        new BarOne(subject);
        new BarTwo(subject);
        
        System.out.println("I suck!!");
        subject.setState(frame);
        
        //model.addObserver(view);
    }
}
