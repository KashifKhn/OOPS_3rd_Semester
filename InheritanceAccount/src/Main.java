public class Main {
    public static void main(String[] args) {
        WeekSalaryEmployee employee1 = new WeekSalaryEmployee("John", "Smith", 1000);
        HourlySalaryEmployee employee2 = new HourlySalaryEmployee("John", "Smith", 1000, 44);
        CommissionEmployee employee3 = new CommissionEmployee("John", "Smith", 0.1, 1000);
        CommissionPlusBasedSalaryEmployee employee4 = new CommissionPlusBasedSalaryEmployee("John", "Smith", 4000, 0.1, 50);
        System.out.println(employee1);
        System.out.println();
        System.out.println(employee2);
        System.out.println();
        System.out.println(employee3);
        System.out.println();
        System.out.println(employee4);
    }
}