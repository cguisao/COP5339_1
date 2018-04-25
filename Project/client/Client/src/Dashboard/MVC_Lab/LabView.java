/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard.MVC_Lab;

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
public class LabView {
    
    public static JScrollPane LabView() {
        
        mapType = new TypeReference<List<LabModel>>() {};
    	List<LabModel> model = null;
        
        String URL = RESTCaller.url + "/getAllLabs/";
        ObjectMapper objectMapper = new ObjectMapper();
        URL = callURL(URL);
        System.out.println("\n============Output:============ \n" + URL);
        try {
            model = objectMapper.readValue(URL, mapType);
        } catch (IOException ex) {
            Logger.getLogger(GuiUserReservationsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JTable table = new JTable();
        table.setRowHeight(30);
        LabController controller = new LabController(model);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setModel(controller);
        
        return scrollPane;
    }
    
    public static TypeReference<List<LabModel>> mapType;
}
