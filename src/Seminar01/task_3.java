package Seminar01;
import java.util.Scanner;

// Task_3
// В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
// По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
// Входные данные
// Программа получает на вход действительные числа x и y
// Выходные данные
// Программа должна вывести одно натуральное число.
// Sample Input:
// 10
// 20
// Sample Output:
// 9

public class task_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        String x = sc.nextLine();
        double dist = Double.parseDouble(x);
        System.out.println("Input y: ");
        String y = sc.nextLine();
        double req_dist = Double.parseDouble(y);
        int counter = 1;
        while (dist < req_dist) {
            dist = dist * 1.1;
            counter++;
        }
        System.out.println(counter);
    }
}
