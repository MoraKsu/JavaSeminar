package Seminar03HomeWork;

// *Реализовать алгоритм сортировки слиянием
/* Мини-конспект логики работы сортировки слиянием:
    Принцип "разделяй и властвуй". Берется исходный массив и детиться попалам, и далее попалам, пока не останется один
    элемент в массиве. Массив из одного элемента считается упорядоченным, сравниваются соседние элементы и соединяются
    вместе, до тех пор, пока все элементы не будут остсортированы.
    Использованный источник https://tproger.ru/articles/algoritmy-sortirovki-na-java-s-primerami/#part3
 */

import java.util.Arrays;

public class task_4 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 3, 1, 6, 9, 4, 7 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }
}
