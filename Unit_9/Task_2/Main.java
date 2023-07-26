package Unit_9.Task_2;
/*
Дан следующий код, исправьте его там, где требуется
Переменная intArray не объявлена и не инициализирована, поэтому компилятор не сможет разрешить символ intArray.
Возможно возникновение исключения ArithmeticException из-за деления на ноль,
а также исключение ArrayIndexOutOfBoundsException из-за того, что в массиве может не быть элемента с индексом 8.
Исключение ArrayIndexOutOfBoundsException не обрабатывается в операторе try-catch.
 */
public class Main {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[10];
            intArray[8] = 10;
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
