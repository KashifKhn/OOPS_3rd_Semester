public class Empolyee {
    private String employeeId;
    private String employeeName;
    private double commissionRate;
    private double grossSale;

    public Empolyee(String empID, String empName, double commRate, double grossSale) {
        this.employeeId = empID;
        this.employeeName = empName;
        setCommissionRate(commRate);
        setGrossSale(grossSale);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate > 0 && commissionRate < 1) {
            this.commissionRate = commissionRate;
            return;
        }
        System.out.println("Invalid commission rate");
        this.commissionRate = 0.01;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        if(grossSale > 0) {
            this.grossSale = grossSale;
            return;
        }
        System.out.println("Invalid gross sale");
        this.grossSale = 1;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %s\nEmployee Name: %s\nCommission Rate: %.2f\nGross Sale: %.2f\n", employeeId, employeeName, commissionRate, grossSale);
    }
}
