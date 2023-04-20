package Seminar02;

import java.util.Scanner;

// Task_1
// Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. Определите индексы первого и последнего её вхождения.
// Sample Input:
// 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
// 4
// Sample Output:
// 0
// 14

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array:   ");
        String userStr = sc.nextLine();
        System.out.println("Input number:   ");
        String userNum = sc.nextLine();
        userStr = userStr.replace(" ", "");
        System.out.println("first index userNum = " + userStr.indexOf(userNum));
        System.out.println("last index userNum = " + userStr.lastIndexOf(userNum));
    }
}
