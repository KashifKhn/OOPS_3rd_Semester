public class CommissionEmployee extends Employee {

    private double commissionRate;
    private int grossSale;

    public CommissionEmployee(String employeesName, String employeesId, double commissionRate, int grossSale) {
        super(employeesName, employeesId);
        setGrossSale(grossSale);
        setCommissionRate(commissionRate);
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

    private double calSalary() {
        return this.commissionRate * this.grossSale;
    }

    @Override
    public String toString() {
        return String.format("%s\n Commission Rate: %f \nGrossSale : %d\nTotal Salary %f", super.toString(), this.commissionRate, this.grossSale, this.calSalary());
    }
}
