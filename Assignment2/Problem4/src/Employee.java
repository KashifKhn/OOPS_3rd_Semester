public class Employee extends Worker {
    private String departmentName;
    private double salary;

    public Employee(String name, int workingHours, String departmentName, double salary) {
        super(name, workingHours);
        this.setDepartmentName(departmentName);
        this.setSalary(salary);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%sDepartment name: %s\nSalary: %.2f\n", super.toString(), this.getDepartmentName(), this.getSalary());
    }
}
