package Unit_8.Task_3;

/*
Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны - верните нулевой массив длины 1.
Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
Пример


a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3};

Вывод: [3, 3, 3]

a = new int[]{4, 5, 6}; */

import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Both arrays must be of the same length");
        }

        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer{
        public static void main(String[] args) {
            int[] a = {4, 5, 6};
            int[] b = {1, 2, 3};

            Answer ans = new Answer();
            int[] result = ans.subArrays(a, b);
            System.out.println(Arrays.toString(result));
        }
    }

}