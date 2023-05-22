package Seminar06HomeWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("ASUS VivoBook PRO 15", 8, 512,
                "GeForce GTX 1650 4 ГБ", "Без ОС",
                "AMD Ryzen 5 5600H", 54999);
        Notebook notebook2 = new Notebook("MSI GF63 Thin", 8, 512,
                "GeForce RTX 3050 4 ГБ", "Без ОС",
                "Intel Core i5-11400H", 68999);
        Notebook notebook3 = new Notebook("Acer Aspire 7", 16, 512,
                "GeForce RTX 3050 4 ГБ", "Без ОС",
                "AMD Ryzen 7 5700U", 74999);
        Notebook notebook4 = new Notebook("ASUS TUF Gaming F17", 16, 512,
                "GeForce RTX 2050 4 ГБ", "Без ОС",
                "Intel Core i5-11400H", 79999);
        Notebook notebook5 = new Notebook("MSI Katana GF66", 16, 512,
                "GeForce RTX 3060 6 ГБ", "Windows 11 Home Single Language",
                "Intel Core i5-12450H", 99999);
        Notebook notebook6 = new Notebook("Apple MacBook Pro", 8, 256,
                "Apple M2 10-core", "macOS",
                "Apple M2", 114999);
        Notebook notebook7 = new Notebook("Acer Aspire 3", 4, 1000,
                "Intel UHD Graphics 605", "Windows 10 Home Single Language",
                "Intel Pentium Silver N5000", 29999);
        Notebook notebook8 = new Notebook("Lenovo IdeaPad L340", 8, 128,
                "AMD Radeon Vega 3", "Без ОС",
                "AMD Athlon 300U", 30999);
        Notebook notebook9 = new Notebook("Ноутбук Maibenben M543", 16, 512,
                "AMD Radeon Graphics", "Linux",
                "AMD Ryzen 3 4300U", 37299);
        Notebook notebook10 = new Notebook("Maibenben M555", 8, 512,
                "AMD Radeon Graphics", "Linux",
                "AMD Ryzen 5 5500U", 37499);
        Notebook notebook11 = new Notebook("Maibenben X558", 16, 512,
                "GeForce RTX 3060 6 ГБ", "Linux",
                "AMD Ryzen 7 5800H", 81499);
        Notebook notebook12 = new Notebook("MSI Titan GT77 HX", 32, 2000,
                "GeForce RTX 4090 16 ГБ", "Windows 11 Home Single Language",
                "Intel Core i9-13980HX", 488999);
        Notebook notebook13 = new Notebook("MSI CreatorPro Z17", 64, 2000,
                "RTX A5500 16 ГБ", "Windows 11 Pro",
                "Intel Core i9-12900H", 505999);
        Notebook notebook14 = new Notebook("Samsung Book3 Ultra", 32, 1000,
                "GeForce RTX 4070 8 ГБ", "Windows 11 Home",
                "Intel Core i9-13900H", 419999);
        Notebook notebook15 = new Notebook("Apple MacBook Pro", 16, 1024,
                "Apple M1 Pro 16-core", "macOS",
                "Apple M1 Pro", 223999);
        Notebook notebook16 = new Notebook("ASUS VivoBook PRO 15", 8, 512,
                "GeForce GTX 1650 4 ГБ", "Без ОС",
                "AMD Ryzen 5 5600H", 54999); // совпадает с notebook1

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);
        notebooks.add(notebook11);
        notebooks.add(notebook12);
        notebooks.add(notebook13);
        notebooks.add(notebook14);
        notebooks.add(notebook15);
        notebooks.add(notebook16);

        NotebookFilter notebookFilter = new NotebookFilter(notebooks);
        notebookFilter.filterNotebooks();

    }
}

