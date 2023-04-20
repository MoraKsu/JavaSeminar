package Seminar02;

// Task_4
// Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. Найдите, сколько раз в тексте
// встречается введённый символ в любом регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.
// Sample Input:
// Good morning my dear friend. My fish.
// m
// Sample Output:
// 3

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text:  ");
        String userText = sc.nextLine().toLowerCase();
        System.out.println("enter char:  ");
        String userChr = sc.nextLine().toLowerCase();
        String[] textArr = userText.split("");
        int count = 0;
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i].equals(userChr)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
