package Seminar04;

import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        ex4();
    }

    static void ex4(){
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(3);
        stack.push(7);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    static void ex3(){
        /*
        1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
         */
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        for (Integer integer: stack){
            System.out.println(integer);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        for (Integer integer: queue){
            System.out.println(integer);
        }
    }
    static void ex2(){
        /*
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work) {
            System.out.println("Введите команду");
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("До новых встреч");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }
        }
    }
    static void ex1(){
        /*
        Реализовать консольное приложение, которое:

        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work){
            System.out.println("Введите команду");
            String command = scanner.nextLine();
            String[] splitLine = command.split("~");
            switch (splitLine[0]){
                case "print":
                    System.out.println(list.remove(Integer.parseInt(splitLine[1])));
                    break;
                case "exit":
                    System.out.println("До новых встреч");
                    work = false;
                    break;
                default:
                    list.add(Integer.parseInt(splitLine[1]), splitLine[0]);
            }
        }
    }

    static void ex0(){
        /*
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.get(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
