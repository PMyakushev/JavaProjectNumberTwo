package Unit_9.Task_1;

import java.util.Scanner;
/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Main {
    public static void main(String[] args) {
        float userInput = getUserInput();
        System.out.println("Вы ввели: " + userInput);
    }

    private static float getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");

        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Это не дробное число. Попробуйте снова: ");
            }
        }
    }
}
