package Unit_4.HomeWork.Ex3;

public class Calculator<T extends Number> {
    private T a;
    private T b;
    private Operation<T> operation;

    public Calculator(T a, T b, Operation<T> operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public T performOperation() {
        return this.operation.calculate(this.a, this.b);
    }


}