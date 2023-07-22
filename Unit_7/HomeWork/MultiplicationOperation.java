package Unit_7.HomeWork;
/*
Классы, представляющие конкретные операции
 */
public class MultiplicationOperation extends ComplexOperation {
    @Override
    public ComplexNumber perform(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImag() * num2.getImag();
        double imag = num1.getReal() * num2.getImag() + num1.getImag() * num2.getReal();
        return new ComplexNumber(real, imag);
    }
}
