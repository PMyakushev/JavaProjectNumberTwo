package Unit_4.HomeWork.Ex3;


public interface Operation<T extends Number> {
    T calculate(T a, T b);
}

    class Sum<T extends Number> implements Operation<T> {
    @Override
    public T calculate(T a, T b) {
        return (T) (Number) (a.doubleValue() + b.doubleValue());
    }
}

    class Subtract<T extends Number> implements Operation<T> {
    @Override
    public T calculate(T a, T b) {
        return (T) (Number) (a.doubleValue() - b.doubleValue());
    }
}

    class Multiply<T extends Number> implements Operation<T> {
    @Override
    public T calculate(T a, T b) {
        return (T) (Number) (a.doubleValue() * b.doubleValue());
    }
}

    class Divide<T extends Number> implements Operation<T> {
    @Override
    public T calculate(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (T) (Number) (a.doubleValue() / b.doubleValue());
    }
}


