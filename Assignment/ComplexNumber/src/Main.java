public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, -2);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        c1.printComplexNumber();
        c2.printComplexNumber();
        System.out.println("add");
        ComplexNumber c5 = c1.add(c2);
        c5.printComplexNumber();
        System.out.println("multiply");
        ComplexNumber c6 = c1.multiply(c2);
        c6.printComplexNumber();
        System.out.println("conjugate");
        ComplexNumber c7 = c1.conjugate();
        c7.printComplexNumber();
        ComplexNumber c8 = c2.conjugate();
        c8.printComplexNumber();
    }
}