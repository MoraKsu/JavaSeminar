package Seminar06;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    /*
    Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.
    */
    /*
    1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
    Создайте несколько экземпляров этого класса, выведите их в консоль.
    2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст
    (или другие параметры на ваше усмотрение).
     */
    /*
    1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
    Поместите в него некоторое количество объектов.
    2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
    Убедитесь, что все они сохранились во множество.
    3. Создайте метод public boolean equals(Object o)
    Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
    только если значения во всех полях сравниваемых объектов равны.
    4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
     */
    private String name;
    private int age;
    private String owner;
    private String breed;
    private List<String> healthHistory;

    public Cat(String name, int age, String owner, String breed){
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.breed = breed;
        healthHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", owner: " + owner + ", breed: " + breed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat)obj;
        return name.equals(cat.name) && age == cat.age && owner.equals(cat.owner) && breed.equals(cat.breed);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 11*owner.hashCode() + 17*breed.hashCode();
    }
}
