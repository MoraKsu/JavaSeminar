package Seminar05HomeWork;

import java.util.Arrays;

// *Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class task_3 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 6, 23, 12, 34, 0, 1, 3};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
