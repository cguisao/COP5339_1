/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard.Factory;

import static Dashboard.MVC_Lab.LabView.LabView;
import Login.MVC.User;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Carlos Guisao
 */
public class GuiUserReservationsPanel implements Panel{

    public GuiUserReservationsPanel(User user) {
        this.panel = new JPanel();
    }
    
    @Override
    public JComponent GetPanel(int x, int y){

        panel.setPreferredSize(new Dimension(x, y));
        panel.setLayout(new GridLayout(0,1));
        panel.setBackground(Color.WHITE);

        panel.setBorder (BorderFactory.createTitledBorder 
                
        (BorderFactory.createEtchedBorder (), "All Laboratories", TitledBorder.CENTER, TitledBorder.TOP, 
                new Font("times new roman",Font.BOLD,20)));

        panel.add(LabView());

        panel.setLayout(new GridLayout(0,1));
        panel.setBackground(Color.WHITE);

        return panel;
    }
    
    private final JPanel panel;
}
