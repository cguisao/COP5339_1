package Chapter_4_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Guisao
 */
/**
06:    This program implements an animation that moves
07:    a car shape.
08: */
public class main
 {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        final MoveableShape[] shapes = {
                new CarShape(0, 0, CAR_WIDTH), new CarShape(0, 100, CAR_WIDTH),
                new CarShape(0, 200, CAR_WIDTH), new CarShape(0, 300, CAR_WIDTH)
        };

        ShapeIcon icon = new ShapeIcon(shapes,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, new
                ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        for (MoveableShape shape : shapes) {
                            shape.translate(1, 0);
                        }
                        label.repaint();
                    }
                });
        t.start();
    }

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 400;
    private static final int CAR_WIDTH = 100;
}