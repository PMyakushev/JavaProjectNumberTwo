package Unit_4.HomeWork.Ex3.Binar;

import Unit_4.HomeWork.Ex3.*;

public class Main {
    public static void main(String[] args) {
//        Calculator<Double> calculatorSum = new Calculator<>(5.0, 3.0, new Sum<>());
        BinaryCalculator<Double> BinaryCalculatorsum = new BinaryCalculator<>();
        System.out.println("BinaryCalculatorsum.toBinaryString = " + BinaryCalculatorsum.toBinaryString(5.125));
        System.out.println("BinaryCalculatorsum.toBinaryStringTwo = " + BinaryCalculatorsum.toBinaryStringTwo("100"));


//        System.out.println(calculatorSum.performOperation());
    }
}
