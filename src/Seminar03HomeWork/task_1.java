package Seminar03HomeWork;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Введите целые числа через пробел: ");
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        for (String number : inputNumbers) {
            numbers.add(Integer.parseInt(number));
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("Список без четных чисел: " + numbers);
    }
}
