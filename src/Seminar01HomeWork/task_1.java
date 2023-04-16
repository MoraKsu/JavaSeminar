package Seminar01HomeWork;
import java.util.*;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

public class task_1 {
    public static void main(String[] args){
        Scanner ch = new Scanner(System.in);
        System.out.println("Input number:  ");
        int num = Integer.parseInt(ch.nextLine());
        triangle_num(num);
        System.out.println();
    }

    static void triangle_num(int n) {
        int tr_num = 0;
        for (int i = 0; i <= n; i++) {
            tr_num += i;
        }
        System.out.printf("%d triangular number: %d", n, tr_num);
    }
}
