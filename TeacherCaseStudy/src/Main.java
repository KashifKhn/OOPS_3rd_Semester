public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new RegularTeacher("OOP", 32, "Dr Waqas", 100000);
        Teacher teacher2 = new VisitingTeacher("C++", 20, "Dr Zainab", 2000);
        System.out.println(teacher1);
        System.out.println(teacher2);
    }
}