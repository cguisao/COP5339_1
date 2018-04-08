/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5_Different_Approach;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.Icon;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class Controller {
    
    private final int[] barValues = {0,0,0};
    private JTextField textField_1;
    
    public void SetBar(int barIndex, String value) {
        try {
            int intVal = (value.equals("")) ? 0 : Integer.parseInt(value);
            if (intVal < 0 || intVal > 100) {
                throw new IllegalArgumentException("Index out of bound ");
            }
            barValues[barIndex] = intVal;
            //setChanged();
            //notifyObservers();
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException("Index out of bound " + e);
        }
    }
    public int[] GetBar() {
        return barValues.clone();
    }
    
    public void SetTextPanel(JTextField j){
        textField_1 = j;
    }
    
    public JTextField GetTextPanel() {
        return textField_1;
    }
    
    public class Rectangle implements Icon {
        private int width;
        private final int HEIGHT = 60;
        private final Color color;

        public Rectangle(Color c) {
            width = 0;
            color = c;
        }

        @Override
        public int getIconHeight() {return HEIGHT;}

        @Override
        public int getIconWidth() {return width;}

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, HEIGHT);
            g2.setColor(color);
            g2.fill(rectangle);
            g2.draw(rectangle);
        }

        public void SetWidth(int percentage) {
            double p = (double)percentage / 100.0;
            width = (int)Math.floor(360 * p);
        }
    }
}
