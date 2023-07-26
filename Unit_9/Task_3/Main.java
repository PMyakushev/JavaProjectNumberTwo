package Unit_9.Task_3;
/*
Если необходимо, исправьте данный код
Все уточняющие исключения (NullPointerException и IndexOutOfBoundsException) поставлены после основного исключения Throwable.
Throwable - это суперкласс всех исключений и ошибок в Java и,
таким образом, перехватывает все исключения. Это приведет к тому,
что уточняющие исключения больше не будут доступны для перехвата.
Поэтому, порядок перехвата ваших исключений методом catch должен идти от самого конкретного к самому общему.

Метод printSum объявлен с тем, что он выбрасывает исключение FileNotFoundException,
но в его теле не генерируется это исключение.
 */

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b){
        try{
            if(a == null || b == null){
                throw new FileNotFoundException("Null values found");
            }
            System.out.println(a + b);
        }catch(FileNotFoundException e){
            System.out.println("File not found exception occurred "+e.getMessage());
        }
    }
}
