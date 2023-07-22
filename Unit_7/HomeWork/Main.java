package Unit_7.HomeWork;

public class Main {

    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();

        ComplexNumber number1 = new ComplexNumber(4, 3);
        ComplexNumber number2 = new ComplexNumber(2, 1);

        ComplexNumber resultAdd = calculator.calculate("add", number1, number2);
        System.out.println("Result of addition: " + resultAdd);

        ComplexNumber resultMultiply = calculator.calculate("multiply", number1, number2);
        System.out.println("Result of multiplication: " + resultMultiply);

        ComplexNumber resultDivide = calculator.calculate("divide", number1, number2);
        System.out.println("Result of division: " + resultDivide);
    }
}