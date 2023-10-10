public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Kashif", 12);
        Person person2 = new Person("Khan", 14);
        person1.displayPersonInfo();
        person2.displayPersonInfo();
        person1.compareAges(person2);
    }
}