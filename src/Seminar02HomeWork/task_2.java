package Seminar02HomeWork;

// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
// потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк -
// вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который
// следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными
// буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание.
// ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
// Sample Input:
// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:
// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.


import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n-rows value: ");
        int n = scanner.nextInt();
        System.out.println("Input recipe from book: ");
        scanner.nextLine();
        String[] book = new String[n];
        for (int i = 0; i < n; i++) {
            book[i] = scanner.nextLine();
        }
        System.out.print("Input m-rows product value: ");
        int m = scanner.nextInt();
        System.out.println("Input your product (allergyProduct - replacementProduct): ");
        scanner.nextLine();
        String[] allergies = new String[m];
        String[] replacements = new String[m];
        for (int i = 0; i < m; i++) {
            String[] line = scanner.nextLine().split(" - ");
            allergies[i] = line[0];
            replacements[i] = line[1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                book[i] = book[i].replaceAll(allergies[j], replacements[j]);
                book[i] = book[i].replaceAll(capitalize(allergies[j]), capitalize(replacements[j]));
            }
            System.out.println(book[i]);
        }
    }

    private static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
        }
}
