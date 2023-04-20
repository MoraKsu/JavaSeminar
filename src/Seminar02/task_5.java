package Seminar02;

// Task_5
// Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю, что знаки препинания и пробелы,
// например. не являются ни тем ни другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе
// выведите "Letter". Если же их равное количество, то выведите слово "Equal".
// Sample Input:
// 34Hi56
// Sample Output:
// Digit

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text: ");
        String userText = sc.nextLine();
        int countDig = 0;
        int countLet = 0;

        char[] textArr = userText.toCharArray();
        for (int i = 0; i < textArr.length; i++) {
            if (Character.isDigit(textArr[i])) {
                countDig++;
            } else if (Character.isLetter(textArr[i])) {
                countLet++;
            }
        }

        if (countDig > countLet) {
            System.out.println("Digit " + countDig);
        } else {
            System.out.println("Letter " + countLet);
        }
    }
}
