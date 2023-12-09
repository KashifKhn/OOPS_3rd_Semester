public class CommissionEmpolyee extends Empolyee {

    public CommissionEmpolyee(String empID, String empName, double commRate, double grossSale) {
        super(empID, empName, commRate, grossSale);
    }

    public double earnings() {
        return getCommissionRate() * getGrossSale();
    }

    @Override
    public String toString() {
        return String.format("%sEarnings: %.2f\n", super.toString(), earnings());
    }

}
