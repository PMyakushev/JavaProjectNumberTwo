package Unit_7.HomeWork;

import java.util.HashMap;
import java.util.Map;

/*
Класс калькулятор
 */
public class ComplexCalculator {
    private Map<String, ComplexOperation> operations;

    public ComplexCalculator() {
        operations = new HashMap<>();
        operations.put("add", new AdditionOperation());
        operations.put("multiply", new MultiplicationOperation());
        operations.put("divide", new DivisionOperation());
    }

    public ComplexNumber calculate(String operation, ComplexNumber num1, ComplexNumber num2) {
        if(!operations.containsKey(operation)) {
            throw new IllegalArgumentException("Invalid operation");
        }
        return operations.get(operation).perform(num1, num2);
    }

}
