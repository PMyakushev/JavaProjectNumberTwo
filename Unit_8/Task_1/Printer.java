package Unit_8.Task_1;

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[5];
        int value = array[10];

    }

    public static void divisionByZero() {
        int numerator = 10;
        int denominator = 0;
        int result = numerator / denominator;

    }

    public static void numberFormatException() {
        String text = "abc";
        int number = Integer.parseInt(text);

    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
