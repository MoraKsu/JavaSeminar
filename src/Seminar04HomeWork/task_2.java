package Seminar04HomeWork;

import java.util.*;

    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди,
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    // first() - возвращает первый элемент из очереди, не удаляя.

public class task_2 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        for (int i = 0; i < 50; i++) {
            list.enqueue(i);
        }

        list.print();

        System.out.println(list.dequeue());
        System.out.println(list.dequeue());

        System.out.println("Start size: " + list.size());
        int currentSize = list.size();

        for (int i = 0; i < currentSize ; i++) {
            System.out.print(list.dequeue() + " ");
        }
        list.print();
        System.out.println("Current size: " + list.size());
    }
}
