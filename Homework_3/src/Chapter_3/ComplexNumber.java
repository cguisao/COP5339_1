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
public interface ComplexNumber {
    double r();
    double i();
    Complex add(Complex c);
    Complex sub(Complex c);
    Complex conj();
    Complex mult(Complex c);
    Complex div(Complex c);
    boolean equals(Complex c);
}
