public class ComplexNumber {
    private double real;
    private double imaginary;

    //    no-parameter constructor
    public ComplexNumber() {
        this(0, 0);
    }

    // parameterized constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //    copy constructor
    public ComplexNumber(ComplexNumber other) {
        this(other.real, other.imaginary);
    }

    //    getter and Setter
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    //    member functions

    public void printComplexNumber() {
        String sign = this.imaginary > 0 ? " + " : " - ";
        System.out.println(this.real + sign + Math.abs(this.imaginary) + "i");
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(this.real * other.real - this.imaginary * other.imaginary,
                this.real * other.imaginary + this.imaginary * other.real);
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.imaginary);
    }
}
