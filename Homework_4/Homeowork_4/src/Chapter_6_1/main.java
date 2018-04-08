/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_6_1;

/**
 *
 * @author Carlos Guisao
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test implemented here.
        Manager manager = new Manager();
        
        manager.addEmployee("Carlos", "Guisao");
        manager.addSalary(150);
        manager.addBonus(50);
        System.out.println(manager.toString());
        
    }
}
