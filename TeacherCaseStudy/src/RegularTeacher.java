public class RegularTeacher extends Teacher{
    private String teacherName;
    private double salary;

    public RegularTeacher(String courseName, int totalLecture, String teacherName, double salary) {
        super(courseName, totalLecture);
        this.teacherName = teacherName;
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double computeSalary() {
        return this.getSalary();
    }

    @Override
    public String toString() {
        return String.format("Regular Teacher \tTeacher Name: %s\t %s\tMonthly Salary: %f",this.getTeacherName(), super.toString(), this.computeSalary());
    }
}
