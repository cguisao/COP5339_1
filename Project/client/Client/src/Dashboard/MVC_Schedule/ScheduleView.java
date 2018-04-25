/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard.MVC_Schedule;

import Dashboard.Factory.GuiUserReservationsPanel;
import Helper.RESTCaller;
import static Helper.RESTCaller.callURL;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Carlos Guisao
 */
public class ScheduleView {
    
    public static JScrollPane JSonList(String lab) {
        
        TypeReference<List<ScheduleModel>> mapType = new TypeReference<List<ScheduleModel>>() {};
    	List<ScheduleModel> jsonToPersonList = null;
        String URL = RESTCaller.url + "viewlabRes/" + lab + "/";

        ObjectMapper objectMapper = new ObjectMapper();
        URL = callURL(URL);
        System.out.println("\n============Output:============ \n" + URL);
        try {
            jsonToPersonList = objectMapper.readValue(URL, mapType);
        } catch (IOException ex) {
            Logger.getLogger(GuiUserReservationsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JTable table = new JTable();
        table.setRowHeight(30);
        ScheduleController model = new ScheduleController(jsonToPersonList);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setModel(model);
        
        return scrollPane;
    }
}
