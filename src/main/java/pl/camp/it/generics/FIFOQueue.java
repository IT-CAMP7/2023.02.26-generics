package pl.camp.it.generics;

import java.util.ArrayList;
import java.util.List;

public class FIFOQueue<T extends Comparable<T>> {
    List<T> queue = new ArrayList<>();

    public void push(T element) {
        this.queue.add(element);
    }

    public T pop() {
        T element = this.queue.get(0);
        this.queue.remove(0);
        return element;
    }

    public void sort() {
        int x = this.queue.get(0).compareTo(this.queue.get(1));
    }
}
