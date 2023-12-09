import java.lang.annotation.Documented;

public class Employee {
    private String  employeesName ;
    private String EmployeesId;

    public Employee(String employeesName, String employeesId) {
        this.employeesName =employeesName;
        this.EmployeesId = employeesId;
    }

    @Override
    public String toString() {
        return String.format("Employee Name : %S \nEmployee Id %s", this.employeesName, this.EmployeesId);
    }

}
