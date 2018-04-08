/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Carlos Guisao
 */
public class View implements Observer {
    private final ControllerOld controller;
    private JTextField textField_1, textField_2, textField_3;
    private JPanel textPanel, graphPanel;
    private Rectangle progressiveBar_1, progressiveBar_2, progressiveBar_3;
    private JLabel label_1, label_2, label_3;

    public View(ControllerOld m) {
        controller = m;
        Bars();
        Fields();
        Panels();
        Frames();
    }
    
    private void Bars() {
        progressiveBar_1 = new Rectangle(Color.ORANGE);
        progressiveBar_2 = new Rectangle(Color.MAGENTA);
        progressiveBar_3 = new Rectangle(Color.pink);
        label_1 = new JLabel(progressiveBar_1);
        label_2 = new JLabel(progressiveBar_2);
        label_3 = new JLabel(progressiveBar_3);
    }
    
    private void ModelRefactor(int barIndex, String value) {
        try {
            controller.SetBar(barIndex, value);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value: '" + value + "' " + e);
        }
    }

    private void Fields() {
        textField_1 = Controller(()->ModelRefactor(0, textField_1.getText()));
        textField_2 = Controller(()->ModelRefactor(1, textField_2.getText()));
        textField_3 = Controller(()->ModelRefactor(2, textField_3.getText()));
        
    }

    private void Panels() {
        textPanel = new JPanel(); graphPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
        graphPanel.setLayout(new BoxLayout(graphPanel, BoxLayout.PAGE_AXIS));
        textPanel.add(textField_1);
        textPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        textPanel.add(textField_2);
        textPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        textPanel.add(textField_3);
        graphPanel.add(label_1);
        graphPanel.add(label_2);
        graphPanel.add(label_3);
    }

    private void Frames() {
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(720, 330));
        frame.setLayout(new GridLayout(1, 2));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(textPanel);
        frame.add(graphPanel);
        frame.pack();
        frame.setVisible(true);
    }
    
    @Override
    public void update(Observable o, Object o1) {
        int[] values = controller.GetBar();
        progressiveBar_1.SetWidth(values[0]);
        progressiveBar_2.SetWidth(values[1]);
        progressiveBar_3.SetWidth(values[2]);
        label_1.revalidate(); label_1.repaint();
        label_2.revalidate(); label_2.repaint();
        label_3.revalidate(); label_3.repaint();
    }
    
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
