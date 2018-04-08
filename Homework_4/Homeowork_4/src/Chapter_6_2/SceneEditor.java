/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_6_2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Carlos Guisao
 */
public class SceneEditor
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      final SceneComponent scene = new SceneComponent();

      JButton houseButton = new JButton("House");
      houseButton.addActionListener((ActionEvent event) -> {
          scene.add(new HouseShape(20, 20, 50));
      });

      JButton carButton = new JButton("Car");
      carButton.addActionListener((ActionEvent event) -> {
          scene.add(new CarShape(20, 20, 50));
      });

      JButton removeButton = new JButton("Remove");
      removeButton.addActionListener((ActionEvent event) -> {
          scene.removeSelected();
      });

      JPanel buttons = new JPanel();
      buttons.add(houseButton);
      buttons.add(carButton);
      buttons.add(removeButton);

      frame.add(scene, BorderLayout.CENTER);
      frame.add(buttons, BorderLayout.NORTH);

      frame.setSize(500, 500);
      frame.setVisible(true);
   }
}
