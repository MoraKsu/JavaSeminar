package Seminar04HomeWork;

import java.util.Iterator;
import java.util.LinkedList;

// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

public class task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = task_1.createLL();
        System.out.println("LinkedList: " + ll);
        int sum = sumLinkedList(ll);
        System.out.println("Sum of elements: " + sum);

    }

    public static int sumLinkedList(LinkedList<Integer> ll) {
        Iterator<Integer> it = ll.iterator();
        int sum = 0;
        while (it.hasNext()) {
            sum += it.next();
        }
        return sum;
    }
}
