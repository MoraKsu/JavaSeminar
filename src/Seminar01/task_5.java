package Seminar01;
import java.util.Scanner;

// Task_5
// Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.
// Входные данные
// Заданы три целых числа а, b, с, где a > b
// Выходные данные
// Выведите единственное число - ответ на задачу.
// Sample Input:
// 20
// 1
// 2
// Sample Output:
// 20
// 18
// 16
// 14
// 12
// 10
// 8
// 6
// 4
// 2

public class task_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Input b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Input c: ");
        int c = Integer.parseInt(sc.nextLine());
        for (int i = a; i >= b; i -= c) {
            System.out.println(i);
        }
    }
}
