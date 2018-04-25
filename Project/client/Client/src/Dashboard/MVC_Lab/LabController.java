/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard.MVC_Lab;

import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Carlos Guisao
 */
public class LabController extends AbstractTableModel{

    public LabController(List list) {
        wordsList = list;
        lab = new LabModel();
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
        
        lab = (LabModel) wordsList.get(row);
        
        switch(column){
            case 0:
                return lab.getId();
            case 1:
                return lab.getName();
            case 2:     
                return lab.getLocation();
            case 3:
                return lab.getAccommodations();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int col) {
        return headerList[col];
    }
    
    public JScrollPane updateView(){
        return LabView.LabView();
    }
    
    List wordsList;
    String[] headerList = new String[] {"ID", "Name", "Location", "Accomodations"};
    private LabModel lab;
}
