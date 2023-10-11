public class Employee {
    private String name;
    private int employeeId;
    private int age;
    private double salary;

    //   no-parameter constructor
    public Employee() {
        this.name = "Unknown";
        this.employeeId = 0;
        this.age = 0;
        this.salary = 0.0;
    }

    //  parameterized constructor
    public Employee(String name, int employeeId, int age, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        this.salary = salary;
    }

    //    copy constructor
    public Employee(Employee employee) {
        this.name = employee.name;
        this.employeeId = employee.employeeId;
        this.age = employee.age;
        this.salary = employee.salary;
    }

    //   getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void giveRise(double percentage) {
        double rise = (percentage / 100) * this.salary;
        this.salary += rise;
    }

    public void displayEmployeeInfo() {
        System.out.println("==============================================");
        System.out.println("Employee Details");
        System.out.println("\tName: " + this.name);
        System.out.println("\tEmployee ID: " + this.employeeId);
        System.out.println("\tAge: " + this.age);
        System.out.println("\tSalary: " + this.salary);
        System.out.println("===============================================");
    }

    public void compareSalary(Employee employee) {
        if (this.salary > employee.salary) {
            System.out.println(this.name + " has a higher salary than " + employee.name);
            return;
        }
        if (this.salary < employee.salary) {
            System.out.println(this.name + " has a lower salary than " + employee.name);
            return;
        }
        System.out.println(this.name + " has the same salary as " + employee.name);
    }
}
