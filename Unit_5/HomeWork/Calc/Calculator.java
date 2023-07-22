package Unit_5.HomeWork.Calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Программа завершена.");
                break;
            }

            System.out.println("Введите параметры для первого числа:");
            System.out.println("Действительная часть: ");
            double realPart1 = scanner.nextDouble();
            System.out.println("Мнимая часть: ");
            double imaginaryPart1 = scanner.nextDouble();

            System.out.println("Введите параметры для второго числа:");
            System.out.println("Действительная часть: ");
            double realPart2 = scanner.nextDouble();
            System.out.println("Мнимая часть: ");
            double imaginaryPart2 = scanner.nextDouble();

            ComplexNumber complexNumber1 = new ComplexNumber(realPart1, imaginaryPart1);
            ComplexNumber complexNumber2 = new ComplexNumber(realPart2, imaginaryPart2);

            switch (choice) {
                case 1:
                    ComplexNumber sum = complexNumber1.add(complexNumber2);
                    System.out.println("Результат сложения: " + sum);
                    break;
                case 2:
                    ComplexNumber difference = complexNumber1.subtract(complexNumber2);
                    System.out.println("Результат вычетания: " + difference);
                    break;
                case 3:
                    ComplexNumber Multiplication = complexNumber1.Multiplication(complexNumber2);
                    System.out.println("Результат умножения: " + Multiplication);
                    break;
                case 4:
                    ComplexNumber Division = complexNumber1.Division(complexNumber2);
                    System.out.println("Результат Деление: " + Division);
                    break;
                case 5:
                    break;
            }
        }
    }
}

