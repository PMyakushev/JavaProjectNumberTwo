package Unit_8.Task_2;

/*
Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, и
возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны - верните нулевой массив длины 1.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
int[] a - первый массив
int[] b - второй массив
Пример
a = new int[]{12, 8, 16};
b = new int[]{4, 2, 4};
 */
public class Answer {
    public int[] divArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Both arrays must be of the same length");
        }

        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] / b[i];
        }
        return result;
    }
}
