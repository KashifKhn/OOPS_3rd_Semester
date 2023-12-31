public class GradeBook {
    String courseTitle;
    String courseCode;
    String courseInstructor;
    Student [] students;

    public GradeBook(String courseTitle, String courseCode, String courseInstructor, Student [] students) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.courseInstructor = courseInstructor;
        this.students = students;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    private void printHeader() {
        System.out.println("====================================================");
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Instructor: " + courseInstructor);
        System.out.println("====================================================");
        System.out.println();
    }

    private void printStudentMarks() {
        System.out.printf("%15s %20s", "Name", "Reg No");
        for(int i = 0; i < this.students[0].getMark().length; i++)
            System.out.printf("%15s%d","Assessment", i + 1);
        System.out.println();
        for(Student student: this.students) {
            System.out.printf("%15s %20s", student.getName(), student.getRegNumber());
            for (double mark : student.getMark()) {
                System.out.printf("%16s",mark);
            }
        System.out.println();
        }
        System.out.println("====================================================");
        System.out.println();
    }

    public void processGrades() {
        printHeader();
        printStudentMarks();
    }
}
