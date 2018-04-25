/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard.MVC_Schedule;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Carlos Guisao
 */
public class ScheduleController extends AbstractTableModel{
    
    
    public ScheduleController(List list) {
        this.headerList = new String[] 
            {"ID", "Lab ID", "Reservation Start", "Reservation End"};
        this.wordsList = list;
    }
    
    @Override
    public int getRowCount() {
        return wordsList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        ScheduleModel lab;
        
        lab = (ScheduleModel) wordsList.get(row);
        
        switch(column){
            case 0:
                return lab.getId();
            case 1:
                return lab.getLabId();
            case 2:     
                return lab.getReservationStart();
            case 3:
                return lab.getReservationEnd();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int col) {
        return headerList[col];
    }
    
    List wordsList;
    String[] headerList;
}
