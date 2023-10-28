import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    private String semester;
    private String section;
    private ArrayList<Student> students = new ArrayList<>();

    public Students(String semester, String section) {
        this.semester = semester;
        this.section = section;
    }
    private void addStudent(Student student) {
        if (!this.students.contains(student)) {
            this.students.add(student);
            System.out.println("Student Added Successfully");
            return;
        }
        System.out.println("Student Already Added");
    }

    private void removeStudent(Student student) {
        if (this.students.remove(student)) {
            System.out.println("Student Removed Successfully");
            return;
        }
        System.out.println("Student Not Found");
    }

    private void displayStudents() {
        for (Student student : this.students)
            System.out.println(student);
    }

    private void searchStudent(String regNum) {
        for (Student student : this.students) {
            if (student.getRegNum().equals(regNum)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public void StudentPortal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Student Portal =====");
        String continues = "-1";
        do {

            System.out.println("=============================================");
            System.out.println("Enter");
            System.out.println("\t1 for Add Student");
            System.out.println("\t2 for Remove Student");
            System.out.println("\t3 for Show Students");
            System.out.println("\t4 for Search Student");
            System.out.println("===============================================");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Student Name");
                    String name = sc.nextLine();
                    System.out.println("Enter Student Reg Num");
                    String regNum = sc.nextLine();
                    Student student = new Student(regNum, name);
                    addStudent(student);

                    break;
                case 2:
                    System.out.println("Enter Student Reg Num");
                    regNum = sc.nextLine();
                    student = new Student(regNum, "");
                    removeStudent(student);
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    System.out.println("Enter Student Reg Num");
                    regNum = sc.nextLine();
                    searchStudent(regNum);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Enter 0 to Exit OR any Other Key To continue");
            continues = sc.nextLine();
        } while (!continues.equals("0"));
    }
}
