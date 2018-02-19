/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_3;

/**
 *
 * @author Carlos Guisao
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complex variable_1 = new Complex(3, 2),
                variable_2 = new Complex(3, -2);
        
        System.out.println(variable_1.toString());
        System.out.println(variable_2.toString());
        
        Complex sum         = variable_1.add(variable_2),
                difference  = variable_1.sub(variable_2),
                multiplying = variable_1.mult(variable_2),
                Dividing    = variable_1.div(variable_2),
                conjugate1  = variable_1.conj(),
                conjugate2  = variable_1.conj();
        
        System.out.println("Testing that the functions work:");
        System.out.println("Adding");
        System.out.println(variable_1.toString() + " + " + variable_2.toString() + " = " +  sum.toString());
        
        System.out.println("Substracting");
        System.out.println(variable_1.toString() + " - " + variable_2.toString() + " = " +  difference.toString());
        
        System.out.println("Multiplying");
        System.out.println(variable_1.toString() + " * " + variable_2.toString() + " = " +  multiplying.toString());
        
        System.out.println("Dividing");
        System.out.println(variable_1.toString() + " / " + variable_2.toString() + " = " +  Dividing.toString());
        
        System.out.println("Conjugate of " + variable_1.toString() + " = " + conjugate1.toString());
        System.out.println("Conjugate of " + variable_2.toString() + " = " + conjugate2.toString());
        
    }
}
