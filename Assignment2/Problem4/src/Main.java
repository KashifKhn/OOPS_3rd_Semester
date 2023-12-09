public class Main {
    public static void main(String[] args) {
        Worker employee = new Employee("abc", 40, "IT", 2000);
        Worker manager = new Manager("def", 40, 10, 5);
        System.out.println(employee);
        System.out.println(manager);
    }
}