package Seminar04HomeWork;

import java.util.LinkedList;
import java.util.ListIterator;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = createLL();
        System.out.println(ll);
        LinkedList<Integer> ll_rev = listRevers(ll);
        System.out.println(ll_rev);
    }

    public static LinkedList<Integer> createLL() {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(i + 1);
        }
        return ll;
    }

    static LinkedList<Integer> listRevers(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            newList.add(iterator.previous());
        }
        return newList;
    }
}
