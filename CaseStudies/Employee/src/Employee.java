import java.util.Scanner;

public class Employee {
    //    instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    //    getter and setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.firstName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setMonthlySalary(double salary) {
        this.monthlySalary = salary;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    //    member function
    public void userInput(Scanner sc) {
        System.out.print("Please Enter the First Name: ");
        this.firstName = sc.nextLine();
        System.out.print("Please Enter the Last Name: ");
        this.lastName = sc.nextLine();
        System.out.print("Please Enter the Monthly Salary: ");
        this.monthlySalary = sc.nextDouble();
    }

    public void showEmployeeInfo() {
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("\tFirst Name : " + this.firstName);
        System.out.println("\tLast Name : " + this.lastName);
        System.out.println("\tMonthly Salary : " + this.monthlySalary);
        System.out.println("-----------------------------------------------------------------\n");
    }

    public void showYearlySalary() {
        double yearlySalary = this.monthlySalary * 12;
        System.out.printf("The Yearly Salary is %f \n", yearlySalary);
    }

    public void riseSalaryByTenPercent() {
        double increment = (this.monthlySalary * 10) / 100;
        this.monthlySalary += increment;
    }

}
