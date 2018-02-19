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
public class Complex implements ComplexNumber {
    
    private final double real, imaginary;
    
    public Complex(double real, double imaginary) 
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public Complex(double real)
    {
        this.real = real;
        this.imaginary = 0.0;
    }
    
    /**
     *
     * @return a complex number using the real and imaginary number
     */
    @Override
    public String toString()
    {
        double currentReal = this.real;
        double currentImaginary = this.imaginary;
        String sign;
        
        if(currentImaginary > 0.0)
            sign = " + ";
        else
            sign = " - ";
        
        return "(" + Double.toString(currentReal) + sign + 
                Double.toString(Math.abs(currentImaginary)) + "i" + ")";
    }
    
    @Override
    public double r() {
        return real;
    }

    @Override
    public double i() {
        return imaginary;
    }

    @Override
    public Complex add(Complex c) {
        return new Complex(this.real+c.real, this.imaginary+c.imaginary);
    }

    @Override
    public Complex sub(Complex c) {
        return new Complex(this.real-c.real, this.imaginary-c.imaginary);
    }

    @Override
    public Complex conj() {
        return new Complex(real, -imaginary);
    }

    @Override
    public Complex mult(Complex c) {
        double newReal = (real * c.r()) - (imaginary * c.i());
        double newImag = (real * c.i()) + (imaginary * c.r());
        
        return new Complex(newReal, newImag);
    }

    @Override
    public Complex div(Complex c) {
         if (c.r() == 0.0 && c.i() == 0.0) {
            throw new IllegalArgumentException("Quit dividing by zero.");
        }
        Complex denominatorConjugate = c.conj();
        Complex numerator = mult(denominatorConjugate);
        Complex denominator = c.mult(denominatorConjugate);
        
        double newReal = numerator.r() / denominator.r();
        double newImag = numerator.i() / denominator.r();
        
        return new Complex(newReal, newImag);
    }

    @Override
    public boolean equals(Complex c) {
        return real == c.real && imaginary == c.imaginary;
    }
    
}
