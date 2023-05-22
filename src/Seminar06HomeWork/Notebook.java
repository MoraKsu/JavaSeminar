package Seminar06HomeWork;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому
критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

import java.util.Objects;

public class Notebook {
    private String model;
    private int valueMemory;
    private int valueDisk;
    private String videoCard;
    private String operatingSystem;
    private String processorModel;
    private int price;

    public Notebook(String model, int valueMemory, int valueDisk, String videoCard,String operatingSystem, String processorModel,
                    int price){
        this.model = model;
        this.valueMemory = valueMemory;
        this.valueDisk = valueDisk;
        this.videoCard = videoCard;
        this.operatingSystem = operatingSystem;
        this.processorModel = processorModel;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getValueMemory() {
        return valueMemory;
    }

    public int getValueDisk() {
        return valueDisk;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    @Override
    public String toString() {
        return "Notebook: " +
                "модель='" + model + '\'' +
                ", ОЗУ=" + valueMemory +
                ", SSD/HDD=" + valueDisk +
                ", видеокарта='" + videoCard + '\'' +
                ", ОС='" + operatingSystem + '\'' +
                ", процессор='" + processorModel + '\'' +
                ", цена=" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Notebook other = (Notebook) obj;
        return Objects.equals(model, other.model)
                && valueMemory == other.valueMemory
                && valueDisk == other.valueDisk
                && Objects.equals(videoCard, other.videoCard)
                && Objects.equals(operatingSystem, other.operatingSystem)
                && Objects.equals(processorModel, other.processorModel)
                && price == other.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, valueMemory, valueDisk, videoCard, operatingSystem, processorModel, price);
    }
}

