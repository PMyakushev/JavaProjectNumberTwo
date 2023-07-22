package Unit_7.HomeWork;
/*
Классы, представляющие конкретные операции
 */
public class DivisionOperation extends ComplexOperation {
    @Override
    public ComplexNumber perform(ComplexNumber num1, ComplexNumber num2) {
        double denom = Math.pow(num2.getReal(), 2) + Math.pow(num2.getImag(), 2);
        double real = (num1.getReal() * num2.getReal() + num1.getImag() * num2.getImag()) / denom;
        double imag = (num1.getImag() * num2.getReal() - num1.getReal() * num2.getImag()) / denom;
        return new ComplexNumber(real, imag);
    }
}
