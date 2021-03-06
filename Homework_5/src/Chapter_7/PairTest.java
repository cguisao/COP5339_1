/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Carlos Guisao
 */
public class PairTest {
    public static void main(String[] args) throws Exception {
        ArrayList<Pair> pairs = deserializePairs();
        showPairData(pairs);
        serializePairs(pairs);
    }

    /**
     * Reads a file of serialized Pairs and generates an ArrayList of them.
     * If no serialized Pairs exist yet, random Pairs are generated.
     * @return An ArrayList of Pairs
     * @throws Exception on input stream errors
     * @see #serializePairs(ArrayList)
     */
    private static ArrayList<Pair> deserializePairs() throws Exception {
        FileInputStream fis;
        ObjectInputStream ois;
        ArrayList<Pair> pairs;
        try {
            fis = new FileInputStream("object.ser");
            ois = new ObjectInputStream(fis);
            pairs = new ArrayList<>();
            boolean done = false;
            while (!done) {
                try {
                    pairs.add((Pair) ois.readObject());
                } catch (EOFException e) {
                    done = true;
                }
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            pairs = Utils.randomPairsWithClone();
        }
        return pairs;
    }

    /**
     * Helper function that demonstrates all the required Pair methods.
     * @param pairs ArrayList of Pairs to be used for the demonstration.
     * Note: clone() is used when the Pairs are generated. The Pairs are
     *       ordered such that the first and third Pair in the ArrayList
     *       are clones.
     * @see Utils randomPairsWithClone()
     */
    private static void showPairData(ArrayList<Pair> pairs) {
        pairs.stream().map((Pair pair) -> {
            System.out.println("      Key: " + pair.k());
            return pair;
        }).map((pair) -> {
            System.out.println("    Value: " + pair.v());
            return pair;
        }).map((pair) -> {
            System.out.println("To String: " + pair.toString());
            return pair;
        }).forEachOrdered((pair) -> {
            System.out.println("Hash Code: " + pair.hashCode() + "\n");
        });

        System.out.println("First ==  Third: " + pairs.get(0).equals(pairs.get(2))); // should be true
        System.out.println("First == Second: " + pairs.get(0).equals(pairs.get(1)));// should be false
    }

    /**
     * Serializes Pairs and saves them to a file.
     * @param pairs Pairs to be serialized.
     * @throws Exception on output stream errors
     * @see #deserializePairs()
     */
    private static void serializePairs(ArrayList<Pair> pairs) throws Exception {
        try (FileOutputStream fos = new FileOutputStream("object.ser"); 
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Pair pair : pairs) {
                oos.writeObject(pair);
            }
        }
    }
}
