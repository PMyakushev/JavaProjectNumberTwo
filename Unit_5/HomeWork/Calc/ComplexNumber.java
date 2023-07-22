package Unit_5.HomeWork.Calc;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }


    public ComplexNumber add(ComplexNumber other) {
        double resultRealPart = this.realPart + other.realPart;
        double resultImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double resultRealPart = this.realPart - other.realPart;
        double resultImaginaryPart = this.imaginaryPart - other.imaginaryPart;

        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }

    public ComplexNumber Multiplication(ComplexNumber other) {
        double resultRealPart = this.realPart * other.realPart;
        double resultImaginaryPart = this.imaginaryPart * other.imaginaryPart;

        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }
    public ComplexNumber Division(ComplexNumber other) {
        if(other.realPart == 0 || other.imaginaryPart == 0) {
            throw new ArithmeticException("Division by zero");
        }

        double resultRealPart = this.realPart / other.realPart;
        double resultImaginaryPart = this.imaginaryPart / other.imaginaryPart;

        return new ComplexNumber(resultRealPart, resultImaginaryPart);
    }


    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart;
    }
}
