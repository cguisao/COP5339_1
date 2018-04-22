/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Carlos Guisao
 */
public class Utils {

    public static void main(String[] args) {
        ArrayList<Pair> pairs = randomPairs(),
                        sorted = sortPairCollection(pairs);

        pairs.forEach((pair) -> {
            System.out.println(pairString(pair));
        });

        System.out.println();

        sorted.forEach((pair) -> {
            System.out.println(pairString(pair));
        });
    }

    /**
     * Sorts a collection of Pairs and returns them in an ArrayList
     * @param original Collection containing the Pairs to be sorted
     * @return An ArrayList of sorted Pairs
     * Note: This method is generic even though generic types do not
     *       need to be referred to explicitly in the method. This method
     *       works on any Pair regardless of the type of key or value.
     */
    public static ArrayList<Pair> sortPairCollection(Collection<Pair> original) {
        ArrayList<Pair> pairList = new ArrayList<>(original);
        Collections.sort(pairList);
        return pairList;
    }

    public static ArrayList<Pair> randomPairsWithClone() throws CloneNotSupportedException {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(randomIntPair());
        pairs.add(randomIntPair());
        pairs.add((Pair) pairs.get(0).clone()); // always have one clone so we can test it
        return pairs;
    }

    public static Pair randomIntPair() {
        Random random = new Random();
        return new Pair<>(random.nextInt(100), random.nextInt(100));
    }

    public static ArrayList<Pair> randomPairs() {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(randomIntPair());
        pairs.add(randomIntPair());
        pairs.add(randomIntPair());
        pairs.add(randomIntPair());
        pairs.add(randomIntPair());
        pairs.add(randomIntPair());
        return pairs;
    }

    public static String pairString(Pair pair) {
        return "("+pair.k()+", "+pair.v()+")";
    }
    private Utils() {}
}
