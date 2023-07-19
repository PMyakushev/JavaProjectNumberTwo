package Unit_4.Practice.Ex3;

import java.util.ArrayList;
import java.util.List;

/*
3) Написать класс калькулятор, принимающий List целочисленных значений,
возвращающий сумму элементов коллекции (метод sum)
 */
public class Main {
    public static void main(String[] args) {
        Calculator call = new Calculator();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDoub = new ArrayList<>();
        List<Number> listNumber = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            listInt.add(i);
            listDoub.add(((double) i));
            listNumber.add(i);
        }
        System.out.println("call.sum(listNumber) = " + call.sum(listInt));


    }


}
