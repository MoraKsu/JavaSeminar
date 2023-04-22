package Seminar03HomeWork;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.Collections;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Марс");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");

        Collections.sort(planets);

        int count = 1;
        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i).equals(planets.get(i-1))) {
                count++;
            } else {
                System.out.println(planets.get(i-1) + ": " + count);
                count = 1;
            }
        }
        System.out.println(planets.get(planets.size()-1) + ": " + count);
    }
}
