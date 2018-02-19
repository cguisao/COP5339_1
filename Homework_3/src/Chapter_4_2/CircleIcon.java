/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_4_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;

/**
 *
 * @author Carlos Guisao
 */
public class CircleIcon implements Icon 
{
    private final int size;
    private Color color;

    /**
     * @param aSize
     * @param aColor */
    
    public CircleIcon(int aSize, Color aColor)
    {
       size = aSize;
       color = aColor;
    }
 
    @Override
    public int getIconWidth()
    {
       return size;
    }
 
    @Override
    public int getIconHeight()
    {
       return size;
    }
 
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
       Graphics2D g2 = (Graphics2D) g;
       Ellipse2D.Double circle = new Ellipse2D.Double(x, y,
             size, size);
       g2.setColor(color);
       g2.fill(circle);
       g2.draw(circle);
    }
    
    void setColor(int i) {
        Color[] colors = {Color.green, Color.blue, Color.red};
        try {
            color = colors[i];
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Index must be in {0,1,2}");
        }
    }
}
