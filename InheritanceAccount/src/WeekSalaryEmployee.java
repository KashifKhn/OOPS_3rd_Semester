public class WeekSalaryEmployee extends Employee {
    private int  weekSalary ;
    public WeekSalaryEmployee(String employeesName, String employeesId, int weekSalary ) {
        super(employeesName, employeesId);
        this.weekSalary = weekSalary;
    }

    @Override
    public String toString() {
        return String.format("%s \nWeek Salary: %s", super.toString(), this.weekSalary);
    }
}
