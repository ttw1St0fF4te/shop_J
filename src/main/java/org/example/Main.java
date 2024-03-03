package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] brands = {"РОЛЕКSSЫ", "ТЭG ХЭУVЭР", "ГУБКА"}; // Массив с названиями фирм часов
        String[][] brandsInfo = { {brands[0], "ПАЭЛ НОВЫЙМЭН"}, {brands[1], "КАРРЕРА ДОФИГАЛИОН"}, {brands[2], "БОБ"} }; // Двумерный массив для связывания фирм с марками
        ArrayList<String[]> customers = new ArrayList<>(); // Создание списка покупателей с помощью ArrayList

        for (int i = 0; i < 3; i++) { // Создание 3 заказов
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите инициалы: "); // Получение данных от пользователя
            String initials = scanner.nextLine();
            System.out.println("Введите email:");
            String email = scanner.nextLine();
            System.out.println("Введите номер телефона:");
            String phone = scanner.nextLine();

            System.out.println("Каталог товаров:"); // Вывод списка товаров
            for (int k = 0; k < brands.length; k++)
                System.out.println(k + 1 + ". " + brands[k] + " - " + brandsInfo[k][1]);

            System.out.println("Выберите товар:"); // Выбор товара
            int index = scanner.nextInt();
            index = index - 1; // Уменьшаем на 1, так как индексы начинаются с 0

            System.out.println("Введите количество товара:"); // Ввод количества
            int amount = scanner.nextInt();

            // Создание массива данных покупателя
            String[] customersInfo = {initials, email, phone, brands[index], brandsInfo[index][1], String.valueOf(amount)};
            // Добавление в список
            customers.add(customersInfo);
        }

        for (int i = 0; i < customers.size(); i++) {
            for (int j = 0; j < customers.get(i).length; j++) {
                System.out.print(customers.get(i)[j]);
                System.out.print("\n");
            }
        }
    }
}