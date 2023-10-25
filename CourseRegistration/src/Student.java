import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String name;
    private String regNum;
    private ArrayList<Course> courses = new ArrayList<>();
    private int totalCreditHours;

    public Student(String regNum, String name) {
        this.name = name;
        this.regNum = regNum;
    }

    private void addCourse(Course course) {
        int MAX_CREDIT_HOURS = 21;
        if (totalCreditHours <= MAX_CREDIT_HOURS) {
            if (!courses.contains(course)) {
                courses.add(course);
                totalCreditHours += course.getCourseCreditHours();
                System.out.println("Course Register Successfully");
                return;
            }
            System.out.println("Course Already Register");
            return;
        }
        System.out.println("Can't Exceed Max Credit Hours ");
    }

    private void removeCourse(Course course) {
        if (courses.remove(course)) {
            System.out.println("Course Register Successfully");
            return;
        }
        System.out.println("Course Already Register");
    }

    private void displayRegCourse() {
        for(Course course : courses)
            System.out.println(course);
    }

    public void CoursePortal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Course Portal =====");
        String continues = "-1" ;
        do {

            System.out.println("=============================================");
            System.out.println("Enter");
            System.out.println("\t1 for Add Course");
            System.out.println("\t2 for Remove Course");
            System.out.println("\t3 for Show Courses");
            System.out.println("===============================================");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("========== Add Course Menu ==========");
                System.out.println("Enter the Course Code");
                String courseCode = sc.nextLine();
                System.out.println("Enter the Course Title");
                String courseTitle = sc.nextLine();
                System.out.println("Enter the Course Credit Hours");
                int creditHours = sc.nextInt();
                addCourse(new Course(courseCode, courseTitle, creditHours));
            } else if (choice == 2) {
                System.out.println("========== Remove Course Menu ==========");
                System.out.println("Enter the Course Code");
                String courseCode = sc.nextLine();
                for (Course course : courses) {
                    if (Objects.equals(course.getCourseCode(), courseCode)) {
                        removeCourse(course);
                        return;
                    }
                }
                System.out.println("Course Not Exist");
            } else if (choice == 3) {
                System.out.println("========== Display Course Menu ==========");
                displayRegCourse();
            } else {
                System.out.println("Invalid Choice");
            }
            System.out.println();
            System.out.println("Enter 0 to Exit OR any Other Key To continue");
            sc.nextLine();
            continues = sc.nextLine();
        }while (!continues.equals("0"));
    }

    public void displayStudentInfo() {
        System.out.println("================================");
        System.out.println("Name: " + this.name);
        System.out.println("Name: " + this.regNum);
        System.out.println();
        displayRegCourse();
    }
}
