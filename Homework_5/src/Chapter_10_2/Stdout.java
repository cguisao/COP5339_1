/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_10_2;

import java.io.PrintStream;

/**
 *
 * @author Carlos Guisao
 */
public class Stdout {

    public static void main(String[] args) {
        Stdout out = Stdout.getInstance();
        out.printLine("Hello, Carlos!!");
    }

    public void printLine(String s) {
        stream.println(s);
    }

    public static Stdout getInstance() {
        return instance;
    }

    private Stdout() {
        stream = System.out;
    }

    private final PrintStream stream;
    private static final Stdout instance = new Stdout();
}
