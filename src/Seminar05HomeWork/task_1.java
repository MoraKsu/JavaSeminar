package Seminar05HomeWork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге

public class task_1 {
    private Map<String, List<String>> book;
    public static void main(String[] args) {
        task_1 phoneBook = new task_1();
        phoneBook.add("Alice", "123456789");
        phoneBook.add("Bob", "987654321");
        phoneBook.add("Alice", "999999999");

        List<String> aliceNumbers = phoneBook.find("Alice");
        System.out.println(aliceNumbers);

        List<String> charlieNumbers = phoneBook.find("Charlie");
        System.out.println(charlieNumbers);

    }

    public task_1() {
        this.book = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = book.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        book.put(name, numbers);
    }

    public List<String> find(String name) {
        return book.getOrDefault(name, new ArrayList<>());
    }
}
