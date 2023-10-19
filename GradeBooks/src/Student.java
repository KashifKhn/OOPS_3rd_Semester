public class Student {
    private String name;
    private String regNumber;
    private double[] mark;

    public Student(String name, String regNumber, double[] mark) {
        this.name = name;
        this.regNumber = regNumber;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public double[] getMark() {
        return mark;
    }
}
