/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_4_3;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

/**
 *
 * @author carlo
 */
public class ShapeIcon implements Icon
 {
    public ShapeIcon(MoveableShape[] shapes,
       int width, int height)
    {
       this.shapes = shapes;
       this.width = width;
       this.height = height;
    }
    
    @Override
    public int getIconWidth()
    {
       return width;
    }
 
    @Override
    public int getIconHeight()
    {
       return height;
    }
 
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
   {
       Graphics2D g2 = (Graphics2D) g;
       for(MoveableShape shape : shapes) {
            shape.draw(g2);
        }
    }
 
    private final int width;
    private final int height;
    private final MoveableShape[] shapes;
 }
