package Seminar06HomeWork;

import java.util.*;

public class NotebookFilter {
    private Set<Notebook> notebooks;

    public NotebookFilter(Set<Notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public void filterNotebooks() {
        Map<String, Object> filters = getFiltersFromUser();
        Set<Notebook> filteredNotebooks = applyFilters(filters);

        System.out.println("Результаты фильтрации:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }

    private Map<String, Object> getFiltersFromUser() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        System.out.println("Выберите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Модель");
        System.out.println("2 - Объем памяти");
        System.out.println("3 - Объем диска");
        System.out.println("4 - Видеокарта");
        System.out.println("5 - Операционная система");
        System.out.println("6 - Модель процессора");
        System.out.println("7 - Цена");
        System.out.println("8 - Выход");

        boolean exit = false;
        while (!exit) {
            System.out.print("Введите цифру: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите модель: ");
                    String model = scanner.nextLine();
                    filters.put("model", model);
                    break;
                case 2:
                    System.out.print("Введите минимальный объем памяти (в ГБ): ");
                    int minMemory = scanner.nextInt();
                    filters.put("memorySize", minMemory);
                    break;
                case 3:
                    System.out.print("Введите минимальный объем диска (в ГБ): ");
                    int minDisk = scanner.nextInt();
                    filters.put("diskSize", minDisk);
                    break;
                case 4:
                    System.out.print("Введите фразу для фильтрации видеокарты: ");
                    String videoCardFilter = scanner.nextLine();
                    filters.put("videoCardFilter", videoCardFilter);
                    break;
                case 5:
                    System.out.print("Введите фразу для фильтрации операционной системы: ");
                    String osFilter = scanner.nextLine();
                    filters.put("osFilter", osFilter);
                    break;
                case 6:
                    System.out.print("Введите фразу для фильтрации модели процессора: ");
                    String processorFilter = scanner.nextLine();
                    filters.put("processorFilter", processorFilter);
                    break;
                case 7:
                    System.out.print("Введите минимальную цену: ");
                    int minPrice = scanner.nextInt();
                    filters.put("minPrice", minPrice);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, выберите снова.");
                    break;
            }
        }

        return filters;
    }

    private Set<Notebook> applyFilters(Map<String, Object> filters) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            boolean matchesFilters = true;

            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                switch (key) {
                    case "model":
                        if (!notebook.getModel().toLowerCase().contains(value.toString().toLowerCase())) {
                            matchesFilters = false;
                        }
                        break;
                    case "memorySize":
                        if (notebook.getValueMemory() < (int) value) {
                            matchesFilters = false;
                        }
                        break;
                    case "diskSize":
                        if (notebook.getValueDisk() < (int) value) {
                            matchesFilters = false;
                        }
                        break;
                    case "videoCardFilter":
                        if (!notebook.getVideoCard().toLowerCase().contains(value.toString().toLowerCase())) {
                            matchesFilters = false;
                        }
                        break;
                    case "osFilter":
                        if (!notebook.getOperatingSystem().toLowerCase().contains(value.toString().toLowerCase())) {
                            matchesFilters = false;
                        }
                        break;
                    case "processorFilter":
                        if (!notebook.getProcessorModel().toLowerCase().contains(value.toString().toLowerCase())) {
                            matchesFilters = false;
                        }
                        break;
                    case "minPrice":
                        if (notebook.getPrice() < (int) value) {
                            matchesFilters = false;
                        }
                        break;
                    default:
                        System.out.println("Некорректный критерий фильтрации: " + key);
                        break;
                }

                if (!matchesFilters) {
                    break;
                }
            }

            if (matchesFilters) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}

