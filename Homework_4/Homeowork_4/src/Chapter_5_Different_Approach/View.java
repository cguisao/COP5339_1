/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5_Different_Approach;

import Chapter_5.Rectangle;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author carlo
 */
public final class View {
    
    private Rectangle progressiveBar_1;
    private JLabel label_1;
    private JTextField textField_1;
    private JPanel textPanel, graphPanel;
    private final Controller control;
    
    public JTextField GetTextPanel() {
        return textField_1;
    }
    
    public void SetTextPanel(JTextField j){
        textField_1 = j;
    }
    
    public View(Controller c, int field) {
        control = c;
        Bars();
        Fields(field);
        Panels();
        //Frames();   
    }
    
    private void Bars() {
        progressiveBar_1 = new Rectangle(Color.ORANGE);
        label_1 = new JLabel(progressiveBar_1);
    }
    
    private void ModelRefactor(int barIndex, String value) {
        try {     
            control.SetBar(barIndex, value);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value: '" + value + "' " + e);
        }
        finally
        {
            int[] values = control.GetBar();  
            progressiveBar_1.SetWidth(values[0]);
            label_1.revalidate(); label_1.repaint();
        }
    }
    
    public void Fields(int i) {
        //control.SetTextPanel(textField_1);
        Controller(()->ModelRefactor(i, textField_1.getText()));
    }
    
    private void Panels() {
        textPanel = new JPanel(); graphPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
        graphPanel.setLayout(new BoxLayout(graphPanel, BoxLayout.PAGE_AXIS));
        //textPanel.add(textField_1);
        textPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        graphPanel.add(label_1);
    }
    
//    private void Frames() {
//        JFrame frame = new JFrame();
//        frame.setPreferredSize(new Dimension(720, 330));
//        frame.setLayout(new GridLayout(1, 2));
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.add(textPanel);
//        frame.add(graphPanel);
//        frame.pack();
//        frame.setVisible(true);
//    }
    
    private JTextField Controller(final Runnable function) {
        JTextField newField = new JTextField();
        newField.setMaximumSize(new Dimension(Integer.MAX_VALUE, newField.getPreferredSize().height));
        newField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                function.run();
            }
        });
        return newField;
    }
}