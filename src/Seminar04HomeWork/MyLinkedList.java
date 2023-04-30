package Seminar04HomeWork;

import java.util.ArrayList;

public class MyLinkedList {
    private ArrayList<Integer> arr = new ArrayList<>();
    private int maxLength = 150;
    private int minLength = 10;
    private int lastElement = 0;
    private int firstElement = 0;

    int size() {
        return arr.size();
    }

    boolean empty() {
        return arr.isEmpty();
    }

    void enqueue(int element) {
        if (arr.size() == maxLength) {
            maxLength += 10;
        }
        arr.add(element);
    }

    Integer dequeue() {
        if (arr.isEmpty()) {
            return null;
        }

        Integer first = arr.get(0);
        arr.remove(0);

        if (arr.size() < maxLength && arr.size() > minLength) {
            maxLength -= 10;
        }

        return first;
    }

    Integer first() {
        if (arr.isEmpty()) {
            return null;
        }

        return arr.get(0);
    }

    void print() {
        for (Integer element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
