package Seminar02HomeWork;

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [2,1,0] result “abc”

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string S: ");
        String s = scanner.nextLine();
        System.out.println("Input array Index: ");
        String[] indexString = scanner.nextLine().split(" ");
        int[] index = new int[indexString.length];
        for (int i = 0; i < indexString.length; i++) {
            index[i] = Integer.parseInt(indexString[i]);
        }
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[index[i]] = s.charAt(i);
        }
        System.out.println("Result: " + new String(result));
    }
}
