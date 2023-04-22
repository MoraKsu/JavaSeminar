package Seminar03;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    /*
    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
    что на 0й позиции каждого внутреннего списка содержится название жанра,
    а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
    */
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Детектив", "Шерлок холмс");
        addBook(shopBook, "Детектив", "Убийство на Ниле");
        addBook(shopBook, "Фантастика", "Гарри Поттер");
        addBook(shopBook, "Роман", "Поющие в терновнике");
        addBook(shopBook, "Фантастика", "Ночной дозор");
        addBook(shopBook, "Сказки", "Репка");

        System.out.println(shopBook);
    }

    //Детектив, Шерлок холмс, Убийство на Ниле
    //Фантастика, Гарри Поттер, Ночной дозор
    //Роман, Поющие в терновнике

    static void addBook(List<List<String>> shopBook, String genre, String name){
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)){
                List<String> list = shopBook.get(i);
                list.add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list);
    }
}
