/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_6_2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Carlos Guisao
 */
public class SceneComponent extends JComponent
{
   public SceneComponent()
   {
      shapes = new ArrayList<>();

      addMouseListener(new
         MouseAdapter()
         {
            @Override
            public void mousePressed(MouseEvent event)
            {
               mousePoint = event.getPoint();
               shapes.stream().filter((s) -> (s.contains(mousePoint))).forEachOrdered((s) -> {
                   s.setSelected(!s.isSelected());
                });
               repaint();
            }
         });

        addMouseMotionListener(new
         MouseMotionAdapter()
         {
            @Override
            public void mouseDragged(MouseEvent event)
            {
               Point lastMousePoint = mousePoint;
               mousePoint = event.getPoint();
               shapes.stream().filter((s) -> (s.isSelected())).forEachOrdered((s) -> {
                   double dx = mousePoint.getX() - lastMousePoint.getX();
                   double dy = mousePoint.getY() - lastMousePoint.getY();
                   s.translate((int) dx, (int) dy);
                });
               repaint();
            }
         });
   }

   /**
      Adds an shape to the scene.
      @param s the shape to add
   */
   public void add(SceneShape s)
   {
      shapes.add(s);
      repaint();
   }

   /**
      Removes all selected shapes from the scene.
   */
   public void removeSelected()
   {
      for (int i = shapes.size() - 1; i >= 0; i--)
      {
         SceneShape s = shapes.get(i);
         if (s.isSelected()) shapes.remove(i);
      }
      repaint();
   }

   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      shapes.stream().map((s) -> {
          s.draw(g2);
           return s;
       }).filter((s) -> (s.isSelected())).forEachOrdered((s) -> {
           s.drawSelection(g2);
       });
   }

   private ArrayList<SceneShape> shapes;
   private Point mousePoint;
}