public class HourlySalaryEmployee extends Employee{
    private int hourWork;
    private double hourRate;

    public HourlySalaryEmployee(String employeesName, String employeesId, double hourRate, int hourWork) {
        super(employeesName, employeesId);
        this.hourRate = hourRate;
        this.hourWork = hourWork;
    }

    private double calSalary() {
        if(hourWork <= 40) {
            return  hourWork * hourRate;
        }
        else  {
            return (40 * hourRate) + ((hourWork - 40) * (hourRate * 1.5));
        }
    }

    @Override
    public String toString() {
        return String.format("%S \nHour Rate: %f\n Hour Work %d Total Salary is %f ",super.toString(), this.hourRate, this.hourWork, this.calSalary());
    }
}
