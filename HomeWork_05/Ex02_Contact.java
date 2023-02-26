package Examples.HomeWork_05;

import java.util.*;
/**
 * Пусть дан список сотрудников.
 * Написать программу, которая найдет и выведет повторяющееся имена с  количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class Ex02_Contact {
    static String s = """
            Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, 
            Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, 
            Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов""";
    static Map<String, Integer> employeesMap = new HashMap<>();

    public static void main(String[] args) {


        for (String line : s.split(", ")) {
            String name = line.split(" ")[0];


            if (!employeesMap.containsKey(name)) employeesMap.put(name, 1);
            else employeesMap.put(name, employeesMap.get(name) + 1);
        }


        Map<Integer, ArrayList<String>> sortedMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : employeesMap.entrySet()) {
            if (entry.getValue() > 1) {
                if (!sortedMap.containsKey(entry.getValue()))
                    sortedMap.put(entry.getValue(), new ArrayList<>(List.of(entry.getKey())));
                else sortedMap.get(entry.getValue()).add(entry.getKey());
            }
        }


        sortedMap = new TreeMap<>(sortedMap).descendingMap();


        for (int key : sortedMap.keySet()) {
            for (String val : sortedMap.get(key)) {
                System.out.printf("%s - %d \n", val, key);
            }
        }
    }
}

