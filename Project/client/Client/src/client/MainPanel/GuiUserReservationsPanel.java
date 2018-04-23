/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.MainPanel;

import static client.RESTCaller.callURL;
import client.model.LabDetails;
import client.model.TableLabModel;
import javax.swing.JScrollPane;
import client.model.User;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JTable;
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

    	TypeReference<List<LabDetails>> mapType = new TypeReference<List<LabDetails>>() {};
    	List<LabDetails> jsonToPersonList = null;
        String URL = "http://localhost:8181/faulms/getAllLabs/";
        jsonToPersonList = JSonList(jsonToPersonList, mapType, URL);
        
        panel.setBorder (BorderFactory.createTitledBorder 
                
        (BorderFactory.createEtchedBorder (), "All Laboratories", TitledBorder.CENTER, TitledBorder.TOP, 
                new Font("times new roman",Font.BOLD,20)));

        JTable table = new JTable();
        table.setRowHeight(30);
        TableLabModel model = new TableLabModel(jsonToPersonList);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setModel(model);
        panel.add(scrollPane);

        panel.setLayout(new GridLayout(0,1));
        panel.setBackground(Color.WHITE);

        return panel;
    }
    
    public static List<LabDetails> JSonList(List<LabDetails> jsonToPersonList
            , TypeReference<List<LabDetails>> mapType, String URL) {
        
        ObjectMapper objectMapper = new ObjectMapper();
        URL = callURL(URL);
        System.out.println("\n============Output:============ \n" + URL);
        try {
            jsonToPersonList = objectMapper.readValue(URL, mapType);
        } catch (IOException ex) {
            Logger.getLogger(GuiUserReservationsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jsonToPersonList;
    }
    
    private final JPanel panel;
}
