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
public class Protractor implements Tool{
    @Override
    public String getName() {
        return "Protractor";
    }

    @Override
    public void use() {
        
        System.out.println("Using " + getName());
        
    }
    
}
