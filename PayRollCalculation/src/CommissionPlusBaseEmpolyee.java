public class CommissionPlusBaseEmpolyee extends Empolyee{
    private double baseSalary;

    public CommissionPlusBaseEmpolyee(String empID, String empName, double commRate, double grossSale, double baseSalary) {
        super(empID, empName, commRate, grossSale);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary > 0) {
            this.baseSalary = baseSalary;
            return;
        }
        System.out.println("Invalid base salary");
        this.baseSalary = 1;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSale() +  getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%sBase Salary: %.2f\nEarning: %f", super.toString(), baseSalary, earnings());
    }
}
