package Unit_7.HomeWork;
/*
Класс для представления комплексных чисел
 */
public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Геттеры и сеттеры
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", imag=" + imag +
                '}';
    }
}
