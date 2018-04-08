/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5;

import java.util.Observable;

/**
 *
 * @author Carlos Guisao
 */
public class ControllerOld extends Observable {
    
    private final int[] barValues = {0,0,0};
    
    public void SetBar(int barIndex, String value) {
        try {
            int intVal = (value.equals("")) ? 0 : Integer.parseInt(value);
            if (intVal < 0 || intVal > 100) {
                throw new IllegalArgumentException("Index out of bound ");
            }
            barValues[barIndex] = intVal;
            setChanged();
            notifyObservers();
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException("Index out of bound " + e);
        }
    }
    public int[] GetBar() {
        return barValues.clone();
    }
}
