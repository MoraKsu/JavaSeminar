package Seminar03HomeWork;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
// Collections.max()

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите список чисел через пробел: ");
        String input = scanner.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : input.split(" ")) {
            numbers.add(Integer.parseInt(s));
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double average = 0;
        for (double number : numbers) {
            average += number;
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее арифметическое: " + average / numbers.size());
    }
}
