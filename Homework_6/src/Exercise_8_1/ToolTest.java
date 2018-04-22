/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_8_1;

/**
 *
 * @author Carlos Guisao
 */
public class ToolTest {
    public static void main(String[] args) {
     
        Graph toolBox = new Graph();

        toolBox.add(new Eraser());
        toolBox.add(new Pencil());
        toolBox.add(new Protractor());
        toolBox.add(new Ruler());
        toolBox.add(new Paper());
        toolBox.add(new Eraser());
        
        toolBox.printAll();;
        
    }
}
