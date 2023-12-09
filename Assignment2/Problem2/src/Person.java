import java.util.Scanner;

public abstract class Person implements Award {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public Person() {
        setName("Unknown");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getDataFromUser(Scanner sc) {
        System.out.print("Enter The Name:...");
        setName(sc.nextLine());
    }

    public String  displayData() {
        return String.format("Name: %s \n", this.getName());
    }


}
