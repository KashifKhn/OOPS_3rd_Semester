public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kashif", 12345, 99, 60000.0);
//        Employee employee2 = new Employee(employee1);
        Employee employee2 = new Employee("Khan", 98765, 199, 60000.0);
        employee1.displayEmployeeInfo();
        employee2.displayEmployeeInfo();
        System.out.println();
        employee1.compareSalary(employee2);
        System.out.println();
//        employee1.giveRise(100);
//        employee2.giveRise(5);
        employee1.displayEmployeeInfo();
        employee2.displayEmployeeInfo();
        System.out.println();
        employee1.compareSalary(employee2);
    }
}