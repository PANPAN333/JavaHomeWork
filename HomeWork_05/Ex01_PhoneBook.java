package Examples.HomeWork_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01_PhoneBook {
    static Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        chooseOperation();
        for (Map.Entry<String, ArrayList<String>> contact : phoneBook.entrySet()) {
            System.out.printf("%s, %s\n", contact.getKey(), contact.getValue());
        }
    }

    /**
     * Выбор операции над телефонной книгой
     */
    private static void chooseOperation() {
        System.out.println("""
                Выберите операцию:
                1 - новый контакт
                2 - добавить номер к существующему контакту
                3 - завершить работу""");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> createNewContact();
            case "2" -> editContact();
            case "3" -> System.out.println("Работа завершена!");
        }
    }

    private static void createNewContact() {
        System.out.print("Введите ФИО: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("\nТакой контакт уже есть");
        } else {
            ArrayList<String> number = new ArrayList<>();
            System.out.print("Введите новый номер или ! для возврата в меню: ");
            String input = scanner.nextLine();

            while (!input.equals("!")) {
                number.add(input);
                input = scanner.nextLine();
            }
            phoneBook.put(name, number);
        }
        chooseOperation();
    }

    private static void editContact() {
        System.out.print("Введите контакт: ");
        String name = scanner.nextLine();

        if (!phoneBook.containsKey(name)) {
            System.out.println("\nТакого контакта нет");
            chooseOperation();
        } else {
            System.out.print("Введите новый номер или ! для возврата в меню: ");
            String number = scanner.nextLine();

            while (!number.equals("!")) {
                phoneBook.get(name).add(number);
                number = scanner.nextLine();
            }
            chooseOperation();
        }
    }
}
