package Unit_4.HomeWork.Ex3;

public class Main {
    public static void main(String[] args) {
        Calculator<Double> calculatorSum = new Calculator<>(5.0, 3.0, new Sum<>());
        Calculator<Double> calculatorSubtract = new Calculator<>(5.0, 3.0, new Subtract<>());
        Calculator<Double> calculatorMultiply = new Calculator<>(5.0, 3.0, new Multiply<>());
        Calculator<Double> calculatorDivide = new Calculator<>(5.0, 3.0, new Divide<>());

        System.out.println(calculatorSum.performOperation());
        System.out.println(calculatorSubtract.performOperation());
        System.out.println(calculatorMultiply.performOperation());
        System.out.println(calculatorDivide.performOperation());
    }
}
