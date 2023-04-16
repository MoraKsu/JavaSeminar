package Seminar01;
import java.util.*;

// Task_7
// Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том
// порядке, в котором они встречаются в списке.
// Входные данные
// Вводится список чисел. Все числа списка находятся на одной строке.
// Выходные данные
// Выведите ответ на задачу.
// Sample Input:
// 6
// 1
// 2
// 2
// 3
// 3
// 3
// Sample Output:
// 1

public class task_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // вводим количество элементов
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // вводим сам список
        }
        Map<Integer, Integer> countMap = new LinkedHashMap<>(); // создаем Map для подсчета количества повторений
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            if (countMap.containsKey(current)) {
                countMap.put(current, countMap.get(current) + 1);
            } else {
                countMap.put(current, 1);
            }
        }
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            if (countMap.get(current) == 1) { // если элемент встречается только один раз
                System.out.println(current); // выводим его на экран
            }
        }
    }
}
