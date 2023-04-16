package Seminar01;
import java.util.Scanner;

// Task_1
// Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров.
// На какой день улитка доползёт до вершины шеста?
// Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
// Программа должна вывести одно натуральное число.
// Sample Input 1:
// 10
// 3
// 2
// Sample Output 1:
// 8

public class task_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту шеста: ");
        String word = sc.nextLine();
        int h = Integer.parseInt(word);
        System.out.println("Введите размер подьема за день: ");
        String word_1 = sc.nextLine();
        int a = Integer.parseInt(word_1);
        System.out.println("Введите размер спуска за ночь: ");
        String word_2 = sc.nextLine();
        int b = Integer.parseInt(word_2);
        int start = 0;
        int counter = 1;
        while (start + a < h) {
            counter ++;
            start = start + a - b;
        }
        System.out.println(counter);
    }
}
