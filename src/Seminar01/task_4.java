package Seminar01;
import java.util.Scanner;

// Task_4
// Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
// n! = 1∙2∙3∙…∙ n.
// Sample Input:
// 5
// Sample Output:
// 120

public class task_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        String n = sc.nextLine();
        int fac_n = Integer.parseInt(n);
        var res = factor(fac_n);
        System.out.println(res);
    }
    static int factor(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * factor(n - 1);
        }
    }
}
