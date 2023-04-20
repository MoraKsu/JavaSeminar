package Seminar02HomeWork;

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

import java.util.Scanner;

public class task_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the jewels: ");
        String jewels = sc.nextLine();
        System.out.print("Input the stones: ");
        String stones = sc.nextLine();
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            int jewelCount = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    jewelCount++;
                }
            }
            if (jewelCount > 0) {
                result.append(jewels.charAt(i)).append(jewelCount);
            }
        }

        System.out.println(result.toString());
    }
}
