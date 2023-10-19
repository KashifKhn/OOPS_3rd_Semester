import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter course title: ");
        String courseTitle = sc.nextLine();
        System.out.print("Please Enter course code: ");
        String courseCode = sc.nextLine();
        System.out.print("Please Enter course instructor: ");
        String courseInstructor = sc.nextLine();
        System.out.print("Please Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        Student [] students = new Student[numberOfStudents];
        System.out.print("Please Enter number of Student: ");
        int numberOfSubjects = sc.nextInt();
        for(int i = 0; i < numberOfStudents; i++) {
            System.out.print("Please Enter student name: ");
            String name = sc.next();
            System.out.print("Please Enter student reg number: ");
            String regNumber = sc.next();
            double [] marks = new double[numberOfSubjects];
            for(int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Please Enter mark for Assessment " + (j + 1) + ": ");
                marks[j] = sc.nextDouble();
            }
            students[i] = new Student(name, regNumber, marks);
        }
        GradeBook gradeBook = new GradeBook(courseTitle, courseCode, courseInstructor, students);
        gradeBook.processGrades();
    }
}