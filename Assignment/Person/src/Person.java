public class Person {
    public String name;
    private int age;

    //    Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    //    getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
            return;
        }
        System.out.println("Age must be greater than 0");
        this.age = 1;
    }

//    member Method

    public void displayPersonInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public void compareAges(Person other) {
        if (this.age > other.age) {
            System.out.println(this.name + " is older than " + other.name);
            return;
        }
        if (this.age < other.age) {
            System.out.println(this.name + " is younger than " + other.name);
            return;
        }
        System.out.println(this.name + " is the same age as " + other.name);
    }
}
