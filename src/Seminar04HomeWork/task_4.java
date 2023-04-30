package Seminar04HomeWork;

import java.util.Random;

// *реализовать вторую задачу через собственный класс используя в основе массив

final class Dequeue {
    public int firstElem;
    public int[] array;

    public Dequeue(int firstElem, int[] array) {
        this.firstElem = firstElem;
        this.array = array;
    }
}

public class task_4 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] array = createArray();
        printArray(array);
        System.out.println("Shift Array");
        printArray(enqueue(array));
        Dequeue dq = dequeue(array);
        System.out.printf("First num is %d\n", dq.firstElem);
        System.out.println("Array without first num");
        printArray(dq.array);
        System.out.printf("First num is %d\n", first(array));
    }

    public static int[] createArray() {
        int size = random.nextInt(20) + 10;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = random.nextInt(100);
        }
        return res;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.printf("%d, ", i);
        System.out.println();
    }

    public static int[] enqueue(int[] arr) {
        int firstElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstElem;
        return arr;
    }

    public static Dequeue dequeue(int[] arr) {
        int[] array = new int[arr.length - 1];
        System.arraycopy(arr, 1, array, 0, array.length);
        int firstElem = arr[0];
        return new Dequeue(firstElem, array);
    }

    public static int first(int[] arr) {
        return arr[0];
    }

}
