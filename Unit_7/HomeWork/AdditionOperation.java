package Unit_7.HomeWork;
/*
Классы, представляющие конкретные операции
 */
public class AdditionOperation extends ComplexOperation {
    @Override
    public ComplexNumber perform(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() + num2.getReal();
        double imag = num1.getImag() + num2.getImag();
        return new ComplexNumber(real, imag);
    }
}
