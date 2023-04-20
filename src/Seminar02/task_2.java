package Seminar02;

// Task_2
// Формат входных данных:
// На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова,
// которые написаны в газете.
// Формат выходных данных:
// На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.
// Sample Input:
// а
// в
// Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
// Sample Output:
// 7
// 5

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter letter Маша:  ");
        String mLetter = sc.nextLine();
        System.out.println("enter letter Олег:  ");
        String oLetter = sc.nextLine();
        System.out.println("enter string words:  ");
        String strWords = sc.nextLine();
        String[] arrWords = strWords.split(" ");
        int countM = 0;
        int countO = 0;
        for (int i = 0; i < arrWords.length; i++) {
            if (arrWords[i].indexOf(mLetter) != -1) {
                countM++;
            }
            if (arrWords[i].indexOf(oLetter) != -1) {
                countO++;
            }
        }
        System.out.println(countM);
        System.out.println(countO);
    }
}
