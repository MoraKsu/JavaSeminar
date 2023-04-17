package Seminar01HomeWork;

import java.util.Scanner;

// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - вычесть
// 3 - умножить
// 4 - разделить

public class task_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num_1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num_2 = sc.nextInt();
        System.out.print("Введите оперцию(+,-,*,/): ");
        String operation = sc.next();
        char symbol = operation.charAt(0);
        int value;
        if (symbol == '+'){
            value = num_1 + num_2;
            System.out.println("Ответ: " + value);
        }
        else if (symbol == '-'){
            value = num_1 - num_2;
            System.out.println("Ответ: " + value);
        }
        else if (symbol == '*'){
            value = num_1 * num_2;
            System.out.println("Ответ: " + value);
        }
        else if (symbol == '/'){
            value = num_1 / num_2;
            System.out.println("Ответ: " + value);
        }
        else{
            System.out.println("Неверная операция!");
        }
    }
}
