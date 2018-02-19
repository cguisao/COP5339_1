/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_4_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Carlos Guisao
 */

public class Main {
    
    private static JButton createButton(int index, ActionListener actionListener) {
        String[] labels = {"Green", "Blue", "Red"};
        try {
            JButton button = new JButton(labels[index]);
            button.addActionListener(actionListener);
            return button;
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("index out of bound!");
        }
    }
    
     public static void main(String[] args) {
         
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        final CircleIcon icon = new CircleIcon(100, Color.green);
        final JLabel label = new JLabel(icon);
        JButton[] buttons = new JButton[3];
                
         for(int i=0; i< 3; i++) {
            final int j = i;
            buttons[i] = createButton(i, (ActionEvent e) -> {
                icon.setColor(j);
                label.repaint();
            });
            frame.add(buttons[i]);
        }
        
        Component add = frame.add(label);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
