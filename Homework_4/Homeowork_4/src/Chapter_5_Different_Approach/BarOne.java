/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5_Different_Approach;

import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class BarOne extends Observer {
    
    public BarOne(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        int field =0;
        Controller control = new Controller();
        View view = new View(control, field);
        //control.GetTextPanel();
        JTextField textField_1 = control.GetTextPanel();
        //frame.add(textPanel);
        //frame.add(graphPanel);
        
        subject.getState().add(textField_1);
    }
}
