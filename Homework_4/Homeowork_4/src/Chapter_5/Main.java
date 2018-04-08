/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5;

/**
 *
 * @author Carlos Guisao
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControllerOld model = new ControllerOld();
        View view = new View(model);
        model.addObserver(view);
    }
    
}
