public class CommissionPlusBasedSalaryEmployee extends Employee {
    private double baseSalary;
    private double commissionRate;
    private int grossSale;

    public CommissionPlusBasedSalaryEmployee(String employeesName, String employeesId, double baseSalary, double commissionRate, int grossSale) {
        super(employeesName, employeesId);
        this.baseSalary = baseSalary;
        setCommissionRate(commissionRate);
        setGrossSale(grossSale);
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(int grossSale) {
        if(grossSale < 0) {
            throw new IllegalArgumentException("Gross sale must be greater than 0");
        }
        this.grossSale = grossSale;
    }

    public double calSalary() {
        return baseSalary + (commissionRate * grossSale);
    }

    @Override
    public String toString() {
        return String.format("%s\n Base Salary : %f Commission Rate : %f %%  GrossSale ; %d \n Total Salary : %f ", super.toString(), this.baseSalary, this.commissionRate, this.grossSale, this.calSalary());

    }
}
