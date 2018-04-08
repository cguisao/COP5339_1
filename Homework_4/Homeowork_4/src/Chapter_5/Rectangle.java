/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.Icon;

/**
 *
 * @author Carlos Guisao
 */
public class Rectangle implements Icon {
    private int width;
    private final int HEIGHT = 60;
    private final Color color;
    
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
    
    public Rectangle(Color c) {
        width = 0;
        color = c;
    }
    public void SetWidth(int percentage) {
        double p = (double)percentage / 100.0;
        width = (int)Math.floor(360 * p);
    }
}
