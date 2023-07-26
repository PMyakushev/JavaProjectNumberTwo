package Unit_9.Task_4;

import java.util.Scanner;
/*
Разработайте программу, которая выбросит Exception,
когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите вашу строку: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Ошибка: пустые строки вводить нельзя.");
        }

        System.out.println("Вы ввели: " + input);
    }
}