/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_10_1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Carlos Guisao
 * @param <E>
 */
public class LQueue <E> implements MyQueue <E> {

    public LQueue() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(E e) {
        queue.add(e);
    }

    @Override
    public void addAll(Collection<? extends E> c) {
        queue.addAll(c);
    }

    @Override
    public E head() {
        try {
            return queue.element();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("queue is empty");
        }
    }

    @Override
    public E dequeue() {
        try {
            return queue.removeFirst();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("queue is empty");
        }
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    private final LinkedList <E> queue;
}
