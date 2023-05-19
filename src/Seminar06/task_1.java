package Seminar06;

import java.lang.reflect.Array;
import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька", 10, "Василий Петрович", "Мейнкун");
        Cat cat2 = new Cat("Мурзик", 8, "Петя", "Сфинкс");
        Cat cat3 = new Cat("Мурзик", 8, "Петя", "Сфинкс");
        Cat cat4 = new Cat("Василиса", 8, "Ксения", "Неизвестно");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);


        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println();
        for (Cat cat: cats){
            if (cat.getAge() == 8){
                System.out.println(cat);
            }
        }
    }

    static void ex1(){
        /*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
         */
        Integer[] arr = createArray(0, 24, 10);
        System.out.println(Arrays.toString(arr));
        double percent = unic(arr);
        System.out.println("Процент уникальных значений: " + percent);
    }
    static  double unic(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() * 100.0 / arr.length;
        return percent;
    }
    static Integer[] createArray(int min, int max, int capacity){
        Integer[] arr = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
    static void ex0(){
        // 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
        // 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
        // 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
        Integer[] arr = new Integer[]{3, 1, 2, 2, 6, 4, 5, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2= new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}

